package com.heima.response;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾresponse�����ϸ��
public class ServletResponse7 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��Ҫ��һ��servlet��ͬʱʹ���ַ������ֽ���
		
		response.getWriter().write("��־��") ;
		response.getOutputStream().write("��Һ�".getBytes()) ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
