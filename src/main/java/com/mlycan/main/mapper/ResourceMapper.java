/**
 * 
 */
package com.mlycan.main.mapper;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Resource;

/**
 * @author sean
 *
 */
public interface ResourceMapper {
    
	public Resource findResource(@Param("resourceId")Integer resourceId);
	
	public Integer saveResource(Resource resource);
	
	public Integer deleteResourceByid(@Param("resourceId")Integer resourceId);
}
