package com.heima.response;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//定时刷新网页
public class ServletResponse4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//每隔2秒刷新自己
//		response.setHeader("Refresh", "2") ;
//		response.getWriter().write("aa"+ new Random().nextInt()) ;
		
		//每隔2秒刷新到其他资源
		response.setHeader("Refresh", "2;url=/day09_00_httpServletResponse/1.html") ;
		response.getWriter().write("aa"+ new Random().nextInt()) ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
