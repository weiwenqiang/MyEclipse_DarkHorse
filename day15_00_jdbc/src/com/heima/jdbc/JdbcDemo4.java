package com.heima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//演示第一个JDBC案例
public class JdbcDemo4 {

	public static void main(String[] args) throws Exception {
		//1. 注册驱动
		   Class.forName("com.mysql.jdbc.Driver") ;
		//2. 创建一个连接对象
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root") ; 
		//3. 创建一个sql语句的发送命令对象
		   Statement stmt = conn.createStatement() ;
		//4. 执行SQL,拿到查询的结构集对象
		   //String sql = "insert into stu(id,name,sex,age,address) values(12,'东方不败','男',20,'黒木崖')" ;
		  // String sql = "update stu set sex ='女' where id = 12" ;
		   String sql = "delete from stu where id  = 12" ;
		   int n = stmt.executeUpdate(sql) ;
		   System.out.println(n);
		   
		//5. 关闭连接,命令对象，结果集
		   stmt.close();
		   conn.close() ;
	}
}
