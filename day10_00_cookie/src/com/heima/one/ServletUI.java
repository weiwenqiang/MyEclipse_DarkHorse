package com.heima.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����ҳ��
public class ServletUI extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		//�õ�������Ϣ
		String name = (String) request.getAttribute("error") ;
		if(name != null)
			 out.write("<font color = red>" + name + "</font>") ;
		
		String username = "" ;
		String pass = "" ;
		//�õ��ͻ���Я�������е�Cookie
		Cookie[] cs = request.getCookies() ;
		//ѭ���ж�
		for (int i = 0; cs !=null && i < cs.length; i++) {
				Cookie c  = cs[i] ;
				if(c.getName().equals("name")){
					//˵���ҵ��˴洢�û�����cookie
					username = c.getValue() ;
				}
				if(c.getName().equals("pass")){
					//˵���ҵ��˴洢�����Cookie
					pass = c.getValue() ;
				}
		}
		
		//������½ҳ��
		out.write("<form action = '" + request.getContextPath()+"/servlet/LoginServlet' method = 'post'>") ;
		out.write("������<input type = 'text' name = 'username' value = '" + username + "'><br>") ;
		out.write("���룺<input type = 'text' name = 'password' value = '" + pass + "'><br>") ;
		out.write("<input type = 'checkbox' name = 'remeber' value = 'on'>��ס�û�������������<br>") ;
		out.write("<input type = 'submit' value = '��½'><br>") ;
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
