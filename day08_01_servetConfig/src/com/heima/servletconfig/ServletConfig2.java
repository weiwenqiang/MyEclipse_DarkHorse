package com.heima.servletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾservletConfig�����Ӧ��
public class ServletConfig2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�õ�servletConfi����
		ServletConfig sc = this.getServletConfig() ;

		//��ȡ���õĵ�����Ϣ
//		String name = sc.getInitParameter("name") ;
//		System.out.println(name);
		
		//��ȡ���õĶ����Ϣ
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
