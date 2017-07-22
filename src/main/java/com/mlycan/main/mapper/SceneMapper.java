package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Scene;

public interface SceneMapper {
    
	public List<Scene>  findByRobotAccount(@Param("account")String account);
	
	public List<Scene>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public Scene  findScene(@Param("sceneId")Integer sceneId);
	//机器人场景核心词库训练
	public Scene  findSceneForTrain(@Param("application")String application,@Param("robotAccount")String robotAccount);
	
	public Integer saveScene(Scene scene);
	
	public Integer updateScene(Scene scene);
	
	public Integer deleteScene(@Param("sceneId")Integer sceneId);
	
}
