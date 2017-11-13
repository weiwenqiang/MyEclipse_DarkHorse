package app.java.proxy.demo.service.impl;

import java.util.List;

import app.java.proxy.demo.bean.Privileges;
import app.java.proxy.demo.bean.Userinfo;
import app.java.proxy.demo.dao.OperateDao;
import app.java.proxy.demo.dao.impl.OperateDaoImpl;
import app.java.proxy.demo.service.OperateService;
import app.java.proxy.demo.utils.Privilegeinfo;

public class OperateServiceImpl implements OperateService {

	@Override
	public List<Privileges> findPrivilege(int id) {
		OperateDao operateDao = new OperateDaoImpl();
		List<Privileges> privileges = operateDao.findPrivileges(id);
		return privileges;
	}

	@Override
	public String addBook(Userinfo userinfo) {
		return null;
	}

	@Override
	public String editBook(Userinfo userinfo) {
		return null;
	}

	@Override
	public String lookBook(Userinfo userinfo) {
		return null;
	}

	@Override
	public String delBook(Userinfo userinfo) {
		return null;
	}

}
