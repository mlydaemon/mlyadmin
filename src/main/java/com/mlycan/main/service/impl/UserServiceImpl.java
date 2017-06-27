/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Position;
import com.mlycan.main.entity.User;
import com.mlycan.main.mapper.UserMapper;
import com.mlycan.main.service.UserService;

/**
 * @author sean
 *
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper usermapper;
    @Override
	public List<User> findAll(Integer count, Integer curpage) {
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return usermapper.findAll(count, currentCount);
	}

	public Integer findAllCount(){
		return usermapper.findAllCount();
	}
	@Override
	public User adminLogin(String  account,String  password) {
		
		return usermapper.adminLogin(account,password);
	}
	@Override
	public Integer updateUser(Integer userId, String password,Integer[] positionIds) {
		// TODO Auto-generated method stub
		if(positionIds != null){
			usermapper.deleteUserPositions(userId);
			usermapper.replaceUserPositions(userId, positionIds);
		}
		return usermapper.updateUser( userId, password);
	}
	@Override
	public Integer saveUser(String account, String password,Integer[] positionIds) {
		// TODO Auto-generated method stub
		User user = new User();
		if(StringUtils.isBlank(account) || StringUtils.isBlank(password)){
			return null;
		}
		user.setAccount(account);
		user.setPassword(password);
		usermapper.saveUser(user);
		if(positionIds != null){
			usermapper.replaceUserPositions(user.getUserId(), positionIds);
		}
		return user.getUserId();
				
	}
	@Override
	public Integer deleteUserByid(Integer userId) {

		return usermapper.deleteUserByid(userId);
	
	}
	@Override
	public User findUserByAccount(String account) {
		
		return usermapper.findUserByAccount(account);
	
	}

}
