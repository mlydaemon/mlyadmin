/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Logic;
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
	public List<Logic> findAll(Integer count, Integer curpage) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return logicMapper.findAll(count, currentCount);
	}

	public Integer findAllCount(){
		return logicMapper.findAllCount();
	}
	
	@Override
	public Logic findLogic(Integer logicId) {
		// TODO Auto-generated method stub
		return logicMapper.findLogic(logicId);
	}
	
	@Override
	public Integer saveLogic(String logicName,String semantic,String code,String comment) {
		Logic logic = new Logic();
		logic.setLogicName(logicName);
		logic.setSemantic(semantic);
		logic.setCode(code);
		logic.setComment(comment);
		return logicMapper.saveLogic(logic);
	}
	@Override
	public Integer updateLogic(Integer  logicId,String logicName,String semantic,String code,String comment) {
		
		Logic logic = logicMapper.findLogic(logicId);
		if(logic == null){
			return null;
		}
		if(StringUtils.isNotBlank(logicName)){
			logic.setLogicName(logicName);
		}
		if(semantic != null ){
			logic.setSemantic(semantic);
		}
		if(code !=null){
			logic.setCode(code);
		}
		if(comment !=null){
			logic.setComment(comment);
		}
		return logicMapper.updateLogic(logic);
	}
	@Override
	public Integer deleteLogic(Integer logicId) {
		return logicMapper.deleteLogic(logicId);
	}

}
