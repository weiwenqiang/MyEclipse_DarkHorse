package com.heima.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

import org.junit.Test;

import com.heima.utils.JdbcUtils;

public class BatchTest {

	// ͨ��Statement���������ʾһ������3����¼
	@Test
	public void testStatement() throws Exception {
		// ������Ӷ���
		Connection conn = JdbcUtils.getConnection();
		// ����Ԥ�����������
		Statement stmt = conn.createStatement();

		String sql1 = "insert into t3 values(1,'�����',20)";
		String sql2 = "insert into t3 values(2,'���',23)";
		String sql3 = "insert into t3 values(3,'�Ƿ�',24)";

		// ������sql���һ�����stmt�����У�һ���͵�����ִ��,��DBMS�л�����һ���߼�ִ�е�Ԫ�������ٶȻ����һЩ
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);

		// ִ��sql���
		stmt.executeBatch();
		// �ͷ���Դ
		JdbcUtils.release(null, stmt, conn);
	}

	// ͨ��PreparedStatement���������������
	@Test
	public void testPreparedStatement() throws Exception {
		// ������Ӷ���
		Connection conn = JdbcUtils.getConnection();
		// ����Ԥ�����������
		PreparedStatement pstmt = conn
				.prepareStatement("insert into t3 values(?,?,?)");
		// ָ��?��ֵ
		pstmt.setInt(1, 4);
		pstmt.setString(2, "����");
		pstmt.setInt(3, 18);

		pstmt.addBatch();
		// ָ��?��ֵ
		pstmt.setInt(1, 5);
		pstmt.setString(2, "С��Ů");
		pstmt.setInt(3, 17);

		pstmt.addBatch();
		// ָ��?��ֵ
		pstmt.setInt(1, 6);
		pstmt.setString(2, "����");
		pstmt.setInt(3, 18);

		pstmt.addBatch();
		// ִ��sql���
		pstmt.executeBatch();
		// �ͷ���Դ
		JdbcUtils.release(null, pstmt, conn);
	}

	// ͨ��PreparedStatement�������1000������
	@Test
	public void testPreparedStatement1() throws Exception {
		// ������Ӷ���
		Connection conn = JdbcUtils.getConnection();
		System.out.println(new Date());
		// ����Ԥ�����������
		PreparedStatement pstmt = conn
				.prepareStatement("insert into t3 values(?,?,?)");
		
		for (int i = 0; i < 1000; i++) {
			// ָ��?��ֵ
			pstmt.setInt(1, i);
			pstmt.setString(2, "����" + i);
			pstmt.setInt(3, i);
			
			pstmt.addBatch();
			
			if(i%200 == 0){
				//ִ��sql���
				pstmt.executeBatch() ;
				//һ��Ҫ��ջ���
				pstmt.clearBatch() ;
			}	
		}

		//Ϊ�˷�ֹ�����л���sqlû��ִ�У�Ӧ���ٴ� ִ��sql���
		pstmt.executeBatch();
		System.out.println(new Date());
		// �ͷ���Դ
		JdbcUtils.release(null, pstmt, conn);
	}

}
