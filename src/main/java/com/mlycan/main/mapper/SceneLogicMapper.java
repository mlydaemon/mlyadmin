package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.SceneLogic;

public interface SceneLogicMapper {

	public List<SceneLogic>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public SceneLogic  findSceneLogic(@Param("slogicId")Integer slogicId);
	
	public Integer saveSceneLogic(SceneLogic SceneLogic);
	
	public Integer updateSceneLogic(SceneLogic SceneLogic);
	
	public Integer deleteSceneLogic(@Param("slogicId")Integer slogicId);
	
}
