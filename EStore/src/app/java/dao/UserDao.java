package app.java.dao;

import app.java.bean.User;

public interface UserDao {

	public User findUserByEmail(User user);

	public boolean addUser(User user);

	public User findUser(User user);

}
