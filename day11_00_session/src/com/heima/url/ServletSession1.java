package com.heima.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletSession1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session  =request.getSession() ;
		String id = session.getId() ;
		session.setAttribute("name", "����") ;
		response.setContentType("text/html;charset=UTF-8") ;
		//ֻҪ��������id���ӵ�ÿһ����ַ(url)֮��,����˾Ϳ��Ը���id�ҵ���Ӧ��session����Ϊ�ͻ��˷���
		String url = request.getContextPath() + "/servlet/ServletSession2" ;
		url = response.encodeURL(url) ;
		PrintWriter out = response.getWriter() ;
		out.write("<a href = '" + url+"'>����ServletSession2</a>") ;
		System.out.println(session.getId());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
