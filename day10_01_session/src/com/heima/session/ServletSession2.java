package com.heima.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//演示从session中取出数据
public class ServletSession2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取session对象
		HttpSession session = request.getSession() ;
		System.out.println("222:" + session.getId());
		//从session对象中获取数据
		String name = (String) session.getAttribute("name") ;
		
		System.out.println(name);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
