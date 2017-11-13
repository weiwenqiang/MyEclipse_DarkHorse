package app.java.filter.demo3;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuthoFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;

		// 1.获取用户信息
		User user = (User) request.getSession().getAttribute("user");
		String userRole = user.getRole();
		// 2.获取请求连接信息
		String url = request.getParameter("url");
		String path = request.getContextPath();
		url = url.substring(0, url.lastIndexOf("/"));
		if (url.contains(path)) {
			url.substring(url.indexOf(path));
		}
		System.out.println(url);
		// 3.进行匹配
		if (userRole.equals("user")) {
			if (!url.equals("user")) {
				request.setAttribute("error_msg", "你没有这个权限 ");
				request.getRequestDispatcher("/error.jsp").forward(request,
						resp);
			}else{
				chain.doFilter(request, resp);
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
