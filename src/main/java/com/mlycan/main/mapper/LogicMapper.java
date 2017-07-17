package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Logic;

public interface LogicMapper {

	public List<Logic>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public Logic  findLogic(@Param("logicId")Integer logicId);
	
	public Integer saveLogic(Logic logic);
	
	public Integer updateLogic(Logic logic);
	
	public Integer deleteLogic(@Param("logicId")Integer logicId);
	
}
