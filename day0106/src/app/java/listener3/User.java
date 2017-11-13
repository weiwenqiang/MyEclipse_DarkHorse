package app.java.listener3;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 定义一个User的JavaBean.
 *  * 将该JavaBean对象绑定到Session中.
 *  * 该JavaBean实现HttpSessionBindingListener.
 *  
 * 问题:
 *  * 当JavaBean实现了HttpSessionBindingListener接口.
 *  * 污染了当前JavaBean.
 *    * 由监听器提供了多余的方法,不属于JavaBean.
 *    * JavaBean说白了就是Java类,与JavaEE是无关的.
 *    * 一旦实现HttpSessionBindingListener接口,就与JavaEE是有关的.
 * 
 * 最终建议:不建议使用.
 * @author JYL
 */
public class User implements HttpSessionBindingListener {

	private int id;
	private String name;
	private String job;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * valueBound(HttpSessionBindingEvent arg0)
	 *  * 该方法用于监听当前JavaBean被绑定到Session中.
	 *  * 执行session.setAttribute()方法时,就是绑定.
	 */
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("这个JavaBean被成功地包养了。。。");
	}
	/**
	 * valueUnbound(HttpSessionBindingEvent arg0)
	 *  * 该方法用于监听当前JavaBean从Session中解绑.
	 *  * 执行session.removeAttribute()方法时,就是解绑.
	 */
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("这个JavaBean被无情地抛弃啦。。。");
	}
	
}
