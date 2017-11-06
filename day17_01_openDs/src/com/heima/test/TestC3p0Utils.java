package com.heima.test;

import java.sql.Connection;

import com.heima.utils.C3p0Utils;
import com.heima.utils.DBCPUtils;

public class TestC3p0Utils {

	public static void main(String[] args) {
		Connection conn = C3p0Utils.getConnection() ;
		System.out.println(conn.getClass().getName());
	}
}
