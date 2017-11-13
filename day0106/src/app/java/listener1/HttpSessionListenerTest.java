package app.java.listener1;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 用于测试HttpSessionListener监听器.
 *  * 实现HttpSessionListener接口.
 *  * 重写该接口提供的所有方法.
 * @author JYL
 */
public class HttpSessionListenerTest implements HttpSessionListener,ServletRequestListener,ServletContextListener {

	/**
	 * sessionCreated(HttpSessionEvent arg0)
	 *  * 该方法用于监听Session对象的创建.
	 *  * 问题:应该是在Session对象创建之前还是之后被调用?后.
	 *  * 作用:可以实现必要的初始化工作.
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("我的Session对象终于被创建啦。。。");
		/*
		 * HttpSessionEvent事件对象:
		 *  * 获取对应的Request对象.
		 *  * 获取对应的ServletContext对象.
		 */
	}
	/**
	 * sessionDestroyed(HttpSessionEvent arg0)
	 *  * 该方法用于监听Session对象的销毁.
	 *  * 问题:应该是在Session对象销毁之前还是之后被调用?前.
	 *  * 作用:可以实现必要的资源释放工作.
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("我的Session对象离我而去啦。。。");
	}
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
	public void contextInitialized(ServletContextEvent arg0) {
		
	}
	public void requestDestroyed(ServletRequestEvent arg0) {
		
	}
	public void requestInitialized(ServletRequestEvent arg0) {
		
	}

}
