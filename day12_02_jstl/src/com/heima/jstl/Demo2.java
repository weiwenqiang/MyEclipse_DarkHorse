package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//演示控制结束标签后的内容不执行
public class Demo2 extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		//拿到主体内容
		JspFragment body = getJspBody() ;
		//第一种办法
//		//拿到pageContext对象
//		PageContext page = (PageContext) body.getJspContext() ;
//		//拿到输出流对象
//		JspWriter out = page.getOut() ;
//		//输出主体内容
//		body.invoke(out) ;
		//第二种办法
		body.invoke(null) ;
		
		throw new SkipPageException() ;		
	}
}
