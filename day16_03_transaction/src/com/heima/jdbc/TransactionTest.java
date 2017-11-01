package com.heima.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;

import com.heima.utils.JdbcUtils;
////��ʾ����
//CREATE TABLE bank
//(
//	id INT PRIMARY KEY, 
//	NAME VARCHAR(20) ,
//	money FLOAT 
//)
//
//INSERT INTO bank VALUES(1,"���޼�",10000) ;
//INSERT INTO bank VALUES(2,"�����",1) ;
//
//SELECT * FROM bank ;

public class TransactionTest {

	//ģ��ִ�����޼ɸ������ת��5000
	@Test
	public void testTransaction() throws Exception {
		// ������Ӷ���
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
		
		// �ͷ���Դ
		JdbcUtils.release(null, pstmt, conn);
		JdbcUtils.release(null, pstmt1, conn);
	}
	
	//����������ת��ʧ�ܵ����
	@Test
	public void testTransaction1() throws Exception {
		// ������Ӷ���
		Connection conn = JdbcUtils.getConnection();
		
		PreparedStatement pstmt = null ;
		PreparedStatement pstmt1 = null ;
		//�����ݿⲻҪ�Զ��ύ����
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
			
			//�ֶ������ύ������һ����
			conn.commit() ;
		}catch(Exception  e){
			//��������лع�
			conn.rollback() ;
		}
		
		// �ͷ���Դ
		JdbcUtils.release(null, pstmt, conn);
		JdbcUtils.release(null, pstmt1, conn);
	}
}
