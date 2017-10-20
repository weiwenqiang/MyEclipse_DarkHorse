package com.heima.servletconfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ��λ�ȡservletConfig����
/**
 * ��ȡ�ķ�ʽ�����֣�
 * 			1. ���ô��ε�init����
 * 			2. ����servletʵ����ȡ(��Ҫд���ε�init����)
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
