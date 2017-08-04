package com.mlycan.main.controller.admin;


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

@Controller
public class DashboardController {
	
	@RequestMapping(value = { "/", "/index" })
	public String index(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
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
