package com.heima.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示获取请求头信息
public class ServletRequest2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//获取单个请求头信息
//		String s = request.getHeader("Accept-Encoding") ;
//		System.out.println(s);
		
		//获取同名的请求头的多个值
//		Enumeration<String> enu = request.getHeaders("Accept-Encoding") ;
//		while(enu.hasMoreElements()){
//			System.out.println(enu.nextElement());
//		}
		
		//拿到所有的请求头和值
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
