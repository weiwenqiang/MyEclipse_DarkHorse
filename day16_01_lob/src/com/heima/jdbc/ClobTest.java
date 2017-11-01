package com.heima.jdbc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.heima.utils.JdbcUtils;
//��ʾ���ı����ݴ洢����ȡ
//CREATE TABLE t2
//(
//	id INT PRIMARY KEY ,
//	txt TEXT 
//)
public class ClobTest {

	@Test
	public void testSave() throws Exception{
		//������Ӷ���
		Connection conn = JdbcUtils.getConnection() ;
		//����Ԥ�����������
		PreparedStatement pstmt = conn.prepareStatement("insert into t2 values(?,?)") ;
		//ָ��?��ֵ
		pstmt.setInt(1, 1) ;
		File file = new File("src/a.txt") ;
		FileReader fr = new FileReader(file) ;
	    pstmt.setCharacterStream(2,fr,(int)file.length()) ;
		
		//ִ��sql���
		pstmt.executeUpdate() ;
		//�ͷ���Դ
		JdbcUtils.release(null, pstmt, conn) ;
	}
	
	@Test
	public void testQuery() throws Exception{
		//������Ӷ���
		Connection conn = JdbcUtils.getConnection() ;
		//����Ԥ�����������
		PreparedStatement pstmt = conn.prepareStatement("select * from t2") ;
		//ִ��sql���
		ResultSet rs = pstmt.executeQuery() ;
		if(rs.next()){
			int id = rs.getInt("id") ;
			Reader reader = rs.getCharacterStream("txt") ;
			//��Ҫ�ٽ�һ���ļ�
			File f = new File("src/b.txt") ;
			BufferedWriter bw = new BufferedWriter(new FileWriter(f)) ;
			BufferedReader br = new BufferedReader(reader) ;
			String s = "" ;
			while((s = br.readLine()) != null){
				bw.write(s) ;
				bw.newLine() ;
			}
			br.close() ;
			bw.close() ;
			
		}
		//�ͷ���Դ
		JdbcUtils.release(rs, pstmt, conn) ;
	}

}
