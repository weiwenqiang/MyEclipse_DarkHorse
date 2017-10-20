package com.heima.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾrequest�ĳ��÷���
public class ServletRequest1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8") ;
		PrintWriter out = response.getWriter() ;
		//���÷���
		String url = request.getRequestURL().toString() ;  //Э��+ ��������ַ + �˿ں�+ �������� + ��Դ��ַ 
		String uri = request.getRequestURI() ;  // ��������+ ��Դ��ַ
		String contextpath = request.getContextPath() ; // ��������
		String encoding = request.getCharacterEncoding() ;
		String localIp = request.getLocalAddr() ;  //��������Ip��ַ
		int localport = request.getLocalPort() ;  //�������Ķ˿ں�
		String remoteIp = request.getRemoteAddr() ; //�ͻ��˵�IP
		int remotePort = request.getRemotePort() ;  //�ͻ��˵Ķ˿ںţ� �����
		String query = request.getQueryString() ;
		String method = request.getMethod() ;
		
		out.write("url:" + url + "<br>") ;
		out.write("uri:" + uri + "<br>") ;
		out.write("��������:" + contextpath + "<br>") ;
		out.write("����ı���:" + encoding + "<br>") ;
		out.write("��������ip��ַ:" + localIp + "<br>") ;
		out.write("�������Ķ˿ں�:" + localport + "<br>") ;
		out.write("�ͻ��˵�ip��ַ:" + remoteIp+ "<br>") ;
		out.write("�ͻ��˵Ķ˿ں�:" + remotePort + "<br>") ;
		out.write("�������:" + query + "<br>") ;
		out.write("����ʽ:" + method + "<br>") ;
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
