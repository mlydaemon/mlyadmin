package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Position;

public interface PositionService {
	   
		//获取菜单
		public List<Position>  findAll(Integer count,Integer curpage,Integer departmentId);

		public Integer findAllCount();
		
		public Position  findPosition(Integer PositionId);
		
		public Integer savePosition(String  positionIdName,Integer  departmentId,String  link,Integer  priority,Integer[] permissions);
		
		public Integer updatePosition(Integer  positionId,String  positionIdName,Integer  departmentId,String  link,Integer  priority,Integer[] permissions);
		
		public Integer deletePosition(Integer positionId);
		
}
