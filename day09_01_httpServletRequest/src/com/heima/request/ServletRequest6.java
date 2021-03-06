package com.heima.request;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.heima.bean.User;
//演示封装表单中的数据
public class ServletRequest6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		
		User user = new User() ;
		System.out.println("封装前： " + user);
		//将表单数据封装到user对象中
		try {
			BeanUtils.populate(user, request.getParameterMap()) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("封装后： " + user);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
