package com.heima.one;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//演示servletContext对象作为域对象使用
public class ServletContext2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//获取全局对象
		ServletContext sc = this.getServletContext() ;
		
		//存储数据
		sc.setAttribute("name", "张三丰") ;
		System.out.println("数据存储完毕");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
