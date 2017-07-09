/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.Riddle;
import com.mlycan.main.mapper.RiddleMapper;
import com.mlycan.main.service.RiddleService;

/**
 * @author sean
 *
 */
@Service
public class RiddleServiceImpl implements RiddleService{
    @Autowired
    private RiddleMapper riddleMapper;
	
	@Override
	public List<Riddle> findAll(Integer count, Integer curpage) {
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return riddleMapper.findAll(count, currentCount);
	}

	public Integer findAllCount(){
		return riddleMapper.findAllCount();
	}
	
	@Override
	public Riddle findRiddle(Integer riddleId) {
		// TODO Auto-generated method stub
		return riddleMapper.findRiddle(riddleId);
	}
	
	@Override
	public Integer saveRiddle(String  account,String  conundrum,String  mystery,String  reminder,String  answer,String  explains,String  classify,String  createdTime,String  updateTime) {
		Riddle riddle = new Riddle();
		riddle.setAccount(account);
		riddle.setConundrum(conundrum);
		riddle.setMystery(mystery);
		riddle.setReminder(reminder);
		riddle.setAnswer(answer);
		riddle.setExplains(explains);
		riddle.setClassify(classify);
		riddle.setCreatedTime(createdTime);
		riddle.setUpdateTime(updateTime);
		return riddleMapper.saveRiddle(riddle);
	}
	@Override
	public Integer updateRiddle(Integer  riddleId,String  account,String  conundrum,String  mystery,String  reminder,String  answer,String  explains,String  classify,String  createdTime,String  updateTime) {
		
		Riddle riddle = riddleMapper.findRiddle(riddleId);
		if(riddle == null){
			return null;
		}
		if(StringUtils.isNotBlank(account)){
			riddle.setAccount(account);
		}
		if(conundrum != null ){
			riddle.setConundrum(conundrum);
		}
		if(mystery !=null){
			riddle.setMystery(mystery);		
		}
		if(reminder !=null){
			riddle.setReminder(reminder);
		}
		if(answer !=null){
			riddle.setAnswer(answer);
		}
		if(explains !=null){
			riddle.setExplains(explains);
		}
		if(classify !=null){
			riddle.setClassify(classify);
		}
		if(createdTime !=null){
			riddle.setCreatedTime(createdTime);
		}
		if(updateTime !=null){
			riddle.setUpdateTime(updateTime);
		}
		return riddleMapper.updateRiddle(riddle);
	}
	@Override
	public Integer deleteRiddle(Integer riddleId) {
		// TODO Auto-generated method stub
		return riddleMapper.deleteRiddle(riddleId);
	}

}
