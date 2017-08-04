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
	
	public List<Application> findAll(Integer robotId);
	
}
