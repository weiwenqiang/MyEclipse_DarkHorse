package com.heima.one;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ����������������
public class ServletResponse1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       //�����ֽ����������
		String s = "����ѵ��Ӫ1" ;
		//response.getOutputStream().write(s.getBytes()) ;  //�����������
		//response.getOutputStream().write(s.getBytes("utf-8")) ;
		
		//�����������
		//��һ�ְ취�����û����������ѡ�����(������)
		//�ڶ��ַ�ʽ:֪ͨ���������ĳ�ֱ�����н���
		//response.setHeader("Content-Type", "text/html;charset=UTF-8") ;
		//�����ַ�ʽ�����һ���ַ���
//		response.getOutputStream().write("<meta http-equiv='content-type' content='text/html; charset=UTF-8'>".getBytes()) ;
//		response.getOutputStream().write(s.getBytes("utf-8")) ;
		//�����ַ�ʽ �÷������ı�����һ�ֱ��룬֪ͨ������Ľ���
//		response.setCharacterEncoding("UTF-8") ;
//		response.setHeader("Content-Type", "text/html;charset=UTF-8") ;
//		
//		response.getOutputStream().write(s.getBytes("utf-8")) ;
		
		//�����ַ���(�Ƽ�)
		response.setContentType("text/html;charset=utf-8") ;  //�˾���������������飺1 �趨�����������ݱ���ʱ�õ����														   
																//  2.֪ͨ����������õ����
//		
//		response.getOutputStream().write(s.getBytes("UTF-8")) ;
		
		
		//�ַ����������
		response.getWriter().write(s) ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
