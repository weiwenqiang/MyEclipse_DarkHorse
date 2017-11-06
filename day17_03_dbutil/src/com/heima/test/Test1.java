package com.heima.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import com.heima.utils.DBCPUtils;

public class Test1 {

	// ��ʾ���ȡDataBaseMetaData
	@Test
	public void test() throws SQLException {
		// ��ȡ���Ӷ���
		Connection conn = DBCPUtils.getConnection();
		// ��ȡDataBaseMetaData����
		DatabaseMetaData dbmd = conn.getMetaData();
		// ��ȡ���ݿ��Ʒ������
		String name = dbmd.getDatabaseProductName();
		System.out.println(name);
	}

	// ��ʾ��ȡParameterMetaData
	@Test
	public void test1() throws SQLException {
		// ��ȡ���Ӷ���
		Connection conn = DBCPUtils.getConnection();
		// ����Ԥ�������
		PreparedStatement pstmt = conn.prepareStatement("??????");
		// ��ȡParameterMetaData����
		ParameterMetaData pmd = pstmt.getParameterMetaData();
		// ��ȡ�����ĸ���
		int n = pmd.getParameterCount();
		System.out.println(n);
	}

	// ��ʾ��ȡResultSetMetaData
	@Test
	public void test2() throws SQLException {
		// ��ȡ���Ӷ���
		Connection conn = DBCPUtils.getConnection();
		// ����Ԥ�������
		PreparedStatement pstmt = conn.prepareStatement("select * from customer");
		//ִ��sql���
		ResultSet rs = pstmt.executeQuery() ;
		// ��ȡResultSetMetaData����
		ResultSetMetaData rsmd = rs.getMetaData() ;
		//�м���
		int n = rsmd.getColumnCount() ;	
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			System.out.println(rsmd.getColumnName(i+1));
		}
	}

}
