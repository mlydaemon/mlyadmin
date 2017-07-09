package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.RiddleClassify;

public interface RiddleClassifyMapper {
	
	public List<RiddleClassify>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public RiddleClassify  findRiddleClassify(@Param("riddleClassifyId")Integer riddleClassifyId);
	
	public Integer saveRiddleClassify(RiddleClassify riddleClassify);
	
	public Integer updateRiddleClassify(RiddleClassify riddleClassify);
	
	public Integer deleteRiddleClassify(@Param("riddleClassifyId")Integer riddleClassifyId);
}
