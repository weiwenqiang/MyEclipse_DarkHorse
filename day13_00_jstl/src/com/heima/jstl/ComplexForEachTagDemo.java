package com.heima.jstl;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//��ʾ���ӵ�ѭ��(������⼯������)
public class ComplexForEachTagDemo extends SimpleTagSupport {
	
	private Object items ;
	
	private String var ;
	
	public Object getItems() {
		return items;
	}

	public void setItems(Object items) {
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
		Collection list = null ;
		//�ж�items�ľ������ͣ�Ȼ�󿽱����ݵ�list��
		if(items instanceof List){
			list = new ArrayList((List)items) ;
		}else if(items instanceof Map){
			list = new ArrayList() ;
			//ǿתΪmap
			Map map = (Map)items ;
			for (Object obj : map.entrySet()) {
				list.add(obj) ;
			}
		}else if(items.getClass().isArray()){
			list = new ArrayList() ;
			//�������п������ݵ�list��
			for (int i = 0; i < Array.getLength(items); i++) {
				list.add(Array.get(items, i)) ;
			}
		}else if(items instanceof Set){
			throw new RuntimeException("��֧��set����") ;
		}else{
			throw new RuntimeException("��֧�ֵ��������ͣ�Ӧ�����뼯������") ;
		}
		Iterator itr = list.iterator() ;
		PageContext page = (PageContext)getJspContext() ;
		while(itr.hasNext()){
			Object obj = itr.next() ;
			//�����ݴ��������
			page.setAttribute(var, obj) ;
			//ִ����������
			getJspBody().invoke(null) ;
		}
	}
}
