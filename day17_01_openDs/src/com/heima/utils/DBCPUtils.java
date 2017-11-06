package com.heima.utils;

import java.awt.image.DataBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils {

	private static DataSource ds ;
	
	static {
		//将配置文件加载进来
		InputStream in = DBCPUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties") ;
		Properties props = new Properties() ;
		try {
			props.load(in) ;
			ds = BasicDataSourceFactory.createDataSource(props) ;
		} catch (Exception e) {
			throw new RuntimeException("服务器忙") ;
		}
	}
	
	//提供获取练级的方法
	public static Connection getConnection(){
		try {
			return ds.getConnection() ;
		} catch (SQLException e) {
			throw new RuntimeException("服务器忙") ;
		}
	}
}
