package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Function;

public interface FunctionService {
	    //获取菜单
		public List<Function>  findFunction(Integer userId);
		//获取菜单
		public List<Function>  findAll(Integer count,Integer curpage,Integer parentId);

		public Integer findAllCount(Integer parentId);
		
		public Function  findFunction(Integer functionId,String functionPath);
		
		
}
