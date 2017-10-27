package com.heima.car.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.heima.car.bean.Book;
//��ʾ���ﳵ�е�����
public class CarServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		 HttpSession session = request.getSession() ;
		//����û�ֱ���ڵ�ַ���������ַ���ʴ�servlet,�Ǵ�ʱsession��һ���´����Ķ���
		 if(session.isNew()){
			 //ֱ�ӷ�����ҳ��
			 response.sendRedirect(request.getContextPath() + "/servlet/ShowAllBookServlet") ;
			 return ;
		 }
		 
		//�ȴ�session�õ����ﳵ
		List<Book> list = (List<Book>)session.getAttribute("carlist") ; 
		//����û�ֱ�Ӵ���ҳ���ϵ���鿴���ﳵ����,��ʱ��û�й����κ��鼮�أ�������ʾ�û�����ҳ
		if(list == null){
			//�û��״η��ʹ��ﳵ
			out.write("�㻹û�й����κ��鼮�أ�������,2���ת����ҳ") ;
			response.setHeader("Refresh", "2;url="+ request.getContextPath() + "/servlet/ShowAllBookServlet") ;
			return ;
		}
		 
		//˵���������鼮
		out.write("�㹺����鼮���£�<br> ") ;
		out.write("����\t����\t�ܼ۸�<br>") ;
		for (int i = 0; i < list.size(); i++) {
			Book b = list.get(i) ;
			out.write(b.getBookName() + "\t" + b.getCount() + "\t" + b.getPrice() * b.getCount() + "<br>") ;
		}
		
		
		out.write("<br><br><a href = '" +request.getContextPath()+ "/servlet/ShowAllBookServlet'>������ҳ��</a>") ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
