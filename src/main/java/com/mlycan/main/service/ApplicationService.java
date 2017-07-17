/**
 * 
 */
package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Application;

/**
 * 
 */
public interface ApplicationService {
	
	public List<Application> findAll(Integer count,Integer curpage);
	
	public Integer findAllCount();
	
	public Application findApplication(Integer appId);
	
	public Integer saveApplication(String account,String application,String  app_name,String classify,String semantic,Integer active);
	
	public Integer updateApplication(Integer appId,String account,String application,String appName,String classify,String semantic,Integer active);
	
	public Integer deleteApplication(Integer appId);
}
