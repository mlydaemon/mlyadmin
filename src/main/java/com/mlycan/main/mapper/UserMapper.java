package com.mlycan.main.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.User;


public interface UserMapper {
	
	//管理员登陆
	public User adminLogin(@Param("account")String  account,@Param("password")String  password);
	//新增加一个管理员
	public Integer updateUser(@Param("userId")Integer  userId,@Param("password")String  password);
	
	public Integer saveUser(User user);
	
	public Integer deleteUserByid(@Param("userId")Integer userId);
	
	//获取用户信息
	public User findUserByAccount(@Param("account")String  account);
	
	public List<User>  findAll(@Param("count")Integer count,@Param("start")Integer start);

	public Integer findAllCount();
	
	public Integer replaceUserPositions(@Param("userId")Integer userId,@Param("positionIds")Integer[] positionIds);
	
	public Integer deleteUserPositions(@Param("userId")Integer userId);
	
	
	
}
