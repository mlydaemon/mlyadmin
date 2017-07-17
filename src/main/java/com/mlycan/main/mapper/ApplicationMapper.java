/**
 * 
 */
package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Application;

/**
 * 
 */
public interface ApplicationMapper {
	
	public List<Application> findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);
	
	public Integer findAllCount();
	
	public Application findApplication(@Param("appId")Integer  appId);
	
	public Integer saveApplication(Application application); 
	
	public Integer updateApplication(Application application);
	
	public Integer deleteApplication(@Param("appId")Integer appId);

}
