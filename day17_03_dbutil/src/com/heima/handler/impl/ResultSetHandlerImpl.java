package com.heima.handler.impl;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.heima.handler.ResultHandler;

//ֻ�����ڽ����ֻ��һ����¼�����
//������������ͱ��е��ֶ���Ӧ��һ��
public class ResultSetHandlerImpl implements ResultHandler {

	@Override
	public Object handler(ResultSet rs, Class clazz) {
		//�õ��������Ԫ���ݶ���
		try {
			if(rs.next()){
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
				return obj ;
			}else
				return null ;
		} catch (Exception e) {
			throw new RuntimeException() ;
		}
	}

}
