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
//演示二进制的数据存储及读取
//CREATE TABLE t1
//(
//	id INT PRIMARY KEY ,
//	image BLOB 
//)
public class BlobTest {

	@Test
	public void testSave() throws Exception{
		//获得链接对象
		Connection conn = JdbcUtils.getConnection() ;
		//创建预处理命令对象
		PreparedStatement pstmt = conn.prepareStatement("insert into t1 values(?,?)") ;
		//指定?的值
		pstmt.setInt(1, 1) ;
		File file = new File("src/2.gif") ;
		InputStream in = new FileInputStream(file) ;
		pstmt.setBinaryStream(2,in, (int)file.length()) ;
		
		//执行sql语句
		pstmt.executeUpdate() ;
		//释放资源
		JdbcUtils.release(null, pstmt, conn) ;
	}
	
	@Test
	public void testQuery() throws Exception{
		//获得链接对象
		Connection conn = JdbcUtils.getConnection() ;
		//创建预处理命令对象
		PreparedStatement pstmt = conn.prepareStatement("select * from t1") ;
		//执行sql语句
		ResultSet rs = pstmt.executeQuery() ;
		if(rs.next()){
			int id = rs.getInt("id") ;
			InputStream is = rs.getBinaryStream("image") ;
			//需要再建一个文件
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
		//释放资源
		JdbcUtils.release(rs, pstmt, conn) ;
	}

}
