package com.heima.jstl;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//��ʾģ��򵥵�ѭ��(ֻ���list)
public class SimpleForeach extends SimpleTagSupport {

	private List items ;
	
	private String var ;   //��Ϊvar�����ǳ䵱һ������ʹ�õ�
	
	
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
			//�ó���ÿһ�����󣬲��Ѷ���洢��ĳ���������
			Object obj = items.get(i) ;
			//�����������
			PageContext page = (PageContext)getJspContext() ;
			page.setAttribute(var, obj) ;
			
			//����ִ����������
			getJspBody().invoke(null) ;
		}
	}
}
