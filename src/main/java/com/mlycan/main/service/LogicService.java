package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Logic;

public interface LogicService {
	   
		public List<Logic>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Logic  findLogic(Integer logicId);
		
		public Integer saveLogic(String logicName,String semantic,String code,String comment);
		
		public Integer updateLogic(Integer  logicId,String logicName,String semantic,String code,String comment);
		
		public Integer deleteLogic(Integer logicId);
		
}
