package com.heima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//��ʾ��һ��JDBC����
public class JdbcDemo1 {

	public static void main(String[] args) throws Exception {
		//1. ע������
		   Class.forName("com.mysql.jdbc.Driver") ;
		//2. ����һ�����Ӷ���
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root") ; 
		//3. ����һ��sql���ķ����������
		   Statement stmt = conn.createStatement() ;
		//4. ִ��SQL,�õ���ѯ�Ľṹ������
		   ResultSet rs = stmt.executeQuery("select * from stu") ;
		//5. ��������������
		   while(rs.next()){
			   System.out.println(rs.getInt("id") + ":" + rs.getString("name") + ":" + rs.getString("address"));
		   }
		//6. �ر�����,������󣬽����
		   rs.close() ;
		   stmt.close();
		   conn.close() ;
	}
}
