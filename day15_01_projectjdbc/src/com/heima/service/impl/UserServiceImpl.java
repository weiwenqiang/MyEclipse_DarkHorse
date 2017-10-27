package com.heima.service.impl;

import com.heima.bean.User;
import com.heima.dao.UserDao;
import com.heima.dao.impl.UserDaoMySqlImpl1;
import com.heima.exception.UserExistsException;
import com.heima.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao dao = new UserDaoMySqlImpl1() ;
	
	public User login(String username, String password) {
		return dao.findUserByUserNameAndPassword(username, password);
	}

	public void register(User user) throws UserExistsException {
		//查找用户
		User u = dao.findUserByUserName(user.getUsername()) ;
		if(u == null)
			//说明用户没有注册过
			dao.add(user) ;
		else
			throw new UserExistsException() ;
	}
}
