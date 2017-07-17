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
import com.mlycan.main.entity.Logic;
import com.mlycan.main.service.LogicService;

@Controller
@RequestMapping(value = { "logic"})
public class LogicController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Logic> logics = logicService.findAll(count, curpage);

		Integer  total = logicService.findAllCount();
		
		model.addAttribute(Constants.BEANS, logics);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "admin/logic/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId) {
		
		Logic logic = logicService.findLogic(logicId);

		model.addAttribute(Constants.BEAN, logic);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "admin/logic/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId,String logicName,String semantic,String code,String comment) {
		
		logicService.updateLogic(logicId,logicName,semantic,code,comment);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "redirect:/admin/logic/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		
		return "admin/logic/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String logicName,String semantic,String code,String comment) {
		
		logicService.saveLogic(logicName,semantic,code,comment);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "redirect:/admin/logic/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId) {
		
		logicService.deleteLogic(logicId);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "redirect:/admin/logic/list";
	}
	@Autowired
	private LogicService logicService;
	@Autowired
	private SessionProvider session;
}
