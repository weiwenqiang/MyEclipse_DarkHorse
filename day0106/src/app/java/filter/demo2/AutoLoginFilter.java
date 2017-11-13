package app.java.filter.demo2;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 当前Filter用于完成用户自动登录功能.
 * @author JYL
 */
public class AutoLoginFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for (Cookie cookie : cookies) {
				if(cookie != null){
					String name = cookie.getName();
					if("user".equals(name)){
						// 曾经登录过
						String value = cookie.getValue();
						
						String username = value.split("#")[0];
						String password = value.split("#")[1];
						
						request.getSession().setAttribute("user", username);
						chain.doFilter(request, resp);
					}else{
						// 没有登陆过
						chain.doFilter(request, resp);
					}
				}
			}
		}else{
			// 没有登陆过
			chain.doFilter(request, resp);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
	}

}
