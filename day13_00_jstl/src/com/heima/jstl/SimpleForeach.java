package com.heima.jstl;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//演示模拟简单的循环(只针对list)
public class SimpleForeach extends SimpleTagSupport {

	private List items ;
	
	private String var ;   //因为var属性是充当一个键来使用的
	
	
	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	@Override
	public void doTag() throws JspException, IOException {
		for (int i = 0; i < items.size(); i++) {
			//拿出来每一个对象，并把对象存储到某个域对象中
			Object obj = items.get(i) ;
			//存入域对象中
			PageContext page = (PageContext)getJspContext() ;
			page.setAttribute(var, obj) ;
			
			//立刻执行主体内容
			getJspBody().invoke(null) ;
		}
	}
}
