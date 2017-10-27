package com.heima.jstl;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

//��ʾ�����ǰʱ��
public class ShowTime extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		//��õ�ǰ��ʱ��
		Date d = new Date() ;
		//���pageContext����
		PageContext pagecontext = (PageContext)getJspContext() ;
		//��ȡ���������
		JspWriter out = pagecontext.getOut() ;
		//��ҳ����� 
		out.write(d.toLocaleString()) ;
	}
}
