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
	
	public Integer updateRobot(Robot robot);
	
	public Integer deleteRobot(@Param("robotId")Integer robotId);
	
}
