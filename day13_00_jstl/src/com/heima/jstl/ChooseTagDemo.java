package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//ģ��ִ��if else����
public class ChooseTagDemo extends SimpleTagSupport{
	private boolean flag = true ;  //ͨ���˱�����ֵ�������Ƿ�ִ��else����

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		getJspBody().invoke(null) ;
	}
	
}
