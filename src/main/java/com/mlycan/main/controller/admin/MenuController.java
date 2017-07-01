package com.mlycan.main.controller.admin;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.Menu;
import com.mlycan.main.service.MenuService;

@Controller
@RequestMapping(value = { "menu"})
public class MenuController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Menu> menuList = new ArrayList<Menu>();
		List<Menu> menus = menuService.findAll(count, curpage, null);
		 for(Iterator it2 = menus.iterator();it2.hasNext();){
			 Menu menu = (com.mlycan.main.entity.Menu) it2.next();
             List<Menu> childMenus = menuService.findAll(null, null, menu.getMenuId());
             menu.setChildren(childMenus);
             menuList.add(menu);
        }
		Integer  total = menuService.findAllCount(null);
		
		model.addAttribute(Constants.BEANS, menuList);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));
		
		session.setAttribute(request, response, Constants.CHANNEL, "menu");
		
		return "admin/menu/list";
	}
	
	@Autowired
	private MenuService menuService;
	@Autowired
	private SessionProvider session;
}
