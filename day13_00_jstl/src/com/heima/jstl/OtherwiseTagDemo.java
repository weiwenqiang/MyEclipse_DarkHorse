package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class OtherwiseTagDemo extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		//拿到父标签中的变量，判断变量的值决定是否执行主体内容
		ChooseTagDemo choose = (ChooseTagDemo)getParent() ;
		if(choose.isFlag()){
			//执行else部分的主体内容
			getJspBody().invoke(null) ;
		}
	}
}
