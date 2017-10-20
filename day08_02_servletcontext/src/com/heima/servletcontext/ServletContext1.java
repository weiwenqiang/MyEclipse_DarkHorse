package com.heima.servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//演示获取servletContext对象
/**
 * 有三种方式获取servletContext对象
 * 			1. 采用servletConfig对象获取
 * 			2. 采用servlet实例对象获取
 * 			3. 采用request对象获取
 * @author Administrator
 *
 */
public class ServletContext1 extends HttpServlet {
	
	ServletContext sc ; 
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config) ;
		sc = config.getServletContext() ;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//第二种方式
		ServletContext sc1 = this.getServletContext() ;
		System.out.println(sc);
		System.out.println(sc1 == sc);
		//第三种方式
		ServletContext sc2 = request.getSession().getServletContext() ;
		System.out.println(sc2 == sc);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
