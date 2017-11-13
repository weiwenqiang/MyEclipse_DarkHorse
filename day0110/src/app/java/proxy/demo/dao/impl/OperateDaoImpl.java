package app.java.proxy.demo.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import app.java.proxy.demo.bean.Privileges;
import app.java.proxy.demo.bean.Userinfo;
import app.java.proxy.demo.dao.OperateDao;
import app.java.proxy.demo.utils.JDBCUtils;

public class OperateDaoImpl implements OperateDao {

	@Override
	public List<Privileges> findPrivileges(int id) {
		try {
			QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
			String sql = "SELECT * FROM userprivilege WHERE user_id=?";
			List<Privileges> privileges = runner.query(sql, new BeanListHandler<Privileges>(Privileges.class), id);
			return privileges;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
