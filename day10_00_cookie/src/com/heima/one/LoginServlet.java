package com.heima.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ��Servlet���������飺 
 * 		1. �ж��û��Ƿ��ǺϷ��û�
 *      2. ���û��Ƿ�ѡ���˼�¼�û���������
 */
//��ͻ��˷���������߼�¼�û����������Cookie
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		//��ȡ����������ݵ�����
		String name = request.getParameter("username") ;
		String pass = request.getParameter("password") ;
		String remeber =request.getParameter("remeber") ;
		
		//�ж��û��Ƿ��ǺϷ��û� : �ٶ�name��pass������һ�����ǺϷ��û�
		//�õ����������
		String pass1 = new StringBuffer(pass).reverse().toString() ;
		
		//�ж�
		if(name.equals(pass1)){
			//�ǺϷ��û�
			//�ж��û��Ƿ�ѡ���˼�ס�û���������
			//˵���û�ѡ���˼�¼
			Cookie c  = new Cookie("name",name) ;
			Cookie c1  = new Cookie("pass",pass) ;
			if("on".equals(remeber)){
				//�趨�洢���ͻ��˵�Ӳ����
				c.setMaxAge(Integer.MAX_VALUE) ;
				c1.setMaxAge(Integer.MAX_VALUE) ;
				
			}else{
				//�趨�ͻ��˴洢���û�������������ʧЧ
				c.setMaxAge(0) ;
				c1.setMaxAge(0) ;
			}
			//�趨����·��
			c.setPath(request.getContextPath()) ;
			c1.setPath(request.getContextPath()) ;
			
			//��ͻ��˷���Cookie
			response.addCookie(c) ;
			response.addCookie(c1) ;
			
			request.setAttribute("name", name) ;
			request.getRequestDispatcher("MainServlet").forward(request, response) ;
		}else{
			//�Ƿ��û�
			request.setAttribute("error", "�û��������������") ;
			request.getRequestDispatcher("ServletUI").forward(request, response) ;
		}
		
		
		
		 
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
