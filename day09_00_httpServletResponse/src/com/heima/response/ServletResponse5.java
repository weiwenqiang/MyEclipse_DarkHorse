package com.heima.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ���ƿͻ���������Ļ���ʱ��
public class ServletResponse5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=	UTF-8") ;
		response.getWriter().write("��Һ�") ;
		
		//���ƻ����ʱ��
		response.setDateHeader("Expires", System.currentTimeMillis() + 10000)  ;  //ʱ���Ǵ�1970���1��1��0��0��0��0���뿪ʼ��ʱ
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
