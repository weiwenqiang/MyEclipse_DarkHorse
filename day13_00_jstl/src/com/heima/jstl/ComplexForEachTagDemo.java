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
//演示复杂的循环(针对任意集合类型)
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
		//判断items的具体类型，然后拷贝数据到list中
		if(items instanceof List){
			list = new ArrayList((List)items) ;
		}else if(items instanceof Map){
			list = new ArrayList() ;
			//强转为map
			Map map = (Map)items ;
			for (Object obj : map.entrySet()) {
				list.add(obj) ;
			}
		}else if(items.getClass().isArray()){
			list = new ArrayList() ;
			//从数组中拷贝数据到list中
			for (int i = 0; i < Array.getLength(items); i++) {
				list.add(Array.get(items, i)) ;
			}
		}else if(items instanceof Set){
			throw new RuntimeException("不支持set类型") ;
		}else{
			throw new RuntimeException("不支持的数据类型，应当传入集合类型") ;
		}
		Iterator itr = list.iterator() ;
		PageContext page = (PageContext)getJspContext() ;
		while(itr.hasNext()){
			Object obj = itr.next() ;
			//将数据存入域对象
			page.setAttribute(var, obj) ;
			//执行主体内容
			getJspBody().invoke(null) ;
		}
	}
}
