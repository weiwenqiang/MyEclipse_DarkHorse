package app.java.listener3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BeanServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//1 实例化JavaBean
		User user = new User();
		user.setId(1);
		user.setName("zhangwuji");
		user.setJob("jiaozhu");
		HttpSession session = request.getSession();
		//2 将该JavaBean的实例,绑定到Session对象中
		session.setAttribute("user", user);
		//3 从Session对象中删除JavaBean对象
		session.removeAttribute("user");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
