package com.heima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//演示第一个JDBC案例
public class JdbcDemo1 {

	public static void main(String[] args) throws Exception {
		//1. 注册驱动
		   Class.forName("com.mysql.jdbc.Driver") ;
		//2. 创建一个连接对象
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root") ; 
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
