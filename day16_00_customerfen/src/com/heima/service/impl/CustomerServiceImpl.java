package com.heima.service.impl;

import java.util.List;

import com.heima.bean.Customer;
import com.heima.dao.CustomerDao;
import com.heima.dao.impl.CustomerDaoImpl;
import com.heima.service.CustomerService;
import com.heima.web.formbean.Page;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao dao = new CustomerDaoImpl() ;

	public boolean add(Customer customer) {
		return dao.add(customer);
	}

	public boolean update(Customer customer) {
		return dao.update(customer);
	}

	public boolean delete(String id) {
		return dao.delete(id);
	}

	public List<Customer> getAllCustomer() {
		return dao.getAllCustomer();
	}

	public Customer findCustomerById(String id) {
		return dao.findCustomerById(id);
	}
	
	public Page getPageList(int currentPageIndex, int count) {
		//��ѯ���еļ�¼��
		int totalCount = dao.getTotalCount() ;
		//����Page����
		Page page = new Page(totalCount,count) ;
		page.setCurrentPageIndex(currentPageIndex) ;
		//�趨ҳ��Ҫ��ʾ���ݵļ���
		page.setList(dao.getPageList(currentPageIndex, count)) ;
		
		return page;
	}
	
	public int getPageCount(int count) {
		//��ѯ���еļ�¼��
		int totalCount = dao.getTotalCount() ;
		
		return (totalCount +count -1) /count ;
	}

}
