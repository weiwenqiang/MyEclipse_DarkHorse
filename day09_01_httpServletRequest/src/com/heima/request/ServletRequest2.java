package com.heima.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ��ȡ����ͷ��Ϣ
public class ServletRequest2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��ȡ��������ͷ��Ϣ
//		String s = request.getHeader("Accept-Encoding") ;
//		System.out.println(s);
		
		//��ȡͬ��������ͷ�Ķ��ֵ
//		Enumeration<String> enu = request.getHeaders("Accept-Encoding") ;
//		while(enu.hasMoreElements()){
//			System.out.println(enu.nextElement());
//		}
		
		//�õ����е�����ͷ��ֵ
		Enumeration<String> enu = request.getHeaderNames() ;
		while(enu.hasMoreElements()){
			String key = enu.nextElement() ;
			System.out.println(key + ":" + request.getHeader(key)) ;
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
