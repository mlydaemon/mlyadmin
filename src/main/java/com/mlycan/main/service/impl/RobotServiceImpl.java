/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Robot;
import com.mlycan.main.mapper.RobotMapper;
import com.mlycan.main.service.RobotService;

/**
 * @author sean
 *
 */
@Service
public class RobotServiceImpl implements RobotService{
    @Autowired
    private RobotMapper robotMapper;
	
	@Override
	public List<Robot> findAll(Integer count, Integer curpage,Integer parentId) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return robotMapper.findAll(count, currentCount,parentId);
	}

	public Integer findAllCount(){
		return robotMapper.findAllCount();
	}
	
	@Override
	public Robot findRobot(Integer robotId) {
		// TODO Auto-generated method stub
		return robotMapper.findRobot(robotId);
	}
	
	@Override
	public Integer saveRobot(String account,String nickname,Integer speciesId,Long birthday,Integer gender,String comefrom,String intro,String comment) {
		Robot robot = new Robot();
		robot.setAccount(account);
		robot.setNickname(nickname);
		robot.setSpeciesId(speciesId);
		robot.setBirthday(birthday);
		robot.setGender(gender);
		robot.setComefrom(comefrom);
		robot.setIntro(intro);
		robot.setComment(comment);
		return robotMapper.saveRobot(robot);
	}
	@Override
	public Integer updateRobot(Integer robotId,String account,String nickname,Integer speciesId,Long birthday,Integer gender,String comefrom,String intro,String comment) {
		
		Robot robot = robotMapper.findRobot(robotId);
		if(robot == null){
			return null;
		}
		if(StringUtils.isNotBlank(account)){
			robot.setAccount(account);
		}
		if(nickname != null ){
			robot.setNickname(nickname);
		}
		if(speciesId !=null){
			robot.setSpeciesId(speciesId);
		}
		if(birthday !=null){
			robot.setBirthday(birthday);
		}
		if(gender !=null){
			robot.setGender(gender);
		}
		if(comefrom !=null){
			robot.setComefrom(comefrom);
		}
		if(intro !=null){
			robot.setIntro(intro);
		}
		if(comment !=null){
			robot.setComment(comment);
		}
		return robotMapper.updateRobot(robot);
	}
	@Override
	public Integer deleteRobot(Integer robotId) {
		return robotMapper.deleteRobot(robotId);
	}

}
