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
//演示大文本数据存储及读取
//CREATE TABLE t2
//(
//	id INT PRIMARY KEY ,
//	txt TEXT 
//)
public class ClobTest {

	@Test
	public void testSave() throws Exception{
		//获得链接对象
		Connection conn = JdbcUtils.getConnection() ;
		//创建预处理命令对象
		PreparedStatement pstmt = conn.prepareStatement("insert into t2 values(?,?)") ;
		//指定?的值
		pstmt.setInt(1, 1) ;
		File file = new File("src/a.txt") ;
		FileReader fr = new FileReader(file) ;
	    pstmt.setCharacterStream(2,fr,(int)file.length()) ;
		
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
		PreparedStatement pstmt = conn.prepareStatement("select * from t2") ;
		//执行sql语句
		ResultSet rs = pstmt.executeQuery() ;
		if(rs.next()){
			int id = rs.getInt("id") ;
			Reader reader = rs.getCharacterStream("txt") ;
			//需要再建一个文件
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
		//释放资源
		JdbcUtils.release(rs, pstmt, conn) ;
	}

}
