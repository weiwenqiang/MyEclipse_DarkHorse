package com.heima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


//��ʾע�����������ַ�ʽ
public class JdbcDemo2 {

	public static void main(String[] args) throws Exception {
		//1. ע������
		  //��һ�ַ�ʽ
		    Driver driver = new Driver() ;
		    DriverManager.registerDriver(driver) ;
			
		    //�ڶ��ַ�ʽ
//			Driver d = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance() ;
//			DriverManager.registerDriver(d) ;
		
		//�����ַ�ʽ
		  Class.forName("com.mysql.jdbc.Driver") ;  //�Զ�����ע��
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
