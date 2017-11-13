package app.java.anno.demo;

import java.lang.annotation.Annotation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@JDBCAnno(driverClassName = "com.mysql.driver", password = "root", url = "jdbc:mysql://localhost:3306/day0109", username = "root")
public class JDBCUtils {

	public static Connection getConnection(){
		Connection conn = null;
		
		//1 读取四大参数
		Class clazz = JDBCUtils.class;
		JDBCAnno jdbcAnno = (JDBCAnno) clazz.getAnnotation(JDBCAnno.class);
		
		//2 注册驱动类
		try {
			Class.forName(jdbcAnno.driverClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//3 DriverManager获取连接
		try {
			conn = DriverManager.getConnection(jdbcAnno.url(), jdbcAnno.username(), jdbcAnno.password());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
