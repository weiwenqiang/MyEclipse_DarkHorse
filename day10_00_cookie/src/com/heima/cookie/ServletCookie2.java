package com.heima.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//ɾ���ͻ��˴洢��Cookie
public class ServletCookie2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Ҫ��ɾ���ͻ��˴洢��Cookie,sun��˾û���ṩ��Ӧ��ɾ��������
		//���Բ��õİ취���Ǵ���һ��ͬ����cookie,�����ʱ������Ϊ0,Ȼ�󸲸ǿͻ��˴洢��Cookie
		
		Cookie c = new Cookie("lastaccesstime","") ;
		c.setMaxAge(0) ;
		
		//����·��
		c.setPath(request.getContextPath()) ;
		
		//���͵��ͻ���
		response.addCookie(c) ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
