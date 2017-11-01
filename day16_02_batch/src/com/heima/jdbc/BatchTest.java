package com.heima.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

import org.junit.Test;

import com.heima.utils.JdbcUtils;

public class BatchTest {

	// 通过Statement命令对象演示一个插入3条记录
	@Test
	public void testStatement() throws Exception {
		// 获得链接对象
		Connection conn = JdbcUtils.getConnection();
		// 创建预处理命令对象
		Statement stmt = conn.createStatement();

		String sql1 = "insert into t3 values(1,'令狐冲',20)";
		String sql2 = "insert into t3 values(2,'杨过',23)";
		String sql3 = "insert into t3 values(3,'乔峰',24)";

		// 将三条sql语句一起放入stmt对象中，一起发送到服务执行,在DBMS中会编译成一个逻辑执行单元，所以速度会更快一些
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);

		// 执行sql语句
		stmt.executeBatch();
		// 释放资源
		JdbcUtils.release(null, stmt, conn);
	}

	// 通过PreparedStatement对象插入三条数据
	@Test
	public void testPreparedStatement() throws Exception {
		// 获得链接对象
		Connection conn = JdbcUtils.getConnection();
		// 创建预处理命令对象
		PreparedStatement pstmt = conn
				.prepareStatement("insert into t3 values(?,?,?)");
		// 指定?的值
		pstmt.setInt(1, 4);
		pstmt.setString(2, "黄蓉");
		pstmt.setInt(3, 18);

		pstmt.addBatch();
		// 指定?的值
		pstmt.setInt(1, 5);
		pstmt.setString(2, "小龙女");
		pstmt.setInt(3, 17);

		pstmt.addBatch();
		// 指定?的值
		pstmt.setInt(1, 6);
		pstmt.setString(2, "赵敏");
		pstmt.setInt(3, 18);

		pstmt.addBatch();
		// 执行sql语句
		pstmt.executeBatch();
		// 释放资源
		JdbcUtils.release(null, pstmt, conn);
	}

	// 通过PreparedStatement对象插入1000条数据
	@Test
	public void testPreparedStatement1() throws Exception {
		// 获得链接对象
		Connection conn = JdbcUtils.getConnection();
		System.out.println(new Date());
		// 创建预处理命令对象
		PreparedStatement pstmt = conn
				.prepareStatement("insert into t3 values(?,?,?)");
		
		for (int i = 0; i < 1000; i++) {
			// 指定?的值
			pstmt.setInt(1, i);
			pstmt.setString(2, "黄蓉" + i);
			pstmt.setInt(3, i);
			
			pstmt.addBatch();
			
			if(i%200 == 0){
				//执行sql语句
				pstmt.executeBatch() ;
				//一定要清空缓存
				pstmt.clearBatch() ;
			}	
		}

		//为了防止缓存中还有sql没有执行，应当再次 执行sql语句
		pstmt.executeBatch();
		System.out.println(new Date());
		// 释放资源
		JdbcUtils.release(null, pstmt, conn);
	}

}
