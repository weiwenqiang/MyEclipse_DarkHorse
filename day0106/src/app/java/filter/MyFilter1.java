package app.java.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 自定义过滤器:
 *  * 实现Filter接口,并且重写该接口提供所有的方法.
 * @author JYL
 *
 */
public class MyFilter1 implements Filter {
	/**
	 * Filter的构造函数:
	 *  * 执行时机:在Tomcat服务器启动时.
	 *  * 执行次数:在Filter的生命周期中只执行一次.
	 *    * Filter与Servlet一样,都是单例多线程的.(线程安全问题)
	 */
	public MyFilter1() {
		System.out.println("这是MyFilter1的构造函数...");
	}
	/**
	 * init(FilterConfig config)方法:
	 *  * 作用:用于过滤器的初始化.
	 *  * 执行时机:在Tomcat服务器启动时.
	 *  * 执行次数:在Filter的生命周期中只执行一次.
	 */
	public void init(FilterConfig config) throws ServletException {
		System.out.println("这是MyFilter1的init()方法...");
		
	}
	/**
	 * doFilter(ServletRequest request, ServletResponse response,FilterChain chain)方法:
	 *  * 作用:用于过滤器的过滤.
	 *  * 执行时机:客户端访问当前Filter拦截的资源路径时.
	 *  * 执行次数:在Filter的生命周期中,每次拦截,每次执行.
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("这是MyFilter1的doFilter()方法...");
		
		//过滤器的放行
		chain.doFilter(request, response);
	}
	/**
	 * destroy()方法:
	 *  * 作用:用于过滤器的销毁.
	 *  * 执行时机:在Tomcat服务器关闭时.
	 *  * 执行次数:在Filter的生命周期中只执行一次.
	 */
	public void destroy() {
		System.out.println("这是MyFilter1的destroy()方法...");
		
	}

}
