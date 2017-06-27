package com.mlycan.main.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.User;

public interface UserService {
	//管理员登陆
	public User adminLogin(String  account,String  password);
    
	public User findUserByAccount(String  account);
	
	public Integer updateUser(Integer userId,String  password,Integer[] positionIds);
	
	public Integer saveUser(String  account,String  password,Integer[] positionIds);
	
	public Integer deleteUserByid(Integer userId);
	
	public List<User>  findAll(Integer count,Integer curpage);

	public Integer findAllCount();
	
	
}
