package app.java.filter.demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 当前Servlet用于处理用户登录逻辑.
 * @author JYL
 *
 */
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username==null||password==null||"".equals(username)||"".equals(password)){
			// 说明用户没有输入用户名和密码
			request.setAttribute("error_msg", "请输入你的用户名和密码!");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else if(username.equals("admin")&&password.equals("admin")){
			// 获取自动登陆的值,进行判断
			String autologin = request.getParameter("autologin");
			if("on".equals(autologin)){
				Cookie cookie = new Cookie("user",username+"#"+password);
				cookie.setMaxAge(60*60*24*7);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			
			request.getSession().setAttribute("user", username);
			response.sendRedirect("/day0106/index.jsp");
		}
	}

}
