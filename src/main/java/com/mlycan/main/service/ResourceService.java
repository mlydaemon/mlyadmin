package com.mlycan.main.service;


import com.mlycan.main.entity.Resource;

public interface ResourceService {
    
	public Resource findResource(Integer resourceId);
	
	public Integer saveResource(String  storePath,String  resourceName,
			String  title,String  keywords,String  description,
			String  mediaType,String  contentType);
	public Integer deleteResourceByid(Integer resourceId);
}
