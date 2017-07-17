package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Robot;

public interface RobotService {
	   
		public List<Robot>  findAll(Integer count,Integer curpage,Integer parentId);

		public Integer findAllCount();
		
		public Robot  findRobot(Integer robotId);
		
		public Integer saveRobot(String account,String nickname,Integer speciesId,Long birthday,Integer gender,String comefrom,String intro,String comment);
		
		public Integer updateRobot(Integer  robotId,String account,String nickname,Integer speciesId,Long birthday,Integer gender,String comefrom,String intro,String comment);
		
		public Integer deleteRobot(Integer robotId);
		
}



