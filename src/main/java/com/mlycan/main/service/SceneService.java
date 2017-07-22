package com.mlycan.main.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Scene;

public interface SceneService {
	   
	    public List<Scene>  findByRobotAccount(String account);
	
		public List<Scene>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Scene  findScene(Integer sceneId);
		
		public Integer saveScene(String sceneName,String application,String semantic,Integer active,String comment);
		
		public Integer updateScene(Integer  sceneId,String sceneName,String application,String semantic,Integer active,String comment);
		
		public Integer deleteScene(Integer sceneId);
		//机器人场景核心词库训练
		public Scene  findSceneForTrain(String application,String robotAccount);
		
}
