package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Logic;
import com.mlycan.main.entity.Scene;

public interface LogicMapper {
    
	public List<Logic> findList(@Param("sceneId")Integer sceneId);
	
	public List<Logic>  findAll(@Param("sceneName")String sceneName,@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount(@Param("sceneName")String sceneName);
	
	public Logic  findLogic(@Param("logicId")Integer logicId);
	//获取逻辑节点用于配置关键词和应答
	public Logic  findLogicForConfig(@Param("logicId")Integer logicId);
		
	public Integer saveLogic(Logic logic);
	
	public Integer updateLogic(Logic logic);
	
	public Integer deleteLogic(@Param("logicId")Integer logicId);
	//机器人场景逻辑词库训练
	public Logic  findLogicForTrain(@Param("robotAccount")String robotAccount,@Param("application")String application,@Param("semantic")String semantic);
		
}
