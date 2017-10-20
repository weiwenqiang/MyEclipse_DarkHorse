package com.heima.one;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//从servletContext对象中拿取数据
public class ServletContext3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//拿取全局对象
		ServletContext sc = this.getServletContext() ;
		
		//从sc中拿取数据
		String name = (String)sc.getAttribute("name") ;
		
		System.out.println(name);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
