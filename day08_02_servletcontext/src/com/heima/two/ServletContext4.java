package com.heima.two;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//获取全局配置参数
public class ServletContext4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//拿到全局对象
		ServletContext sc = this.getServletContext() ;
		//获取单个配置参数(获取姓名)
//		String name = sc.getInitParameter("name") ;
//		System.out.println(name);
		
		//拿取多个配置参数的值
		Enumeration<String> enu = sc.getInitParameterNames() ;
		while(enu.hasMoreElements()){
			String name = enu.nextElement() ;
			System.out.println(name + ":" + sc.getInitParameter(name));
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
