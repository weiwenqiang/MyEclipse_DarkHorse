package com.heima.test;

/**
 * use day16
 * create table account
 * (
 * 	   id int primary key,
 * 	   name varchar(30) ,
 * 	   money float
 * )
 */
import java.util.List;

import org.junit.Test;

import com.heima.DBAssist.DBAsssist;
import com.heima.bean.Account;

//测试自定义框架
public class Test2 {

	// 测试添加
	@Test
	public void test() {
		DBAsssist db = new DBAsssist();
		db.update("insert into account(id,name,money) values(?,?,?)", 2, "乔峰",
				2000);
	}

	// 测试更新
	@Test
	public void test1() {
		DBAsssist db = new DBAsssist();
		db.update("update account set money = money + ? where id = ?", 500, 1);
	}

	// 测试更新
	@Test
	public void test2() {
		DBAsssist db = new DBAsssist();
		db.update("delete from account where id = ?", 1);
	}

	// 测试查询
	@Test
	public void test3() {
		DBAsssist db = new DBAsssist();
		List<Account> list = (List<Account>)db.query("select * from account", Account.class) ;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
