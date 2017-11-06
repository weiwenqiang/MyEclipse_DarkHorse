package com.heima.pool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

//�ð�װ��̳���������
//ֻ��Ҫ��д��Ҫ��д�ķ�������
/**
* ����һ��������
* �ھ���
* 	a. дһ���࣬�̳��������� (ʹ���Ǿ�����ͬ����Ϊ)
*   b. ����һ��ʵ�����������ñ���װ����� (���������������޹�)
*   c. ��дһ�����캯�������뱻��װ����� (ע�룺 DI)
*   e. ����Ҫ��д�ķ�����д���뼴��
* @author Administrator
*
*/
public class MyConnection5 extends MyConenction4 {

	private Connection conn ;
	
	private LinkedList<Connection> pool ;
	
	public MyConnection5(Connection conn,LinkedList<Connection> pool) {
		super(conn) ;
		this.pool = pool ;
	}
	
	@Override
	public void close() throws SQLException {
		//�����ӷŻس���
		pool.add(conn) ;
	}
	
}
