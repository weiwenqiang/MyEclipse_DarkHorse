package com.heima.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import org.junit.Test;

import com.heima.utils.JdbcUtils;
//��ʾJDBC���ô洢����
public class ProcedureTest {

	//ִ�в�������ֵ�Ĵ洢����û���κ�����
	@Test
	public void testPro2() throws Exception {
		// ������Ӷ���
		Connection conn = JdbcUtils.getConnection();
		// ����ִ�д洢���̵��������
		CallableStatement cstmt = conn.prepareCall("{call pro2(?)}") ;
		//ָ��?��ֵ
		cstmt.setInt(1, 1) ;
		//ִ�д洢����
		cstmt.execute() ;
		
		// �ͷ���Դ
		JdbcUtils.release(null, cstmt, conn);
	}
	
	@Test
	public void testPro5() throws Exception {
		// ������Ӷ���
		Connection conn = JdbcUtils.getConnection();
		// ����ִ�д洢���̵��������
		CallableStatement cstmt = conn.prepareCall("{call pro5(?,?)}") ;
		//ָ��?��ֵ
		cstmt.setInt(1, 1) ;
		//ָ���ڶ���?���������
		cstmt.registerOutParameter(2, Types.VARCHAR) ;
		
		//ִ�д洢����
		cstmt.execute() ;
		
		//��÷���ֵ
		String name = cstmt.getString(2) ;
		System.out.println(name);
		
		// �ͷ���Դ
		JdbcUtils.release(null, cstmt, conn);
	}
}
