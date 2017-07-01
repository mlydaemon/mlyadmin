package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Function;

public interface FunctionMapper {
	
	//获取菜单
	public List<Function>  findForMenu(Integer userId);
	
	//获取菜单
	public List<Function>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage,@Param("parentId")Integer parentId);
	
	public Integer findAllCount(@Param("parentId")Integer parentId);
	
	public Function  findFunction(@Param("functionId")Integer functionId,@Param("functionPath")String functionPath);
}
