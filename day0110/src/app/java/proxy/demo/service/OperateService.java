package app.java.proxy.demo.service;

import java.util.List;

import app.java.proxy.demo.bean.Privileges;
import app.java.proxy.demo.bean.Userinfo;
import app.java.proxy.demo.utils.Privilegeinfo;

public interface OperateService {

	public List<Privileges> findPrivilege(int id);

	@Privilegeinfo("添加图书")
	public String addBook(Userinfo userinfo);

	@Privilegeinfo("修改图书")
	public String editBook(Userinfo userinfo);

	@Privilegeinfo("查看图书")
	public String lookBook(Userinfo userinfo);

	@Privilegeinfo("删除图书")
	public String delBook(Userinfo userinfo);

}
