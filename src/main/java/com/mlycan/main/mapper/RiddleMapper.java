package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Riddle;

public interface RiddleMapper {

	public List<Riddle>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public Riddle  findRiddle(@Param("riddleId")Integer riddleId);
	
	public Integer saveRiddle(Riddle riddle);
	
	public Integer updateRiddle(Riddle riddle);
	
	public Integer deleteRiddle(@Param("riddleId")Integer riddleId);
	
}
