package com.heima.web.formbean;

import java.io.Serializable;
import java.util.List;

import com.heima.bean.Customer;

public class Page implements Serializable{

	private int currentPageIndex ; //��ǰҳ������
	
	private int pageCount ;   //�ܹ��ж���ҳ
	
	private int count = 10;  //ÿҳ��ʾ����������
	
	private int totalDataCount ;   //���й��ж���������
	
	private int startIndex = 1;  //��ʾҳ����������ʼ����
	
	private int endIndex = 5 ;  //��ʾҳ�������Ľ�������
	
	private List<Customer> list  ; //ҳ��Ҫ��ʾ���������ݵļ��� 
	
	public Page(int totalCount,int count){
		this.totalDataCount = totalCount ;
		this.count = count ;
		
		//���㹫�ж���ҳ
		pageCount = (totalCount + count - 1)/count ;
	}

	public int getCurrentPageIndex() {
		return currentPageIndex;
	}

	public void setCurrentPageIndex(int currentPageIndex) {
		this.currentPageIndex = currentPageIndex;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCOunt) {
		this.pageCount = pageCOunt;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalDataCount() {
		return totalDataCount;
	}

	public void setTotalDataCount(int totalDataCount) {
		this.totalDataCount = totalDataCount;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public List<Customer> getList() {
		return list;
	}

	public void setList(List<Customer> list) {
		this.list = list;
	}
}
