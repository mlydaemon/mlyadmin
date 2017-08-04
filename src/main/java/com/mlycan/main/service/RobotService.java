package com.mlycan.main.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Robot;

public interface RobotService {
	   
		public List<Robot>  findAll(Integer count,Integer curpage,Integer parentId);

		public Integer findAllCount();
		
		public Robot  findRobot(Integer robotId);
		
		public Integer saveRobot(String account,String nickname,Integer speciesId,String birthday,Integer gender,String comefrom,String hobby,String comment);
		
		public Integer updateRobot(Integer  robotId,String account,String nickname,Integer speciesId,String birthday,Integer gender,String comefrom,String hobby,String comment);
		
		public Integer deleteRobot(Integer robotId);
		
		 /**
	     * 
	    * @Title: deleteRobotScene 
	    * @Description: TODO(每个机器人可以根据需要，在以后逻辑的基础上删除个性化场景应用) 
	    * @param @param robotId
	    * @param @return    设定文件 
	    * @return Integer    返回类型 
	    * @throws
	     */
		public Integer updateRobotScene(Integer robotId,Integer sceneId);
	  
		 /**
	     * 
	    * @Title: saveRobotScene 
	    * @Description: TODO(每个机器人可以根据需要，在以后逻辑的基础上创建个性化场景应用) 
	    * @param @param robotId
	    * @param @return    设定文件 
	    * @return Integer    返回类型 
	    * @throws
	     */
		public Integer saveRobotScene(Integer robotId,Integer sceneId,Integer status);
		/**
		 * 
		* @Title: saveRobotApp 
		* @Description: TODO(机器人根据需要可以开启多个其他的场景机器人) 
		* @param @param robotId
		* @param @param robotSceneId
		* @param @param status
		* @param @return    设定文件 
		* @return Integer    返回类型 
		* @throws
		 */
		public Integer saveRobotApp(Integer robotId,Integer robotSceneId,Integer status);
		
}



