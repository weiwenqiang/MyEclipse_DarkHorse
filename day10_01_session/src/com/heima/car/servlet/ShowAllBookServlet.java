package com.heima.car.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.car.bean.Book;
import com.heima.car.utils.BookUtils;
/**
 * ������������
 * 		1. ��ʾ���е������Ϣ
 * 		2. �ṩһ�����ﳵ������
 * @author Administrator
 *
 */
public class ShowAllBookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		out.write("��վ�����º��飺<br>") ;
		//1.��ʾ���е���
		//��ȡ���е���ļ���
		Map<String ,Book> map = BookUtils.getAllBook() ;
		//��������
		for (Map.Entry<String, Book> entry : map.entrySet()) {
			//�õ�ÿһ����id
			String id = entry.getKey() ;
			//�õ�ÿһ����
			Book book = entry.getValue() ;
			//����������
			out.write(book.getBookName() + "&nbsp;&nbsp;<a href = '"+ request.getContextPath()+"/servlet/ShowBookDetailServlet?id=" + id +"'>��ʾ��ϸ��Ϣ</a><br>") ;
		}
		out.write("<br><br><br><br>") ;
		
		//�ṩ�鿴���ﳵ������
		out.write("<a href = '"+ request.getContextPath()+"/servlet/CarServlet'>�鿴���ﳵ</a>") ;
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
