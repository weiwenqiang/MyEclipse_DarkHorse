package com.heima.jstl;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//演示控制标签的主体内容改变后输出
public class Demo4 extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		//获得主体内容
		JspFragment body = getJspBody() ;
		//我们先把数据写入到一个缓冲流中，然后从缓冲流中取出数据进行修改，修改的数据再写入输出流中
		//创建一个字符串输出缓冲流，以便可以从中拿取数据
		StringWriter sw = new StringWriter() ;
		//将数据写入缓冲流中
		body.invoke(sw) ;
		//从缓冲流中拿取数据
		String s = sw.toString() ;
		//改变数据
		s = s.toUpperCase() ;
		//获取输出流对象，将数据输出到页面上
		JspWriter out = body.getJspContext().getOut() ;
		out.write(s) ;
	}
}
