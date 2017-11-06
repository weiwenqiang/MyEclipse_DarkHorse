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

//�����Զ�����
public class Test2 {

	// �������
	@Test
	public void test() {
		DBAsssist db = new DBAsssist();
		db.update("insert into account(id,name,money) values(?,?,?)", 2, "�Ƿ�",
				2000);
	}

	// ���Ը���
	@Test
	public void test1() {
		DBAsssist db = new DBAsssist();
		db.update("update account set money = money + ? where id = ?", 500, 1);
	}

	// ���Ը���
	@Test
	public void test2() {
		DBAsssist db = new DBAsssist();
		db.update("delete from account where id = ?", 1);
	}

	// ���Բ�ѯ
	@Test
	public void test3() {
		DBAsssist db = new DBAsssist();
		List<Account> list = (List<Account>)db.query("select * from account", Account.class) ;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
