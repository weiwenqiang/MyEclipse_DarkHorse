package com.heima.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//演示如何创建servet对象
public class ServletDemo4 extends GenericServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("我是无参的init方法");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("我是带参的init方法");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
