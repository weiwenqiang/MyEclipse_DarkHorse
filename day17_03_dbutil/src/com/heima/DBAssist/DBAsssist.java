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

//�Զ�����
public class DBAsssist {

	// ִ�����ɾ���
	public boolean update(String sql, Object... params) {
		// �õ����Ӷ���
		Connection conn = DBCPUtils.getConnection();
		int t = 0;
		try {
			// ����Ԥ�����������
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ��?���и�ֵ
			// ��ȡParameterMetaData����
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			// �õ�?�ĸ���
			int n = pmd.getParameterCount();
			if (n > 0) {
				// sql�������?��
				if (params == null || params.length != n) {
					throw new RuntimeException("�����ĸ�����ƥ��");
				}
				// ���θ�ÿ��?��ֵ
				for (int i = 0; i < n; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
			}

			t = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close(); // ���س�����
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return t > 0 ? true : false;
	}

	// ִ�����ɾ���
	public Object query(String sql,Class clazz, Object... params) {
		// �õ����Ӷ���
		Connection conn = DBCPUtils.getConnection();
		try {
			// ����Ԥ�����������
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ��?���и�ֵ
			// ��ȡParameterMetaData����
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			// �õ�?�ĸ���
			int n = pmd.getParameterCount();
			if (n > 0) {
				// sql�������?��
				if (params == null || params.length != n) {
					throw new RuntimeException("�����ĸ�����ƥ��");
				}
				// ���θ�ÿ��?��ֵ
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
				conn.close(); // ���س�����
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
