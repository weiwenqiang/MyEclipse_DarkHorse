package com.heima.pool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

//让包装类继承适配器类
//只需要重写需要改写的方法即可
/**
* 创建一个适配器
* 口诀：
* 	a. 写一个类，继承适配器类 (使他们具有相同的行为)
*   b. 创建一个实例变量，引用被包装类对象 (最好做到与具体类无关)
*   c. 编写一个构造函数，传入被包装类对象 (注入： DI)
*   e. 对需要改写的方法重写代码即可
* @author Administrator
*
*/
public class MyConnection5 extends MyConenction4 {

	private Connection conn ;
	
	private LinkedList<Connection> pool ;
	
	public MyConnection5(Connection conn,LinkedList<Connection> pool) {
		super(conn) ;
		this.pool = pool ;
	}
	
	@Override
	public void close() throws SQLException {
		//将连接放回池中
		pool.add(conn) ;
	}
	
}
