package com.heima.request;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾrequest������Ϊһ�������ʹ��
public class ServletRequest7 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("name", "С��Ů") ;
		System.out.println("�������");
		//����ת����
		//RequestDispatcher rd = request.getRequestDispatcher("/servlet/ServletRequest8") ;
		RequestDispatcher rd = request.getRequestDispatcher("ServletRequest8") ;
		//ת����ServletRequest8��
		//rd.forward(request, response) ;   //����ת��
		//�����ض����µ���Դ
		response.sendRedirect(request.getContextPath() + "/servlet/ServletRequest8") ;
		/**
		 * request���������ת����ServletContext���������ת��������
		 * 			request����������·��֧�����·��,		
		 * 			ServletContext���������ת����֧�����·��	
		 */
		//rd.include(request, response) ;  //��ServletRequest8��������
		
		//��ȡ����
		//int age = (Integer) request.getAttribute("age") ;
		//System.out.println(age);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
