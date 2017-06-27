package com.mlycan.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Resource;
import com.mlycan.main.mapper.ResourceMapper;
import com.mlycan.main.service.ResourceService;


@Service
public class ResourceServiceImpl implements ResourceService{
	
	@Autowired
	private ResourceMapper resourcemapper;
	
	@Override
	public Resource findResource(Integer resourceId) {
		
		return resourcemapper.findResource(resourceId);
		
	}

	@Override
	public Integer saveResource(String storePath, String resourceName, String title, String keywords,
			String description, String mediaType, String contentType) {
			Resource resource = new Resource();
			resource.setStorePath(storePath);
			resource.setResourceName(resourceName);
			resource.setTitle(title);
			resource.setKeywords(keywords);
			resource.setDescription(description);
			resource.setMediaType(mediaType);
			resource.setContentType(contentType);
		    resourcemapper.saveResource(resource);
		 return resource.getResourceId();
	}

	@Override
	public Integer deleteResourceByid(Integer resourceId) {

		return resourcemapper.deleteResourceByid(resourceId);
	}

}
