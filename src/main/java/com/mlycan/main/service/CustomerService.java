package com.mlycan.main.service;

import java.util.List;


import com.mlycan.main.entity.Customer;

public interface CustomerService {
	
	public List<Customer>  findAll(Integer count,Integer curpage);
	

	public Integer findAllCount();
	
}
