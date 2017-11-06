package com.heima.test;

import java.sql.Connection;

import com.heima.utils.DBCPUtils;

public class TestDBCPUtils {

	public static void main(String[] args) {
		Connection conn = DBCPUtils.getConnection() ;
		System.out.println(conn.getClass().getName());
	}
}
