package com.heima.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class OtherwiseTagDemo extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		//�õ�����ǩ�еı������жϱ�����ֵ�����Ƿ�ִ����������
		ChooseTagDemo choose = (ChooseTagDemo)getParent() ;
		if(choose.isFlag()){
			//ִ��else���ֵ���������
			getJspBody().invoke(null) ;
		}
	}
}
