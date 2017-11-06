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

	// 演示或获取DataBaseMetaData
	@Test
	public void test() throws SQLException {
		// 获取连接对象
		Connection conn = DBCPUtils.getConnection();
		// 获取DataBaseMetaData对象
		DatabaseMetaData dbmd = conn.getMetaData();
		// 获取数据库产品的名称
		String name = dbmd.getDatabaseProductName();
		System.out.println(name);
	}

	// 演示获取ParameterMetaData
	@Test
	public void test1() throws SQLException {
		// 获取连接对象
		Connection conn = DBCPUtils.getConnection();
		// 创建预处理对象
		PreparedStatement pstmt = conn.prepareStatement("??????");
		// 获取ParameterMetaData对象
		ParameterMetaData pmd = pstmt.getParameterMetaData();
		// 获取参数的个数
		int n = pmd.getParameterCount();
		System.out.println(n);
	}

	// 演示获取ResultSetMetaData
	@Test
	public void test2() throws SQLException {
		// 获取连接对象
		Connection conn = DBCPUtils.getConnection();
		// 创建预处理对象
		PreparedStatement pstmt = conn.prepareStatement("select * from customer");
		//执行sql语句
		ResultSet rs = pstmt.executeQuery() ;
		// 获取ResultSetMetaData对象
		ResultSetMetaData rsmd = rs.getMetaData() ;
		//有几列
		int n = rsmd.getColumnCount() ;	
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			System.out.println(rsmd.getColumnName(i+1));
		}
	}

}
