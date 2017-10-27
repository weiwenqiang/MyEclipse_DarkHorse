package com.heima.one;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//创建页面
public class ServletUI extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		//拿到错误信息
		String name = (String) request.getAttribute("error") ;
		if(name != null)
			 out.write("<font color = red>" + name + "</font>") ;
		
		String username = "" ;
		String pass = "" ;
		//拿到客户端携带的所有的Cookie
		Cookie[] cs = request.getCookies() ;
		//循环判断
		for (int i = 0; cs !=null && i < cs.length; i++) {
				Cookie c  = cs[i] ;
				if(c.getName().equals("name")){
					//说明找到了存储用户名的cookie
					username = c.getValue() ;
				}
				if(c.getName().equals("pass")){
					//说明找到了存储密码的Cookie
					pass = c.getValue() ;
				}
		}
		
		//创建登陆页面
		out.write("<form action = '" + request.getContextPath()+"/servlet/LoginServlet' method = 'post'>") ;
		out.write("姓名：<input type = 'text' name = 'username' value = '" + username + "'><br>") ;
		out.write("密码：<input type = 'text' name = 'password' value = '" + pass + "'><br>") ;
		out.write("<input type = 'checkbox' name = 'remeber' value = 'on'>记住用户名及密码两周<br>") ;
		out.write("<input type = 'submit' value = '登陆'><br>") ;
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
