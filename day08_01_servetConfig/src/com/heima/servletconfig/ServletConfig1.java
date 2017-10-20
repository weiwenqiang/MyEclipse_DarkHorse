package com.heima.servletconfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示如何获取servletConfig对象
/**
 * 获取的方式有两种：
 * 			1. 采用带参的init方法
 * 			2. 采用servlet实例拿取(不要写带参的init方法)
 * @author Administrator
 *
 */
public class ServletConfig1 extends HttpServlet {
	
	ServletConfig config ;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config) ;
		this.config = config ;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig sc = this.getServletConfig() ;
		//System.out.println(config == sc);
		System.out.println(sc);
		System.out.println(config == sc);
	}
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
