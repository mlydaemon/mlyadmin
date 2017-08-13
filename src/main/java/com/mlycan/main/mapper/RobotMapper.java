package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Primary;

import com.mlycan.main.entity.Robot;

public interface RobotMapper {

	public List<Robot>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage,@Param("parentId")Integer parentId);

	public Integer findAllCount();
	
	public Robot  findRobot(@Param("robotId")Integer robotId);
	
	public Integer saveRobot(Robot robot);
	 /**
     * 
    * @Title: deleteRobotScene 
    * @Description: TODO(每个机器人可以根据需要，在以后逻辑的基础上删除个性化场景应用) 
    * @param @param robotId
    * @param @return    设定文件 
    * @return Integer    返回类型 
    * @throws
     */
	public Integer updateRobotScene(@Param("robotId")Integer robotId,@Param("sceneId")Integer sceneId,@Param("status")Integer status);
  
	 /**
     * 
    * @Title: replaceRobotScene 
    * @Description: TODO(每个机器人可以根据需要，在以后逻辑的基础上创建个性化场景应用) 
    * @param @param robotId
    * @param @return    设定文件 
    * @return Integer    返回类型 
    * @throws
     */
	public Integer replaceRobotScene(@Param("robotId")Integer robotId,@Param("sceneId")Integer sceneId,@Param("status")Integer status);
    /**
     * 
    * @Title: saveRobotSceneForInit 
    * @Description: TODO(创建机器人的时候，初始化机器人监控器和信息介绍) 
    * @param @param robotId
    * @param @return    设定文件 
    * @return Integer    返回类型 
    * @throws
     */
	public Integer saveRobotSceneForInit(@Param("robotId")Integer robotId);
	
	public Integer updateRobot(Robot robot);
	
	public Integer deleteRobot(@Param("robotId")Integer robotId);
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
	public Integer replaceRobotApp(@Param("robotId")Integer robotId,@Param("robotSceneId")Integer robotSceneId,@Param("status")Integer status);
    /**
     * 
    * @Title: findRobotByAccount 
    * @Description: TODO(根据账号获取机器人信息) 
    * @param @param account
    * @param @return    设定文件 
    * @return Robot    返回类型 
    * @throws
     */
	public Robot  findRobotByAccount(@Param("account")String account);
}
