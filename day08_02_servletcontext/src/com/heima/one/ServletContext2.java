package com.heima.one;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��ʾservletContext������Ϊ�����ʹ��
public class ServletContext2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��ȡȫ�ֶ���
		ServletContext sc = this.getServletContext() ;
		
		//�洢����
		sc.setAttribute("name", "������") ;
		System.out.println("���ݴ洢���");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
