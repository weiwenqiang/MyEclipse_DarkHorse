package app.java.proxy.demo.service.impl;

import app.java.proxy.demo.bean.Userinfo;
import app.java.proxy.demo.dao.UserDao;
import app.java.proxy.demo.dao.impl.UserDaoImpl;
import app.java.proxy.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public Userinfo userLogin(Userinfo userinfo) {
		UserDao userDao = new UserDaoImpl();
		Userinfo newUserinfo = userDao.findUser(userinfo);
		return newUserinfo;
	}

}
