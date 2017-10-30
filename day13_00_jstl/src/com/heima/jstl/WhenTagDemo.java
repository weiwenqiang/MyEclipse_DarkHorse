package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class WhenTagDemo extends SimpleTagSupport {

	private boolean test ;
	
	public void setTest(boolean test) {
		this.test = test;
	}

	@Override
	public void doTag() throws JspException, IOException {
		if(test){
			//条件为真：做两件事，1，执行主体内容  2.修改父标签中的变量的值
			getJspBody().invoke(null) ;
			//修改父标签中的变量
			ChooseTagDemo choose = (ChooseTagDemo)getParent() ;
			choose.setFlag(false) ;
		}
	}
}
