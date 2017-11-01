package com.heima.service;

import java.util.List;

import com.heima.bean.Customer;
import com.heima.web.formbean.Page;

public interface CustomerService {


	/**
	 * 添加一个客户
	 * @param customer 要天剑的客户
	 * @return 天成成功返回TRUE，否则返回FALSE
	 */
	public boolean add(Customer customer) ;
	
	/**
	 * 修改一个客户
	 * @param customer 要修改的客户
	 * @return 成功返回TRUE，否则返回FALSE
	 */
	public boolean update(Customer customer) ;
	
	/**
	 * 根据客户的主键删除客户
	 * @param id 要删除客户的编号
	 * @return 删除成功返回TRUE，否则返回FALSE
	 */
	public boolean delete(String id) ;
	/**
	 * 获取所有的客户
	 * @return 返回所有客户的集合
	 */
	@Deprecated
	public List<Customer> getAllCustomer() ;
	
	/**
	 * 根据客户的编号查询客户
	 * @param id 客户的编号
	 * @return 查出来返回此客户，否则返回null
	 */
	public Customer findCustomerById(String id) ;
	
	/**
	 * 根据页面的索引查询本页面的腰显示的数据
	 * @param currentPageIndex 当前页的索引
	 * @param count 要显示的记录数
	 * @return
	 */
	public Page getPageList(int currentPageIndex,int count) ;
	
	/**
	 * 获取公有多少页
	 * @param count 代表的是页面显示的记录数
	 * @return 返回页面的数量
	 */
	public int getPageCount(int count) ;
}
