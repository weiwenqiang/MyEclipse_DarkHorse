package app.java.service.impl;

import app.java.bean.User;
import app.java.dao.UserDao;
import app.java.dao.impl.UserDaoImpl;
import app.java.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();
	
	public User findUserByEmail(User user) {
		User newUser = userDao.findUserByEmail(user);
		return newUser;
	}

	public boolean addUser(User user) {
		boolean flag = userDao.addUser(user);
		return flag;
	}

	public User findUser(User user) {
		User newUser = userDao.findUser(user);
		return newUser;
	}

}
