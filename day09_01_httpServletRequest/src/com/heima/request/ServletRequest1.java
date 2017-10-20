package com.heima.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示request的常用方法
public class ServletRequest1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8") ;
		PrintWriter out = response.getWriter() ;
		//常用方法
		String url = request.getRequestURL().toString() ;  //协议+ 服务器地址 + 端口号+ 工程名称 + 资源地址 
		String uri = request.getRequestURI() ;  // 工程名称+ 资源地址
		String contextpath = request.getContextPath() ; // 工程名称
		String encoding = request.getCharacterEncoding() ;
		String localIp = request.getLocalAddr() ;  //服务器的Ip地址
		int localport = request.getLocalPort() ;  //服务器的端口号
		String remoteIp = request.getRemoteAddr() ; //客户端的IP
		int remotePort = request.getRemotePort() ;  //客户端的端口号： 随机的
		String query = request.getQueryString() ;
		String method = request.getMethod() ;
		
		out.write("url:" + url + "<br>") ;
		out.write("uri:" + uri + "<br>") ;
		out.write("工程名称:" + contextpath + "<br>") ;
		out.write("请求的编码:" + encoding + "<br>") ;
		out.write("服务器的ip地址:" + localIp + "<br>") ;
		out.write("服务器的端口号:" + localport + "<br>") ;
		out.write("客户端的ip地址:" + remoteIp+ "<br>") ;
		out.write("客户端的端口号:" + remotePort + "<br>") ;
		out.write("请求参数:" + query + "<br>") ;
		out.write("请求方式:" + method + "<br>") ;
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
