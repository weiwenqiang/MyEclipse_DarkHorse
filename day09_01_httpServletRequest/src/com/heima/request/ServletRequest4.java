package com.heima.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ��������������
public class ServletRequest4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 *   1. ���ύ��ʽ��post��ʽ��ʱ��
		 *       request.setCharacterEncoding("UTF-8") ;
		 */
		request.setCharacterEncoding("UTF-8") ;
		String name = request.getParameter("username") ;
		//�����get��ʽ�ύ: ����취�����ؽ��ַ���
		//��д���ĵĿؼ��Ƚ϶��ʱ��: ��ȡ���ķ���������İ취
		//name = new String(name.getBytes("ISO-8859-1"),"utf-8") ;	
		System.out.println(name);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
