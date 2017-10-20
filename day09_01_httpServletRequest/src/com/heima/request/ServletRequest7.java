package com.heima.request;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示request对象作为一个域对象使用
public class ServletRequest7 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("name", "小龙女") ;
		System.out.println("你过来了");
		//请求转发器
		//RequestDispatcher rd = request.getRequestDispatcher("/servlet/ServletRequest8") ;
		RequestDispatcher rd = request.getRequestDispatcher("ServletRequest8") ;
		//转发到ServletRequest8中
		//rd.forward(request, response) ;   //请求转发
		//请求重定向到新的资源
		response.sendRedirect(request.getContextPath() + "/servlet/ServletRequest8") ;
		/**
		 * request对象的请求转发和ServletContext对象的请求转发的区别：
		 * 			request对象的请求的路径支持相对路径,		
		 * 			ServletContext对象的请求转发不支持相对路径	
		 */
		//rd.include(request, response) ;  //把ServletRequest8包含进来
		
		//拿取数据
		//int age = (Integer) request.getAttribute("age") ;
		//System.out.println(age);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
