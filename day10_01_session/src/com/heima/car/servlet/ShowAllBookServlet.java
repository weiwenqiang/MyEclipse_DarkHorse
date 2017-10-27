package com.heima.car.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heima.car.bean.Book;
import com.heima.car.utils.BookUtils;
/**
 * 功能有两个：
 * 		1. 显示所有的书的信息
 * 		2. 提供一个购物车的连接
 * @author Administrator
 *
 */
public class ShowAllBookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		out.write("本站有以下好书：<br>") ;
		//1.显示所有的书
		//获取所有的书的集合
		Map<String ,Book> map = BookUtils.getAllBook() ;
		//遍历集合
		for (Map.Entry<String, Book> entry : map.entrySet()) {
			//拿到每一本的id
			String id = entry.getKey() ;
			//拿到每一本书
			Book book = entry.getValue() ;
			//输出书的名字
			out.write(book.getBookName() + "&nbsp;&nbsp;<a href = '"+ request.getContextPath()+"/servlet/ShowBookDetailServlet?id=" + id +"'>显示详细信息</a><br>") ;
		}
		out.write("<br><br><br><br>") ;
		
		//提供查看购物车的连接
		out.write("<a href = '"+ request.getContextPath()+"/servlet/CarServlet'>查看购物车</a>") ;
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
