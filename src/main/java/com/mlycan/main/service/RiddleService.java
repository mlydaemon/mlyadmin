package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.Riddle;

public interface RiddleService {
	   
		public List<Riddle>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Riddle  findRiddle(Integer riddleId);
		
		public Integer saveRiddle(String  account,String  conundrum,String  mystery,String  reminder,String  answer,String  explains,String  classify,String  createdTime,String  updateTime);
		
		public Integer updateRiddle(Integer  riddleId,String  account,String  conundrum,String  mystery,String  reminder,String  answer,String  explains,String  classify,String  createdTime,String  updateTime);
		
		public Integer deleteRiddle(Integer riddleId);
		
}
