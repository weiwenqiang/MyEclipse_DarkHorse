package app.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.mchange.v2.codegen.bean.BeangenUtils;

import app.java.bean.User;
import app.java.service.UserService;
import app.java.service.impl.UserServiceImpl;
/**
 * 当前Servlet用于完成用户注册功能.
 * @author JYL
 */
public class RegistServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			//1 接收表单中所有的元素内容
			User user = new User();
			BeanUtils.populate(user, request.getParameterMap());
			
			//2 一次验证码验证功能
			HttpSession session = request.getSession();
			String checkcode = (String) session.getAttribute("key");
			session.removeAttribute("key");
			if(!checkcode.equals(user.getCheckcode())){
				// 输入不一致
				request.setAttribute("error_msg", "你输入的验证码不正确,请重新输入!");
				request.getRequestDispatcher("/regist.jsp").forward(request, response);
			}else{
				// 输入一致继续执行
				
				//3 判断email地址是否存在
				UserService service = new UserServiceImpl();
				User newUser = service.findUserByEmail(user);
				if(newUser != null){
					// 说明email地址已经存在
					request.setAttribute("error_msg", "你输入的email地址已存在,请重新输入!");
					request.getRequestDispatcher("/regist.jsp").forward(request, response);
				}else{
					// email地址不存在
					
					//4 完成用户注册功能
					boolean flag = service.addUser(user);
					if(flag == true){
						// 表示注册成功
						request.getRequestDispatcher("/login.jsp").forward(request, response);
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
