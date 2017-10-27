package com.heima.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//删除客户端存储的Cookie
public class ServletCookie2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//要想删除客户端存储的Cookie,sun公司没有提供相应的删除方法，
		//所以采用的办法就是创建一个同名的cookie,将存活时间设置为0,然后覆盖客户端存储的Cookie
		
		Cookie c = new Cookie("lastaccesstime","") ;
		c.setMaxAge(0) ;
		
		//设置路径
		c.setPath(request.getContextPath()) ;
		
		//发送到客户端
		response.addCookie(c) ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
