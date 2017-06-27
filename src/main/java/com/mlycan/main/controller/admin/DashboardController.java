package com.mlycan.main.controller.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mlycan.main.entity.User;
import com.mlycan.main.service.ChannelService;
import com.mlycan.main.service.UserService;

@Controller
public class DashboardController {
	
	@RequestMapping(value = { "/", "/index" })
	public String index() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "admin/index";
	}
	
	@Autowired
	private UserService userService;
	@Autowired
	private ChannelService channelService;
}
