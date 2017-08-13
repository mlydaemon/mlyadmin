package com.mlycan.main.controller.admin;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.User;
import com.mlycan.main.service.ChannelService;
import com.mlycan.main.service.UserService;
import com.mlycan.main.util.ExcelUtil;
import com.mlycan.main.util.Item;

@Controller
public class DashboardController {
	
	@RequestMapping(value = { "/", "/index" })
	public String index(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Item> members =new  ArrayList<Item>();
		/*InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("riddles.xls");
		ExcelUtil eu = new ExcelUtil();
        List<Object> ls =  eu.importDataFromExcel(new Item(), in, "riddles.xls");
           for(Object item : ls){
        	   Item i = (Item) item;
        	   System.out.println(i.getAnswer()+"##"+i.getConundrum());
        	   members.add(i);
           }*/
        model.addAttribute(Constants.BEANS, members);
        
        model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)1000/count));
		session.setAttribute(request, response, Constants.CHANNEL, "dashboard");
		return "admin/index";
	}
	
	@Autowired
	private UserService userService;
	@Autowired
	private ChannelService channelService;
	@Autowired
	private SessionProvider session;
}
