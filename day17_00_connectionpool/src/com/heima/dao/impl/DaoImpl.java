package com.heima.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;

import com.heima.pool.MyConnectionPool1;
import com.heima.pool.MyDataDource2;
import com.heima.utils.JdbcUtils;

//ģ�����ӳص�ԭ��
public class DaoImpl {
	
//	private  DataSource ds ;
//	
//	public DaoImpl(DataSource ds) {
//		this.ds = ds ;
//	}

	@Test
	public void add(){
		DataSource ds = new MyDataDource2()  ; ;
		//�õ�����
		Connection conn = null ;
		PreparedStatement pstmt = null ;
		try {
			//conn = MyConnectionPool1.getConnection() ;   // ��ߣ� �����   �ұߣ� ��ʵ�Ķ��� com.mysql.jdbc.Connecotion
			conn = ds.getConnection() ;   //ͨ������Դȥ��ȡ����
			System.out.println(conn.getClass().getName());
			pstmt = conn.prepareStatement("") ;
			//.......
		} catch (Exception e) {
			e.printStackTrace() ;
		}finally{
//			JdbcUtils.release(null, pstmt, null) ;
//			MyConnectionPool1.close(conn) ;
			
			if(pstmt != null){
				try {
					pstmt.close() ;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null){
				try {
					conn.close() ;    //���ܹ�
					                   //һ��Ҫ���س���,��ʱ��Ҫ��дclose����.
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
