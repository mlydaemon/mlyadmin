package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.SceneLogic;

public interface SceneLogicService {
	   
		public List<SceneLogic>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public SceneLogic  findSceneLogic(Integer slogicId);
		
		public Integer saveSceneLogic(String logicName,String comment);
		
		public Integer updateSceneLogic(Integer  slogicId,String LogicName,String comment);
		
		public Integer deleteSceneLogic(Integer slogicId);
		
}
