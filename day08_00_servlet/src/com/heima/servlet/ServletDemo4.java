package com.heima.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//��ʾ��δ���servet����
public class ServletDemo4 extends GenericServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("�����޲ε�init����");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("���Ǵ��ε�init����");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
