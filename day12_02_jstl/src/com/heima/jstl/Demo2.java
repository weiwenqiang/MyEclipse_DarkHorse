package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//��ʾ���ƽ�����ǩ������ݲ�ִ��
public class Demo2 extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		//�õ���������
		JspFragment body = getJspBody() ;
		//��һ�ְ취
//		//�õ�pageContext����
//		PageContext page = (PageContext) body.getJspContext() ;
//		//�õ����������
//		JspWriter out = page.getOut() ;
//		//�����������
//		body.invoke(out) ;
		//�ڶ��ְ취
		body.invoke(null) ;
		
		throw new SkipPageException() ;		
	}
}
