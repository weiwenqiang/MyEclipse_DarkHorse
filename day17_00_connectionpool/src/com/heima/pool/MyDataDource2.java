package com.heima.pool;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.sql.DataSource;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

import com.heima.utils.JdbcUtils;

public class MyDataDource2 implements DataSource{
	
	private static LinkedList<Connection> pool = new LinkedList<Connection>() ;
	
	static{
		for (int i = 0; i < 10; i++) {
			Connection conn = JdbcUtils.getConnection() ;
			pool.add(conn) ;
		}
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		if(pool.size() > 0 ){
			 final Connection conn = pool.removeFirst() ;  //右边： com.mysql.jdbc.Connection
			 //采用包装类
			// MyConnection3 mconn = new MyConnection3(conn, pool) ;
			 //MyConnection5 mconn = new MyConnection5(conn, pool) ;
			 
			 //采用动态代理
			Connection ProxyConn =  (Connection)Proxy.newProxyInstance(conn.getClass().getClassLoader(),
					 conn.getClass().getInterfaces(), 
					 new InvocationHandler() {
						
						@Override
						public Object invoke(Object arg0, Method method, Object[] args)
								throws Throwable {
							if(method.getName().equals("close")){
								//不要关闭，而是放回池中
								pool.add(conn) ;
								return null ;
							}
							Object retVal = method.invoke(conn, args) ;
							return retVal ;
						}
					}) ;
			return ProxyConn;
		}else
			throw new RuntimeException("对不起,服务器忙") ;
 	}
	
	//-----------------------------------------
	

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
