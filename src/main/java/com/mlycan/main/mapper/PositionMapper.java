package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Position;

public interface PositionMapper {

	public List<Position>  findAll(@Param("count")Integer count,@Param("start")Integer start,@Param("departmentId")Integer departmentId);

	public Integer findAllCount();
	
	public Position  findPosition(@Param("positionId")Integer positionId);
	
	public Integer savePosition(Position position);
	
	public Integer updatePosition(Position position);
	
	public Integer deletePosition(@Param("positionId")Integer positionId);
	
	public Integer replacePosiChannel(@Param("positionId")Integer positionId,@Param("permissions")Integer[] permissions);
	
	public Integer deletePosiChannel(@Param("positionId")Integer positionId);
	
}
