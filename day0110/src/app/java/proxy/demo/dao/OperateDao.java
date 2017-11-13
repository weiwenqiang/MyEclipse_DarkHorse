package app.java.proxy.demo.dao;

import java.util.List;

import app.java.proxy.demo.bean.Privileges;

public interface OperateDao {

	public List<Privileges> findPrivileges(int id);

}
