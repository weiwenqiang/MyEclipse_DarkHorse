package com.heima.car.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.car.bean.Book;
import com.heima.car.utils.BookUtils;


/**
 * 此类完成两件事情：
 * 		  1. 显示书的详细信息
 * 		  2. 提供购物的连接，返回继续浏览的连接
 * @author Administrator
 *
 */
public class ShowBookDetailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		//1.显示书的详细信息
		//拿到页面传递的id
		String id = request.getParameter("id") ;
		//根据id获取书
		Book book = BookUtils.getBookById(id) ;
		//显示信息
		out.write(book + "&nbsp;&nbsp;<a href = '" + request.getContextPath() +"/servlet/ShowAllBookServlet'>返回主页继续浏览</a><a href = '" + request.getContextPath()+ "/servlet/BuyServlet?id=" + id + "'>放入购物车</a><br>") ;
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
