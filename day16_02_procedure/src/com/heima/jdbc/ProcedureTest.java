package com.heima.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import org.junit.Test;

import com.heima.utils.JdbcUtils;
//演示JDBC调用存储过程
public class ProcedureTest {

	//执行不带返回值的存储过程没有任何任意
	@Test
	public void testPro2() throws Exception {
		// 获得链接对象
		Connection conn = JdbcUtils.getConnection();
		// 创建执行存储过程的命令对象
		CallableStatement cstmt = conn.prepareCall("{call pro2(?)}") ;
		//指定?的值
		cstmt.setInt(1, 1) ;
		//执行存储过程
		cstmt.execute() ;
		
		// 释放资源
		JdbcUtils.release(null, cstmt, conn);
	}
	
	@Test
	public void testPro5() throws Exception {
		// 获得链接对象
		Connection conn = JdbcUtils.getConnection();
		// 创建执行存储过程的命令对象
		CallableStatement cstmt = conn.prepareCall("{call pro5(?,?)}") ;
		//指定?的值
		cstmt.setInt(1, 1) ;
		//指定第二个?是输出参数
		cstmt.registerOutParameter(2, Types.VARCHAR) ;
		
		//执行存储过程
		cstmt.execute() ;
		
		//获得返回值
		String name = cstmt.getString(2) ;
		System.out.println(name);
		
		// 释放资源
		JdbcUtils.release(null, cstmt, conn);
	}
}
