package com.heima.one;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��servletContext��������ȡ����
public class ServletContext3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��ȡȫ�ֶ���
		ServletContext sc = this.getServletContext() ;
		
		//��sc����ȡ����
		String name = (String)sc.getAttribute("name") ;
		
		System.out.println(name);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
