package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//模拟执行if else功能
public class ChooseTagDemo extends SimpleTagSupport{
	private boolean flag = true ;  //通过此变量的值来决定是否执行else部分

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		getJspBody().invoke(null) ;
	}
	
}
