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
	public Integer saveRobot(String account,String nickname,Integer speciesId,String birthday,Integer gender,String comefrom,String hobby,String comment) {
		Robot robot = new Robot();
		robot.setAccount(account);
		robot.setNickname(nickname);
		robot.setSpeciesId(speciesId);
		robot.setBirthday(birthday);
		robot.setGender(gender);
		robot.setComefrom(comefrom);
		robot.setHobby(hobby);
		robot.setComment(comment);
		int count = robotMapper.saveRobot(robot);
		count +=robotMapper.saveRobotSceneForInit(robot.getRobotId());
		return count;
	}
	@Override
	public Integer updateRobot(Integer robotId,String account,String nickname,Integer speciesId,String birthday,Integer gender,String comefrom,String hobby,String comment) {
		
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
		if(hobby !=null){
			robot.setHobby(hobby);
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

	@Override
	public Integer updateRobotScene(Integer robotId, Integer sceneId) {
		return robotMapper.updateRobotScene(robotId, sceneId,2);
	}

	@Override
	public Integer saveRobotScene(Integer robotId, Integer sceneId,Integer status) {
		return robotMapper.replaceRobotScene(robotId, sceneId, status);
	}

	@Override
	public Integer saveRobotApp(Integer robotId, Integer robotSceneId, Integer status) {
		// TODO Auto-generated method stubreplaceRobotApp
		return robotMapper.replaceRobotApp(robotId, robotSceneId, status);
	}

}
