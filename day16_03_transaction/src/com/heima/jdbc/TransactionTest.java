package com.heima.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

import com.heima.utils.JdbcUtils;
////演示事务
//CREATE TABLE bank
//(
//	id INT PRIMARY KEY, 
//	NAME VARCHAR(20) ,
//	money FLOAT 
//)
//
//INSERT INTO bank VALUES(1,"张无忌",10000) ;
//INSERT INTO bank VALUES(2,"令狐冲",1) ;
//
//SELECT * FROM bank ;

public class TransactionTest {

	//模拟执行张无忌给令狐冲转账5000
	@Test
	public void testTransaction() throws Exception {
		// 获得链接对象
		Connection conn = JdbcUtils.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("update bank set money = money -? where id = ?") ;
		pstmt.setFloat(1, 5000) ;
		pstmt.setInt(2, 1) ;
		int n = pstmt.executeUpdate() ;
		System.out.println(n);
		
		System.out.println(10/0);
		
		PreparedStatement pstmt1 = conn.prepareStatement("update bank set money = money + ? where id = ?") ;
		pstmt1.setFloat(1, 5000) ;
		pstmt1.setInt(2, 2) ;
		int n1 = pstmt1.executeUpdate() ;
		System.out.println(n1);
		
		// 释放资源
		JdbcUtils.release(null, pstmt, conn);
		JdbcUtils.release(null, pstmt1, conn);
	}
	
	//采用事务处理转账失败的情况
	@Test
	public void testTransaction1() throws Exception {
		// 获得链接对象
		Connection conn = JdbcUtils.getConnection();
		
		PreparedStatement pstmt = null ;
		PreparedStatement pstmt1 = null ;
		//让数据库不要自动提交事务
		conn.setAutoCommit(false) ;
		try{
			pstmt = conn.prepareStatement("update bank set money = money -? where id = ?") ;
			pstmt.setFloat(1, 2000) ;
			pstmt.setInt(2, 1) ;
			int n = pstmt.executeUpdate() ;
			System.out.println(n);
			
			System.out.println(10/2);
			
			pstmt1 = conn.prepareStatement("update bank set money = money + ? where id = ?") ;
			pstmt1.setFloat(1, 2000) ;
			pstmt1.setInt(2, 2) ;
			int n1 = pstmt1.executeUpdate() ;
			System.out.println(n1);
			
			//手动进行提交，体现一致性
			conn.commit() ;
		}catch(Exception  e){
			//让事务进行回滚
			conn.rollback() ;
		}
		
		// 释放资源
		JdbcUtils.release(null, pstmt, conn);
		JdbcUtils.release(null, pstmt1, conn);
	}
}
