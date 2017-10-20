package com.heima.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示中文乱码问题解决
public class ServletRequest4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 *   1. 当提交方式是post方式的时候
		 *       request.setCharacterEncoding("UTF-8") ;
		 */
		request.setCharacterEncoding("UTF-8") ;
		String name = request.getParameter("username") ;
		//如果是get方式提交: 解决办法就是重建字符串
		//当写中文的控件比较多的时候: 采取更改服务器编码的办法
		//name = new String(name.getBytes("ISO-8859-1"),"utf-8") ;	
		System.out.println(name);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
