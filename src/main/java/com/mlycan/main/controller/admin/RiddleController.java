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
import com.mlycan.main.entity.Riddle;
import com.mlycan.main.service.RiddleService;

@Controller
@RequestMapping(value = { "riddle"})
public class RiddleController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Riddle> riddles = riddleService.findAll(count, curpage);

		Integer  total = riddleService.findAllCount();
		
		model.addAttribute(Constants.BEANS, riddles);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));
		//model.addAttribute(Constants.TALPAGE, 3);
		session.setAttribute(request, response, Constants.CHANNEL, "riddle");
		
		return "admin/riddle/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer riddleId) {
		
		Riddle riddle = riddleService.findRiddle(riddleId);

		model.addAttribute(Constants.BEAN, riddle);

		session.setAttribute(request, response, Constants.CHANNEL, "riddle");
		
		return "admin/riddle/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer riddleId,String  account,String  conundrum,String  mystery,String  reminder,String  answer,String  explains,String  classify,String  createdTime,String  updateTime) {
		
		riddleService.updateRiddle(riddleId,account,conundrum,mystery,reminder,answer,explains,classify,createdTime,updateTime);

		session.setAttribute(request, response, Constants.CHANNEL, "riddle");
		
		return "redirect:/admin/riddle/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "riddle");
		
		
		return "admin/riddle/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String  account,String  conundrum,String  mystery,String  reminder,String  answer,String  explains,String  classify,String  createdTime,String  updateTime) {
		
		riddleService.saveRiddle(account,conundrum,mystery,reminder,answer,explains,classify,createdTime,updateTime);

		session.setAttribute(request, response, Constants.CHANNEL, "riddle");
		
		return "redirect:/admin/riddle/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer riddleId) {
		
		riddleService.deleteRiddle(riddleId);

		session.setAttribute(request, response, Constants.CHANNEL, "riddle");
		
		return "redirect:/admin/riddle/list";
	}
	@Autowired
	private RiddleService riddleService;
	@Autowired
	private SessionProvider session;
}
