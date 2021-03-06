package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Customer;

public interface CustomerMapper {

	//获取客户
	public List<Customer>  findAll(@Param("count")Integer count,@Param("start")Integer start);
	
	public Integer findAllCount();
	//更新打印信息
	public Integer updatePrint(@Param("customerId")Integer customerId);
	
}
