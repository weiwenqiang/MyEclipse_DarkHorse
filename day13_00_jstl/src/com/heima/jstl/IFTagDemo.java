package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//演示模拟if语句的功能
public class IFTagDemo extends SimpleTagSupport {
	
	private boolean test ;
	
	public void setTest(boolean test) {
		this.test = test;
	}

	@Override
	public void doTag() throws JspException, IOException {
		if(test){
			//执行主体内容
			getJspBody().invoke(null) ;
		}
	}
}
