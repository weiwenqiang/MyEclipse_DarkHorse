package app.java.listener2;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
/**
 * 用于测试ServletRequestAttributeListener监听器.
 * @author JYL
 *
 */
public class ServletRequestAttributeListenerTest implements ServletRequestAttributeListener {
	/**
	 * attributeAdded()
	 *  * 该方法用于监听Request对象添加属性.
	 */
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("Request对象添加了一个属性。。。");
	}
	/**
	 * attributeRemoved()
	 *  * 该方法用于监听Request对象删除属性.
	 */
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("Request对象删除了一个属性。。。");
	}
	/**
	 * attributeReplaced()
	 *  * 该方法用于监听Request对象修改属性.
	 */
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("Request对象修改了一个属性。。。");
	}

}
