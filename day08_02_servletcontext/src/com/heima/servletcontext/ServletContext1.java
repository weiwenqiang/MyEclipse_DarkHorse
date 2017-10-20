package com.heima.servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ��ȡservletContext����
/**
 * �����ַ�ʽ��ȡservletContext����
 * 			1. ����servletConfig�����ȡ
 * 			2. ����servletʵ�������ȡ
 * 			3. ����request�����ȡ
 * @author Administrator
 *
 */
public class ServletContext1 extends HttpServlet {
	
	ServletContext sc ; 
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config) ;
		sc = config.getServletContext() ;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�ڶ��ַ�ʽ
		ServletContext sc1 = this.getServletContext() ;
		System.out.println(sc);
		System.out.println(sc1 == sc);
		//�����ַ�ʽ
		ServletContext sc2 = request.getSession().getServletContext() ;
		System.out.println(sc2 == sc);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
