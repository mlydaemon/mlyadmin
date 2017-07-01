/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Channel;
import com.mlycan.main.entity.Menu;
import com.mlycan.main.mapper.MenuMapper;
import com.mlycan.main.service.MenuService;

/**
 * @author sean
 *
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuMapper menumapper;
	@Override
	public List<Menu> findMenus(Integer userId) {
		
		return menumapper.findForMenu(userId);
	}
	@Override
	public List<Menu> findAll(Integer count, Integer curpage,Integer parentId) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return menumapper.findAll(count, currentCount,parentId);
	}
	@Override
	public Integer findAllCount(Integer parentId){
		// TODO Auto-generated method stub
		return menumapper.findAllCount(parentId);
	}
	
	@Override
	public Menu findMenu(Integer menuId, String menuPath) {
		// TODO Auto-generated method stub
		return menumapper.findMenu(menuId, menuPath);
	}
	
}
