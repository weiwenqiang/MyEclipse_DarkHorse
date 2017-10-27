package com.heima.car.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.heima.car.bean.Book;
import com.heima.car.utils.BookUtils;
//此servlet是将购买的书放入购物车
public class BuyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		//获取页面传递的id
		String id = request.getParameter("id") ;
		
		//根据id找到书对象
		Book book = BookUtils.getBookById(id) ;
		
		//将书存入session对象中
		HttpSession session  = request.getSession() ;

		//将书放入session中的一个集合中
		List<Book> list = (List<Book>) session.getAttribute("carlist") ;
		
		if(list == null){
			//说明第一次购买书籍，此时session中是不存在list集合，需要手动创建
			list = new ArrayList<Book>() ;
			//将购买的书籍放入
			book.setCount(1) ;
			list.add(book) ;
			
			//将list存入session
			session.setAttribute("carlist", list) ;
		}else{
			//说明已经购买过书籍了
			//判断购物车中是否已经购买过此书
			int index = list.indexOf(book) ;
			if(index == -1){
				//说明没有买过此书
				book.setCount(1) ;
				list.add(book) ;
			}else{
				//说明买过了
				Book b = list.get(index) ;
				b.setCount(b.getCount() + 1) ;
				
			}
			
			//提醒用户，此书已经放入购物车中
			out.write(book.getBookName() + " 已经放入购物车中,4秒后转向主页，低级<a href = '"+request.getContextPath()+"/servlet/ShowAllBookServlet'>此处</a>直接转向主页") ;
			response.setHeader("Refresh", "4;url="+ request.getContextPath() + "/servlet/ShowAllBookServlet") ;
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
