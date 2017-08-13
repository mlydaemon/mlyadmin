package com.mlycan.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Customer;
import com.mlycan.main.mapper.CustomerMapper;
import com.mlycan.main.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerMapper customermapper;
	@Override
	public List<Customer> findAll(Integer count, Integer curpage) {
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return customermapper.findAll(count, currentCount);
	
	}

	public Integer findAllCount(){
		
		return customermapper.findAllCount();
		
	}

	@Override
	public Integer updatePrint(Integer customerId) {
		// TODO Auto-generated method stub
		return customermapper.updatePrint(customerId);
	}
	
}
