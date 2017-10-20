package com.heima.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo1 extends GenericServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servletDemo1被创建了");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("你过来了");
	}

}
