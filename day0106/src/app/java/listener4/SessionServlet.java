package app.java.listener4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		user.setId(1);
		user.setName("zhangwuji");
		user.setJob("jiaozhu");
		//1 获取或创建Session对象
		HttpSession session = request.getSession();
		//2 向Session对象设置属性内容
		session.setAttribute("user", user);
		//3 将session中的内容响应到页面中
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("成功地向Session放置了内容.");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
