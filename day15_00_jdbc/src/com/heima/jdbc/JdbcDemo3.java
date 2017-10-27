package com.heima.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


//��ʾ�������Ӷ�������ַ�ʽ
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
		
		
		
		//1. ע������
		   Class.forName(driverClass) ;
		//2. ����һ�����Ӷ���
		   //��һ�ַ�ʽ
		   //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?user=root&password=root") ;
		   //�ڶ��ַ�ʽ
		    //��ȡproperties�ļ�
//		   Properties pro = new Properties() ;
//		   InputStream in = JdbcDemo3.class.getClassLoader().getResourceAsStream("dbcfg.properties") ;
//		   pro.load(in) ;
//		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", pro) ;
		   
		   //�����ַ�ʽ
		   Connection conn = DriverManager.getConnection(url,user,password) ; 
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
