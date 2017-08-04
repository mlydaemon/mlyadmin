/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

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
	public List<Application> findAll(Integer robotId) {
		return applicationMapper.findAll(robotId);
	}
    
}
