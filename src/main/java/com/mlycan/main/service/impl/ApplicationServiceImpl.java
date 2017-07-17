/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Application;
import com.mlycan.main.mapper.ApplicationMapper;
import com.mlycan.main.service.ApplicationService;

/**
 * 
 */
@Service
public class ApplicationServiceImpl implements ApplicationService{
	@Autowired
	private ApplicationMapper applicationMapper;

	@Override
	public List<Application> findAll(Integer count, Integer curpage) {
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return applicationMapper.findAll(count, currentCount);
	}

	@Override
	public Integer findAllCount() {
		// TODO Auto-generated method stub
		return applicationMapper.findAllCount();
	}
	@Override
	public Application findApplication(Integer appId) {
		
		return applicationMapper.findApplication(appId);
	}
	@Override
	public Integer saveApplication(String account, String applicatio, String appName, String classify,
			String semantic, Integer active) {
		Application application = new Application();
		application.setAccount(account);
		application.setApplication(applicatio);
		application.setAppName(appName);
		application.setClassify(classify);
		application.setSemantic(semantic);
		application.setActive(active);
		return applicationMapper.saveApplication(application);
	}
	@Override
	public Integer updateApplication(Integer appId, String account, String application, String appName,
			String classify, String semantic, Integer active) {
		Application application2=applicationMapper.findApplication(appId);
		if (application2==null) {
			return null;
		}
		if (account!=null) {
			application2.setAccount(account);
		}
		if (application!=null) {
			application2.setApplication(application);
		}
		if (appName!=null) {
			application2.setAppName(appName);
		}
		if (classify!=null){
			application2.setClassify(classify);
		}
		if (semantic!=null) {
			application2.setSemantic(semantic);
		}
		if(active!=null){
			application2.setActive(active);
		}
		return applicationMapper.updateApplication(application2);
	}

	@Override
	public Integer deleteApplication(Integer appId) {
		return applicationMapper.deleteApplication(appId);
	}


}
