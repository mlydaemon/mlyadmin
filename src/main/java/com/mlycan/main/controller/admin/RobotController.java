package com.mlycan.main.controller.admin;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.Robot;
import com.mlycan.main.entity.Species;
import com.mlycan.main.service.RobotService;
import com.mlycan.main.service.SpeciesService;

@Controller
@RequestMapping(value = { "robot"})
public class RobotController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Robot> robots = robotService.findAll(count, curpage,null);

		Integer  total = robotService.findAllCount();
		
		model.addAttribute(Constants.BEANS, robots);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "robot");
		
		return "admin/robot/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer robotId) {
		
		Robot robot = robotService.findRobot(robotId);

		model.addAttribute(Constants.BEAN, robot);

		session.setAttribute(request, response, Constants.CHANNEL, "robot");
		
		return "admin/robot/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer robotId,String account,String nickname,Integer speciesId,Long birthday,Integer gender,String comefrom,String intro,String comment) {
		robotService.updateRobot(robotId,account,nickname,speciesId,birthday,gender,comefrom,intro,comment);

		session.setAttribute(request, response, Constants.CHANNEL, "robot");
		return "redirect:/admin/robot/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		
		List<Species> species= speciesService.findSpeciesByPid(null);
		
		model.addAttribute(Constants.BEANS, species);
		
		session.setAttribute(request, response, Constants.CHANNEL, "species");
		session.setAttribute(request, response, Constants.CHANNEL, "robot");
		
		
		return "admin/robot/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String account,String nickname,Integer speciesId,Long birthday,Integer gender,String comefrom,String intro,String comment) {
		
		robotService.saveRobot(account,nickname,speciesId,birthday,gender,comefrom,intro,comment);

		session.setAttribute(request, response, Constants.CHANNEL, "robot");
		
		return "redirect:/admin/robot/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer robotId) {
		
		robotService.deleteRobot(robotId);

		session.setAttribute(request, response, Constants.CHANNEL, "robot");
		
		return "redirect:/admin/robot/list";
	}
	@Autowired
	private SpeciesService speciesService;
	@Autowired
	private RobotService robotService;
	@Autowired
	private SessionProvider session;
}
