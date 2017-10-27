package com.heima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//演示第一个JDBC案例
public class JdbcDemo5 {

	public static void main(String[] args) throws Exception {
		//1. 注册驱动
		   Class.forName("com.mysql.jdbc.Driver") ;
		//2. 创建一个连接对象
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root") ; 
		//3. 创建一个sql语句的发送命令对象
		   Statement stmt = conn.createStatement() ;
		//4. 执行SQL,拿到查询的结构集对象
		   ResultSet rs = stmt.executeQuery("select id 编号,name 姓名 from stu") ;
		//5. 输出结果集的数据
		   while(rs.next()){
			  // System.out.println(rs.getInt("id") + ":" + rs.getString("name") + ":" + rs.getString("address"));
			  //第一种：根据字段名拿取 (推荐)
			  // int id = rs.getInt("编号") ;  //是结果集的字段名
			 //  String name = rs.getString("姓名") ;
			   
			   //第二种: 根据字段的索引(索引从1开始)
			   int id = rs.getInt(1) ;
			   String name = rs.getString(2) ;
			   
			   System.out.println(id + ":" + name);
		   }
		//6. 关闭连接,命令对象，结果集
		   rs.close() ;
		   stmt.close();
		   conn.close() ;
	}
}
