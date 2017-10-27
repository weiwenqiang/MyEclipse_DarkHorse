package com.heima.car.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.heima.car.bean.Book;
import com.heima.car.utils.BookUtils;
//��servlet�ǽ����������빺�ﳵ
public class BuyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		//��ȡҳ�洫�ݵ�id
		String id = request.getParameter("id") ;
		
		//����id�ҵ������
		Book book = BookUtils.getBookById(id) ;
		
		//�������session������
		HttpSession session  = request.getSession() ;

		//�������session�е�һ��������
		List<Book> list = (List<Book>) session.getAttribute("carlist") ;
		
		if(list == null){
			//˵����һ�ι����鼮����ʱsession���ǲ�����list���ϣ���Ҫ�ֶ�����
			list = new ArrayList<Book>() ;
			//��������鼮����
			book.setCount(1) ;
			list.add(book) ;
			
			//��list����session
			session.setAttribute("carlist", list) ;
		}else{
			//˵���Ѿ�������鼮��
			//�жϹ��ﳵ���Ƿ��Ѿ����������
			int index = list.indexOf(book) ;
			if(index == -1){
				//˵��û���������
				book.setCount(1) ;
				list.add(book) ;
			}else{
				//˵�������
				Book b = list.get(index) ;
				b.setCount(b.getCount() + 1) ;
				
			}
			
			//�����û��������Ѿ����빺�ﳵ��
			out.write(book.getBookName() + " �Ѿ����빺�ﳵ��,4���ת����ҳ���ͼ�<a href = '"+request.getContextPath()+"/servlet/ShowAllBookServlet'>�˴�</a>ֱ��ת����ҳ") ;
			response.setHeader("Refresh", "4;url="+ request.getContextPath() + "/servlet/ShowAllBookServlet") ;
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
