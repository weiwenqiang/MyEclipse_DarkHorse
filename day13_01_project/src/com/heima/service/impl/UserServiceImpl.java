package com.heima.service.impl;

import com.heima.bean.User;
import com.heima.dao.UserDao;
import com.heima.dao.impl.UserDaoImpl;
import com.heima.exception.UserExistsException;
import com.heima.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao dao = new UserDaoImpl() ;
	
	public User login(String username, String password) {
		return dao.findUserByUserNameAndPassword(username, password);
	}

	public void register(User user) throws UserExistsException {
		//�����û�
		User u = dao.findUserByUserName(user.getUsername()) ;
		if(u == null)
			//˵���û�û��ע���
			dao.add(user) ;
		else
			throw new UserExistsException() ;
	}
}
