package com.heima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//��ʾ��һ��JDBC����
public class JdbcDemo4 {

	public static void main(String[] args) throws Exception {
		//1. ע������
		   Class.forName("com.mysql.jdbc.Driver") ;
		//2. ����һ�����Ӷ���
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root") ; 
		//3. ����һ��sql���ķ����������
		   Statement stmt = conn.createStatement() ;
		//4. ִ��SQL,�õ���ѯ�Ľṹ������
		   //String sql = "insert into stu(id,name,sex,age,address) values(12,'��������','��',20,'�\ľ��')" ;
		  // String sql = "update stu set sex ='Ů' where id = 12" ;
		   String sql = "delete from stu where id  = 12" ;
		   int n = stmt.executeUpdate(sql) ;
		   System.out.println(n);
		   
		//5. �ر�����,������󣬽����
		   stmt.close();
		   conn.close() ;
	}
}
