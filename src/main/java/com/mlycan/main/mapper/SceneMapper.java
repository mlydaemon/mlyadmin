package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Scene;

public interface SceneMapper {

	public List<Scene>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public Scene  findScene(@Param("sceneId")Integer sceneId);
	
	public Integer saveScene(Scene scene);
	
	public Integer updateScene(Scene scene);
	
	public Integer deleteScene(@Param("sceneId")Integer sceneId);
	
}
