package com.heima.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//演示创建session
public class ServletSession1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/**
		 *   getsession()方法做了两件事：
		 *   			1. 看客户端是否携带了JSESSIONIDCookie
		 *   		    2. 如果没有携带，创建一个新的session对象，并分配一个唯一的id,发送到客户端，存储在客户端的缓存中
		 *   			   如果携带了，将根据cookie的值(id)到服务端的内存中寻找session，如果找到了则返回此session为客户端服务，
		 *   			 如果找不到，则创建新的session对象，并并分配一个唯一的id,发送到客户端，存储在客户端的缓存中
		 */
		HttpSession session = request.getSession() ;
		String id = session.getId() ;
		System.out.println("111:" + id);
		session.setAttribute("name", "张无忌") ;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
