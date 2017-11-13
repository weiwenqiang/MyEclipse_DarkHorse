package app.java.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.java.bean.User;
import app.java.utils.CookieUtils;

public class RemeberFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		
		//1 类型强转
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		
		//2 获取Cookie
		Cookie[] cookies = request.getCookies();
		Cookie cookie = CookieUtils.getCookie(cookies, "user");
		if(cookie != null){
			String value = cookie.getValue();
			String email = value.split("#")[0];
			String password = value.split("#")[1];
			
			User user = new User();
			user.setEmail(email);
			user.setPassword(password);
			
			request.setAttribute("user", user);
		}
		
		chain.doFilter(request, response);
		
	}

	public void init(FilterConfig arg0) throws ServletException {
	}

}
