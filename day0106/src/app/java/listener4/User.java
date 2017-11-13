package app.java.listener4;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 定义一个User的JavaBean.
 * 
 * @author JYL
 */
public class User implements HttpSessionActivationListener,Serializable {

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
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("Session成功地从火星回来啦。。。");
	}
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("Session成功地逃离地球啦。。。");
	}
	
}
