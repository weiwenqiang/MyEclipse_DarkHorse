package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//��ʾģ��if���Ĺ���
public class IFTagDemo extends SimpleTagSupport {
	
	private boolean test ;
	
	public void setTest(boolean test) {
		this.test = test;
	}

	@Override
	public void doTag() throws JspException, IOException {
		if(test){
			//ִ����������
			getJspBody().invoke(null) ;
		}
	}
}
