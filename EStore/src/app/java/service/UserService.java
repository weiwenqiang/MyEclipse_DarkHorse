package app.java.service;

import app.java.bean.User;

public interface UserService {

	public User findUserByEmail(User user);

	public boolean addUser(User user);

	public User findUser(User user);

}
