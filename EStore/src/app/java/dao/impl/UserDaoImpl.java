package app.java.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import app.java.bean.User;
import app.java.dao.UserDao;
import app.java.utils.JDBCUtils;

public class UserDaoImpl implements UserDao {

	private QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
	
	public User findUserByEmail(User user) {
		try {
			String sql = "SELECT * FROM user WHERE email=?";
			User newUser = runner.query(sql, new BeanHandler<User>(User.class), user.getEmail());
			return newUser;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean addUser(User user) {
		try {
			String sql = "INSERT INTO user VALUES(NULL,?,?,?,?,1,NULL)";
			int index = runner.update(sql, user.getEmail(), user.getPassword(), user.getNickname(), "user");
			if(index > 0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public User findUser(User user) {
		try {
			String sql = "SELECT * FROM user WHERE email=? AND password=?";
			User newUser = runner.query(sql, new BeanHandler<User>(User.class), user.getEmail(), user.getPassword());
			return newUser;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
