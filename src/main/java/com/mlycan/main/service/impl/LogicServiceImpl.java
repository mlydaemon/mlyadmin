/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Logic;
import com.mlycan.main.entity.Scene;
import com.mlycan.main.mapper.LogicMapper;
import com.mlycan.main.service.LogicService;

/**
 * @author sean
 *
 */
@Service
public class LogicServiceImpl implements LogicService{
    @Autowired
    private LogicMapper logicMapper;
    @Override
	public List<Logic> findList(Integer sceneId) {
		
		return logicMapper.findList(sceneId);
	}
	@Override
	public List<Logic> findAll(String sceneName,Integer count, Integer curpage) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return logicMapper.findAll(sceneName,count, currentCount);
	}

	public Integer findAllCount(String sceneName){
		return logicMapper.findAllCount(sceneName);
	}
	
	@Override
	public Logic findLogic(Integer logicId) {
		// TODO Auto-generated method stub
		return logicMapper.findLogic(logicId);
	}
	
	@Override
	public Integer saveLogic(Integer sceneId,String logicName,String command,String semantic,String code,String comment,String keywords) {
		Logic logic = new Logic();
		logic.setSceneId(sceneId);
		logic.setLogicName(logicName);
		logic.setCommand(command);
		logic.setSemantic(semantic);
		logic.setCode(code);
		logic.setComment(comment);
		logic.setKeywords(keywords);
		return logicMapper.saveLogic(logic);
	}
	@Override
	public Integer updateLogic(Integer  logicId,Integer sceneId,String logicName,String command,String semantic,String code,String comment,String keywords) {
		
		Logic logic = logicMapper.findLogic(logicId);
		if(logic == null){
			return null;
		}
		if(sceneId != null){
			logic.setSceneId(sceneId);
		}
		//不允许重置为空
		if(StringUtils.isNotBlank(logicName)){
			logic.setLogicName(logicName);
		}
		//不允许重置为空
		if(StringUtils.isNotBlank(command)){
			logic.setCommand(command);
		}
		//不允许重置为空
		if(StringUtils.isNotBlank(semantic) ){
			logic.setSemantic(semantic);
		}
		//不允许重置为空
		if(StringUtils.isNotBlank(code)){
			logic.setCode(code);
		}
		//可以设置为空格
		if(comment !=null){
			logic.setComment(comment);
		}
		if(keywords !=null){
			logic.setKeywords(keywords);
		}
		return logicMapper.updateLogic(logic);
	}
	@Override
	public Integer deleteLogic(Integer logicId) {
		return logicMapper.deleteLogic(logicId);
	}
	@Override
	public Logic findLogicForTrain(String robotAccount, String application, String semantic) {
		
		return logicMapper.findLogicForTrain(robotAccount, application, semantic);
	}

}
