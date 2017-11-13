package app.java.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter2 implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("这是MyFilter2的doFilter()方法...");
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		System.out.println("这是MyFilter2的init()方法...");
		
		Enumeration enums = config.getInitParameterNames();
		
		while (enums.hasMoreElements()) {
			String name = (String) enums.nextElement();
			String value = config.getInitParameter(name);
			
			System.out.println(name+" : "+value);
		}
	}

}
