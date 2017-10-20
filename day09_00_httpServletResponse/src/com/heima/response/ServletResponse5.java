package com.heima.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示控制客户端浏览器的缓存时间
public class ServletResponse5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=	UTF-8") ;
		response.getWriter().write("大家好") ;
		
		//控制缓存的时间
		response.setDateHeader("Expires", System.currentTimeMillis() + 10000)  ;  //时间是从1970年的1月1日0点0分0秒0毫秒开始计时
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
