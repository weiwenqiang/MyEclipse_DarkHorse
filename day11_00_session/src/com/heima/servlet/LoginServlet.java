package com.heima.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//验证用户是否合法
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		//拿取页面传递的信息
		String username = request.getParameter("username") ;
		String pass = request.getParameter("pass") ;
		String fcode = request.getParameter("code") ;
		System.out.println(fcode);
		
		//先验证验证码
		if("".equals(fcode)){
			out.write("验证码不能为空,2秒后转向登陆页面") ;
			response.setHeader("Refresh", "2;url=" + request.getContextPath() + "/login.html") ;
			return ;
		}else{
			//从session中拿到存储的验证码
			HttpSession  session  = request.getSession() ;
			String scode = (String) session.getAttribute("scode") ;
			if(!scode.equalsIgnoreCase(fcode)){
				out.write("验证码填写错误,2秒后转向登陆页面") ;
				response.setHeader("Refresh", "2;url=" + request.getContextPath() + "/login.html") ;
				return ;
			}
			if("张三".equals(username) && "111".equals(pass)){
				//需要将用户名存入session
				session.setAttribute("username", username) ;
				request.getRequestDispatcher("MainServlet").forward(request, response) ;
			}else{
				out.write("用户名或者密码错误,2秒后转向登陆页面") ;
				response.setHeader("Refresh", "2;url=" + request.getContextPath() + "/login.html") ;
				
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
