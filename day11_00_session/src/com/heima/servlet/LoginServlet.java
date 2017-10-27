package com.heima.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//��֤�û��Ƿ�Ϸ�
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		//��ȡҳ�洫�ݵ���Ϣ
		String username = request.getParameter("username") ;
		String pass = request.getParameter("pass") ;
		String fcode = request.getParameter("code") ;
		System.out.println(fcode);
		
		//����֤��֤��
		if("".equals(fcode)){
			out.write("��֤�벻��Ϊ��,2���ת���½ҳ��") ;
			response.setHeader("Refresh", "2;url=" + request.getContextPath() + "/login.html") ;
			return ;
		}else{
			//��session���õ��洢����֤��
			HttpSession  session  = request.getSession() ;
			String scode = (String) session.getAttribute("scode") ;
			if(!scode.equalsIgnoreCase(fcode)){
				out.write("��֤����д����,2���ת���½ҳ��") ;
				response.setHeader("Refresh", "2;url=" + request.getContextPath() + "/login.html") ;
				return ;
			}
			if("����".equals(username) && "111".equals(pass)){
				//��Ҫ���û�������session
				session.setAttribute("username", username) ;
				request.getRequestDispatcher("MainServlet").forward(request, response) ;
			}else{
				out.write("�û��������������,2���ת���½ҳ��") ;
				response.setHeader("Refresh", "2;url=" + request.getContextPath() + "/login.html") ;
				
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
