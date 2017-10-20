package com.heima.two;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ȡȫ�����ò���
public class ServletContext4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�õ�ȫ�ֶ���
		ServletContext sc = this.getServletContext() ;
		//��ȡ�������ò���(��ȡ����)
//		String name = sc.getInitParameter("name") ;
//		System.out.println(name);
		
		//��ȡ������ò�����ֵ
		Enumeration<String> enu = sc.getInitParameterNames() ;
		while(enu.hasMoreElements()){
			String name = enu.nextElement() ;
			System.out.println(name + ":" + sc.getInitParameter(name));
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
