package com.heima.servletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示servletConfig对象的应用
public class ServletConfig2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//拿到servletConfi对象
		ServletConfig sc = this.getServletConfig() ;

		//拿取配置的单个信息
//		String name = sc.getInitParameter("name") ;
//		System.out.println(name);
		
		//拿取配置的多个信息
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
