package app.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import app.java.bean.User;
import app.java.service.UserService;
import app.java.service.impl.UserServiceImpl;
/**
 * 当前Servlet用于完成用户登录功能.
 * @author JYL
 */
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			//1 接收登录请求的所有参数
			User user = new User();
			BeanUtils.populate(user, request.getParameterMap());
			
			//2 完成用户登录逻辑
			UserService service = new UserServiceImpl();
			User newUser = service.findUser(user);
			if(newUser == null){
				// 登录失败
				request.setAttribute("error_msg", "你输入的用户名或密码不正确,请重新输入!");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}else{
				// 登录成功
				
				// 记住用户
				String remember = request.getParameter("remember");
				if("on".equals(remember)){
					// 需要记住用户
					Cookie cookie = new Cookie("user", newUser.getEmail()+"#"+newUser.getPassword());
					cookie.setMaxAge(60*60*24*7);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
				
				request.getSession().setAttribute("user", newUser);
				response.sendRedirect("index.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
