package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Scene;

public interface SceneService {
	   
		public List<Scene>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Scene  findScene(Integer sceneId);
		
		public Integer saveScene(String sceneName,String application,String semantic,Integer active,String comment);
		
		public Integer updateScene(Integer  sceneId,String sceneName,String application,String semantic,Integer active,String comment);
		
		public Integer deleteScene(Integer sceneId);
		
}
