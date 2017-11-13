package app.java.proxy.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.java.proxy.demo.bean.Privileges;
import app.java.proxy.demo.bean.Userinfo;
import app.java.proxy.demo.service.OperateService;
import app.java.proxy.demo.service.impl.OperateServiceImpl;
import app.java.proxy.demo.utils.ServiceFactory;

public class BookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//1 获取请求的参数:是什么操作
		String operate = request.getParameter("operate");
		
		//2 获取当前用户的信息
		Userinfo userinfo = (Userinfo) request.getSession().getAttribute("user");
		
		OperateService service = ServiceFactory.getOperateService(userinfo);
		String result = null;
		//3 判断用户是什么操作
		if(operate.equals("add")){
			result = service.addBook(userinfo);
			if(result.equals("success")){
				// 说明具有权限
				request.getRequestDispatcher("/add.jsp").forward(request, response);
			}else{
				// 说明没有权限
				request.setAttribute("error_msg", "对不起,你没有添加书籍的权限!");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
		}else if(operate.equals("edit")){
			result = service.editBook(userinfo);
			if(result.equals("success")){
				// 说明具有权限
				request.getRequestDispatcher("/edit.jsp").forward(request, response);
			}else{
				// 说明没有权限
				request.setAttribute("error_msg", "对不起,你没有修改书籍的权限!");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
		}else if(operate.equals("look")){
			result = service.lookBook(userinfo);
			if(result.equals("success")){
				// 说明具有权限
				request.getRequestDispatcher("/look.jsp").forward(request, response);
			}else{
				// 说明没有权限
				request.setAttribute("error_msg", "对不起,你没有查看书籍的权限!");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
		}else if(operate.equals("delete")){
			result = service.delBook(userinfo);
			if(result.equals("success")){
				// 说明具有权限
				request.getRequestDispatcher("/delete.jsp").forward(request, response);
			}else{
				// 说明没有权限
				request.setAttribute("error_msg", "对不起,你没有删除书籍的权限!");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
