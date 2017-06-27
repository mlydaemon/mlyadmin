package com.mlycan.main.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mlycan.main.entity.User;
import com.mlycan.main.service.ChannelService;
import com.mlycan.main.service.UserService;


@Controller  
public class HomeController {
	@RequestMapping(value = { "/", "/index" })
	public String index() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "index";
	}

	@RequestMapping(value = {"/contactus" })
	public String contactus() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/contactus";
	}
	@RequestMapping(value = {"/news" })
	public String news() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/news";
	}
	@RequestMapping(value = {"/inmarket" })
	public String inmarket() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/inmarket";
	}
	@RequestMapping(value = {"/analysis" })
	public String analysis() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/analysis";
	}
	@RequestMapping(value = {"/partners" })
	public String partners() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/partners";
	}
	
	@RequestMapping(value = {"/cases" })
	public String cases() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/cases";
	}
	@RequestMapping(value = {"/aboutus" })
	public String aboutus() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/aboutus";
	}
	@RequestMapping(value = {"/devprocess" })
	public String devprocess() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/devprocess";
	}
	@RequestMapping(value = {"/empenv" })
	public String empenv() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/empenv";
	}
	@RequestMapping(value = {"/joboffer" })
	public String joboffer() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/joboffer";
	}
	
	@RequestMapping(value = {"/service" })
	public String service() {
		User user = userService.adminLogin("admin","admin");
		channelService.findChannels(1);
		//System.out.println(user.getAccount());
		return "front/service";
	}
	
	@Autowired
	private UserService userService;
	@Autowired
	private ChannelService channelService;
}
