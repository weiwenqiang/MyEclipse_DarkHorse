package com.heima.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示是否能够获取Cookie(演示path的含义)
public class ServletCookie3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		out.write("你上次访问的时间是") ;
		//拿到客户端所有的Cookie
		Cookie[] cs = request.getCookies() ;
		//拿到记录上次访问时间的Cookie
		for (int i = 0;cs!= null && i < cs.length; i++) {
			Cookie c = cs[i] ;
			if(c.getName().equals("lastaccesstime")){
				String value = c.getValue() ;
				
				out.write(value) ;
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
