package app.java.proxy.demo.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import app.java.proxy.demo.bean.Userinfo;
import app.java.proxy.demo.dao.UserDao;
import app.java.proxy.demo.utils.JDBCUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public Userinfo findUser(Userinfo userinfo) {
		try {
			QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
			String sql = "SELECT * FROM userinfo WHERE username=? AND password=?";
			Userinfo newUserinfo = runner.query(sql, new BeanHandler<Userinfo>(Userinfo.class), userinfo.getUsername(), userinfo.getPassword());
			return newUserinfo;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
