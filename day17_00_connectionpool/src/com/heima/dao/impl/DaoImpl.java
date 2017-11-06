package com.heima.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;

import com.heima.pool.MyConnectionPool1;
import com.heima.pool.MyDataDource2;
import com.heima.utils.JdbcUtils;

//模拟连接池的原理
public class DaoImpl {
	
//	private  DataSource ds ;
//	
//	public DaoImpl(DataSource ds) {
//		this.ds = ds ;
//	}

	@Test
	public void add(){
		DataSource ds = new MyDataDource2()  ; ;
		//拿到连接
		Connection conn = null ;
		PreparedStatement pstmt = null ;
		try {
			//conn = MyConnectionPool1.getConnection() ;   // 左边； 抽象层   右边： 真实的对象 com.mysql.jdbc.Connecotion
			conn = ds.getConnection() ;   //通过数据源去拿取连接
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
					conn.close() ;    //不能关
					                   //一定要还回池中,此时需要改写close方法.
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
