package com.mlycan.main.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Customer;

public interface CustomerService {
	
	public List<Customer>  findAll(Integer count,Integer curpage);
	

	public Integer findAllCount();
	//更新打印信息
	public Integer updatePrint(Integer customerId);
		
}
