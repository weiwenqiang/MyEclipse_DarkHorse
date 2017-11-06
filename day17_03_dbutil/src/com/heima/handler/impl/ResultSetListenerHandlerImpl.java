package com.heima.handler.impl;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.heima.handler.ResultHandler;

//只适用于结果集有多条记录的情况
//对象的属性名和表中的字段名应当一致
public class ResultSetListenerHandlerImpl implements ResultHandler {

	@Override
	public Object handler(ResultSet rs, Class clazz) {
		
		List<Object> list = new ArrayList<Object>() ;
		//拿到结果集的元数据对象
		try {
			while(rs.next()){
				ResultSetMetaData rsmd = rs.getMetaData() ;
				//拿到公有多少列
				int columnCount = rsmd.getColumnCount() ;
				//先创建对象
				Object obj = clazz.newInstance() ;
				for (int i = 0; i < columnCount; i++) {
					//拿到列名
					String columnName = rsmd.getColumnName(i+1) ;		
					//拿到对象对应的属性
					Field field = clazz.getDeclaredField(columnName) ;
					//设置私有属性可以访问
					field.setAccessible(true) ;
					//拿到此列对应的值
					Object objectValue = rs.getObject(i+1) ;
					//给属性赋值
					field.set(obj, objectValue) ;
				}
				list.add(obj) ;
			}
			return list ;
		} catch (Exception e) {
			throw new RuntimeException() ;
		}
	}

}
