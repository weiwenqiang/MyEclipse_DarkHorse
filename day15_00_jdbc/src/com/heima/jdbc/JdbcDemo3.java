package com.heima.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


//演示创建连接对象的三种方式
public class JdbcDemo3 {

	public static void main(String[] args) throws Exception {
		
		String driverClass = "" ;
		String url = "" ;
		String user = "" ;
		String password = "" ;
		
		 Properties pro = new Properties() ;
		 InputStream in = JdbcDemo3.class.getClassLoader().getResourceAsStream("dbcfg.properties") ;
		 pro.load(in) ;
		 
		 
		 driverClass = pro.getProperty("driverClass") ;
		 url = pro.getProperty("url") ;
		 user = pro.getProperty("user") ;
		 password = pro.getProperty("password") ;
		
		
		
		//1. 注册驱动
		   Class.forName(driverClass) ;
		//2. 创建一个连接对象
		   //第一种方式
		   //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?user=root&password=root") ;
		   //第二种方式
		    //读取properties文件
//		   Properties pro = new Properties() ;
//		   InputStream in = JdbcDemo3.class.getClassLoader().getResourceAsStream("dbcfg.properties") ;
//		   pro.load(in) ;
//		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", pro) ;
		   
		   //第三种方式
		   Connection conn = DriverManager.getConnection(url,user,password) ; 
		//3. 创建一个sql语句的发送命令对象
		   Statement stmt = conn.createStatement() ;
		//4. 执行SQL,拿到查询的结构集对象
		   ResultSet rs = stmt.executeQuery("select * from stu") ;
		//5. 输出结果集的数据
		   while(rs.next()){
			   System.out.println(rs.getInt("id") + ":" + rs.getString("name") + ":" + rs.getString("address"));
		   }
		//6. 关闭连接,命令对象，结果集
		   rs.close() ;
		   stmt.close();
		   conn.close() ;
	}
}
