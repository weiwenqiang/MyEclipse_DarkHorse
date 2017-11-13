package app.java.proxy.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.mchange.v2.codegen.bean.BeangenUtils;

import app.java.proxy.demo.bean.Userinfo;
import app.java.proxy.demo.service.UserService;
import app.java.proxy.demo.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Userinfo userinfo = new Userinfo();
			BeanUtils.populate(userinfo, request.getParameterMap());
			
			UserService service = new UserServiceImpl();
			Userinfo newUserinfo = service.userLogin(userinfo);
			
			if(newUserinfo == null){
				// 说明登录失败
				request.setAttribute("error_msg", "你的用户名或密码错误.");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}else{
				// 说明登录成功
				request.getSession().setAttribute("user", newUserinfo);
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
