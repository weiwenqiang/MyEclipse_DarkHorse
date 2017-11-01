package com.heima.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.heima.utils.JdbcUtils;
//��ʾ�����Ƶ����ݴ洢����ȡ
//CREATE TABLE t1
//(
//	id INT PRIMARY KEY ,
//	image BLOB 
//)
public class BlobTest {

	@Test
	public void testSave() throws Exception{
		//������Ӷ���
		Connection conn = JdbcUtils.getConnection() ;
		//����Ԥ�����������
		PreparedStatement pstmt = conn.prepareStatement("insert into t1 values(?,?)") ;
		//ָ��?��ֵ
		pstmt.setInt(1, 1) ;
		File file = new File("src/2.gif") ;
		InputStream in = new FileInputStream(file) ;
		pstmt.setBinaryStream(2,in, (int)file.length()) ;
		
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
		PreparedStatement pstmt = conn.prepareStatement("select * from t1") ;
		//ִ��sql���
		ResultSet rs = pstmt.executeQuery() ;
		if(rs.next()){
			int id = rs.getInt("id") ;
			InputStream is = rs.getBinaryStream("image") ;
			//��Ҫ�ٽ�һ���ļ�
			File f = new File("src/5.jpg") ;
			OutputStream os = new FileOutputStream(f) ;
			byte[] bs = new byte[1024] ;
			int b = 0 ;
			while((b = is.read(bs)) != -1){
				os.write(bs,0,b) ;
			}
			is.close() ;
			os.close() ;
		}
		//�ͷ���Դ
		JdbcUtils.release(rs, pstmt, conn) ;
	}

}
