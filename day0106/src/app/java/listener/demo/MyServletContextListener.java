package app.java.listener.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
	/**
	 * 完成在线人数统计的初始化工作.
	 */
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		context.setAttribute("sums", 0);
	}
	
	public void contextDestroyed(ServletContextEvent arg0) {}

}
