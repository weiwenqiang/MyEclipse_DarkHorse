package com.heima.jstl;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

//演示输出当前时间
public class ShowTime extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		//获得当前的时间
		Date d = new Date() ;
		//获得pageContext对象
		PageContext pagecontext = (PageContext)getJspContext() ;
		//获取输出流对象
		JspWriter out = pagecontext.getOut() ;
		//向页面输出 
		out.write(d.toLocaleString()) ;
	}
}
