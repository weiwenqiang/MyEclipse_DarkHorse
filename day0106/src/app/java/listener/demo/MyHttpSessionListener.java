package app.java.listener.demo;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {
	/**
	 * 创建Session表示人数增加一个.
	 *  * 在该方法中,获取ServletContext对象.
	 *  * 修改ServletContext对象的"sums"属性值.(+1)
	 *  * 将修改后的"sums"属性值,重新放回去.
	 */
	public void sessionCreated(HttpSessionEvent se) {
		ServletContext context = se.getSession().getServletContext();
		int sums = (Integer)context.getAttribute("sums");
		sums = sums + 1;
		context.setAttribute("sums", sums);
	}
	/**
	 * 销毁Session表示人数减少一个.
	 *  * 在该方法中,获取ServletContext对象.
	 *  * 修改ServletContext对象的"sums"属性值.(-1)
	 *  * 将修改后的"sums"属性值,重新放回去.
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		ServletContext context = se.getSession().getServletContext();
		int sums = (Integer)context.getAttribute("sums");
		sums = sums - 1;
		context.setAttribute("sums", sums);
	}

}
