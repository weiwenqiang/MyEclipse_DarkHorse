package com.heima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


//��ʾ��������ƶ�
public class JdbcDemo6 {

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
		   rs.first() ;  //�ƶ�����һ��
		   rs.last() ;  //�ƶ������һ��
		   rs.absolute(5) ;  //�ƶ���������
		   rs.previous() ; //�ƶ�����4��
		   //rs.afterLast() ;   //�ƶ������һ����¼�ĺ��
		   System.out.println(rs.getInt("id") + ":" + rs.getString("name") + ":" + rs.getString("address"));
		//6. �ر�����,������󣬽����
		   rs.close() ;
		   stmt.close();
		   conn.close() ;
	}
}
