package com.heima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//��ʾ��һ��JDBC����
public class JdbcDemo5 {

	public static void main(String[] args) throws Exception {
		//1. ע������
		   Class.forName("com.mysql.jdbc.Driver") ;
		//2. ����һ�����Ӷ���
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root") ; 
		//3. ����һ��sql���ķ����������
		   Statement stmt = conn.createStatement() ;
		//4. ִ��SQL,�õ���ѯ�Ľṹ������
		   ResultSet rs = stmt.executeQuery("select id ���,name ���� from stu") ;
		//5. ��������������
		   while(rs.next()){
			  // System.out.println(rs.getInt("id") + ":" + rs.getString("name") + ":" + rs.getString("address"));
			  //��һ�֣������ֶ�����ȡ (�Ƽ�)
			  // int id = rs.getInt("���") ;  //�ǽ�������ֶ���
			 //  String name = rs.getString("����") ;
			   
			   //�ڶ���: �����ֶε�����(������1��ʼ)
			   int id = rs.getInt(1) ;
			   String name = rs.getString(2) ;
			   
			   System.out.println(id + ":" + name);
		   }
		//6. �ر�����,������󣬽����
		   rs.close() ;
		   stmt.close();
		   conn.close() ;
	}
}
