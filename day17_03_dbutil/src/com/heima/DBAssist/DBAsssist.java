package com.heima.DBAssist;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.heima.handler.ResultHandler;
import com.heima.handler.impl.ResultSetHandlerImpl;
import com.heima.handler.impl.ResultSetListenerHandlerImpl;
import com.heima.utils.DBCPUtils;

//自定义框架
public class DBAsssist {

	// 执行添改删语句
	public boolean update(String sql, Object... params) {
		// 拿到连接对象
		Connection conn = DBCPUtils.getConnection();
		int t = 0;
		try {
			// 创建预处理命令对象
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 对?进行赋值
			// 获取ParameterMetaData对象
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			// 拿到?的个数
			int n = pmd.getParameterCount();
			if (n > 0) {
				// sql语句里有?号
				if (params == null || params.length != n) {
					throw new RuntimeException("参数的个数不匹配");
				}
				// 依次给每个?赋值
				for (int i = 0; i < n; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
			}

			t = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close(); // 还回池中了
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return t > 0 ? true : false;
	}

	// 执行添改删语句
	public Object query(String sql,Class clazz, Object... params) {
		// 拿到连接对象
		Connection conn = DBCPUtils.getConnection();
		try {
			// 创建预处理命令对象
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 对?进行赋值
			// 获取ParameterMetaData对象
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			// 拿到?的个数
			int n = pmd.getParameterCount();
			if (n > 0) {
				// sql语句里有?号
				if (params == null || params.length != n) {
					throw new RuntimeException("参数的个数不匹配");
				}
				// 依次给每个?赋值
				for (int i = 0; i < n; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
			}

			ResultSet rs = pstmt.executeQuery();
			return new ResultSetListenerHandlerImpl().handler(rs, clazz) ;
		} catch (SQLException e) {
			throw new RuntimeException() ;
		} finally {
			try {
				conn.close(); // 还回池中了
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
