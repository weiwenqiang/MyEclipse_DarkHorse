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
			//����Ϊ�棺�������£�1��ִ����������  2.�޸ĸ���ǩ�еı�����ֵ
			getJspBody().invoke(null) ;
			//�޸ĸ���ǩ�еı���
			ChooseTagDemo choose = (ChooseTagDemo)getParent() ;
			choose.setFlag(false) ;
		}
	}
}
