package com.heima.three;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��ʾȫ�ֶ��������ת��
public class ServletContext5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//�õ�ȫ�ֶ���
		ServletContext sc = this.getServletContext() ;
		
		request.setAttribute("name", "�Ƿ�") ;
 		
		//�õ�����ת����
		RequestDispatcher rd = sc.getRequestDispatcher("/servlet/ServletContext6") ;
		//ת����ȥ
		rd.forward(request, response) ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
