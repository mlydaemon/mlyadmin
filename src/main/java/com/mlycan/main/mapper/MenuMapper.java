package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Menu;

public interface MenuMapper {
	
	//获取菜单
	public List<Menu>  findForMenu(Integer userId);
	
	//获取菜单
	public List<Menu>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage,@Param("parentId")Integer parentId);
	
	public Integer findAllCount(@Param("parentId")Integer parentId);
	
	public Menu  findMenu(@Param("menuId")Integer menuId,@Param("menuPath")String menuPath);
	
}
