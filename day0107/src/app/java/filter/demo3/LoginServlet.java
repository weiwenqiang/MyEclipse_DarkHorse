package app.java.filter.demo3;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import app.java.utils.JDBCUtils;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			User user = new User();
			BeanUtils.populate(user, request.getParameterMap());
			
			QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
			String sql = "SELECT * FROM t_user WHERE username=? AND password=?";
			User newUser = runner.query(sql, new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
			if(newUser == null){
				//登录失败
				request.setAttribute("error_msg", "你的用户名或密码补正确。");
				request.getRequestDispatcher("/demo3/login.jsp").forward(request,response);
			}else{
				//登录成功
				request.getSession().setAttribute("user", newUser);
				response.sendRedirect("/day0107/index.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
