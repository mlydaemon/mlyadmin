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
	
	public List<Application> findAll(@Param("robotId")Integer robotId);

}
