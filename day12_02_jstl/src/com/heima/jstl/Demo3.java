package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//控制主体内容重复执行
public class Demo3 extends SimpleTagSupport {

	private int count ;

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		for (int i = 0; i < count; i++) {
			getJspBody().invoke(null) ;
		}
	}
}
