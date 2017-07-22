package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Logic;
import com.mlycan.main.entity.Scene;

public interface LogicService {
	    
	    public List<Logic> findList(Integer sceneId);
	
	    public List<Logic>  findAll(String sceneName,Integer count,Integer curpage);

		public Integer findAllCount(String sceneName);
		
		public Logic  findLogic(Integer logicId);
		
		public Integer saveLogic(Integer sceneId,String logicName,String command,String semantic,String code,String comment);
		
		public Integer updateLogic(Integer  logicId,Integer sceneId,String logicName,String command,String semantic,String code,String comment);
		
		public Integer deleteLogic(Integer logicId);
		//机器人场景逻辑词库训练
		public Logic  findLogicForTrain(String robotAccount,String application,String semantic);
			
}