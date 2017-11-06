package com.heima.pool;

import java.sql.Connection;
import java.util.LinkedList;

import com.heima.utils.JdbcUtils;

public class MyConnectionPool1 {

	private static LinkedList<Connection> pool = new LinkedList<Connection>() ;
	
	static{
		for (int i = 0; i < 10; i++) {
			Connection conn = JdbcUtils.getConnection() ;
			pool.add(conn) ;
		}
	}
	
	public synchronized static Connection getConnection(){
		if(pool.size() > 0)
			return pool.removeFirst() ;
		else
			throw new RuntimeException("对不起，服务器忙") ;
	}
	
	public static void close(Connection conn){
		if(conn != null)
			pool.addLast(conn) ;   //放回池中   
	}
	
}
