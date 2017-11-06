package com.heima.handler.impl;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.heima.handler.ResultHandler;

//ֻ�����ڽ�����ж�����¼�����
//������������ͱ��е��ֶ���Ӧ��һ��
public class ResultSetListenerHandlerImpl implements ResultHandler {

	@Override
	public Object handler(ResultSet rs, Class clazz) {
		
		List<Object> list = new ArrayList<Object>() ;
		//�õ��������Ԫ���ݶ���
		try {
			while(rs.next()){
				ResultSetMetaData rsmd = rs.getMetaData() ;
				//�õ����ж�����
				int columnCount = rsmd.getColumnCount() ;
				//�ȴ�������
				Object obj = clazz.newInstance() ;
				for (int i = 0; i < columnCount; i++) {
					//�õ�����
					String columnName = rsmd.getColumnName(i+1) ;		
					//�õ������Ӧ������
					Field field = clazz.getDeclaredField(columnName) ;
					//����˽�����Կ��Է���
					field.setAccessible(true) ;
					//�õ����ж�Ӧ��ֵ
					Object objectValue = rs.getObject(i+1) ;
					//�����Ը�ֵ
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
