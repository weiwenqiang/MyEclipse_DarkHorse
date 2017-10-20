package com.heima.three;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//演示全局对象的请求转发
public class ServletContext5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//拿到全局对象
		ServletContext sc = this.getServletContext() ;
		
		request.setAttribute("name", "乔峰") ;
 		
		//拿到请求转发器
		RequestDispatcher rd = sc.getRequestDispatcher("/servlet/ServletContext6") ;
		//转发过去
		rd.forward(request, response) ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
