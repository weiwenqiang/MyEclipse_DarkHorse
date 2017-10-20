package com.heima.one;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示输出中文乱码的问题
public class ServletResponse1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       //采用字节流输出数据
		String s = "黑马训练营1" ;
		//response.getOutputStream().write(s.getBytes()) ;  //不会出现乱码
		//response.getOutputStream().write(s.getBytes("utf-8")) ;
		
		//解决乱码问题
		//第一种办法：让用户在浏览器中选择解码(不靠谱)
		//第二种方式:通知浏览器采用某种编码进行解码
		//response.setHeader("Content-Type", "text/html;charset=UTF-8") ;
		//第三种方式：输出一个字符串
//		response.getOutputStream().write("<meta http-equiv='content-type' content='text/html; charset=UTF-8'>".getBytes()) ;
//		response.getOutputStream().write(s.getBytes("utf-8")) ;
		//第四种方式 让服务器的编码用一种编码，通知浏览器的解码
//		response.setCharacterEncoding("UTF-8") ;
//		response.setHeader("Content-Type", "text/html;charset=UTF-8") ;
//		
//		response.getOutputStream().write(s.getBytes("utf-8")) ;
		
		//第五种方法(推荐)
		response.setContentType("text/html;charset=utf-8") ;  //此句代码做了两件事情：1 设定服务器将数据编码时用的码表														   
																//  2.通知浏览器解码用的码表
//		
//		response.getOutputStream().write(s.getBytes("UTF-8")) ;
		
		
		//字符流输出中文
		response.getWriter().write(s) ;
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
