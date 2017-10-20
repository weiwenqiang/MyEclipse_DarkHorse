package com.heima.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示请求重定向
public class ServletResponse6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("servletresppnse6");
		//第一种方式
//		response.setStatus(302) ;
//		response.setHeader("Location", "/day09_00_httpServletResponse/servlet/ServletResponse5") ;
		
		response.sendRedirect("/day09_00_httpServletResponse/servlet/ServletResponse5") ;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
