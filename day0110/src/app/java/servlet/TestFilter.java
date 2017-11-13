package app.java.servlet;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
/*
 * <filter>
 * 	<filter-name></filter-name>
 * 	<filter-class></filter-class>
 * 	<init-param>
 * 		<param-name></param-name>
 * 		<param-value></param-value>
 * 	</init-param>
 * </filter>
 * <filter-mapping>
 *	<filter-name></filter-name>
 *	<url-pattern></url-pattern>
 * </filter-mapping>
 */
/*@WebFilter(
	urlPatterns={"/*"},
	initParams={@WebInitParam(name="",value="")},
	servletNames={"/test"},
	dispatcherTypes={DispatcherType.REQUEST,DispatcherType.FORWARD}
)*/
public class TestFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
