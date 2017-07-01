package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Menu;

public interface MenuService {
	    //获取菜单
		public List<Menu>  findMenus(Integer userId);
		//获取菜单
		public List<Menu>  findAll(Integer count,Integer curpage,Integer parentId);

		public Integer findAllCount(Integer parentId);
		
		public Menu  findMenu(Integer menuId,String menuPath);
		
		
}
