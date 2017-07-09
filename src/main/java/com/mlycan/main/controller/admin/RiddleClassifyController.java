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
import com.mlycan.main.entity.RiddleClassify;
import com.mlycan.main.service.RiddleClassifyService;

@Controller
@RequestMapping(value = { "riddleClassify"})
public class RiddleClassifyController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<RiddleClassify> riddleClassifys = riddleClassifyService.findAll(count, curpage);

		Integer  total = riddleClassifyService.findAllCount();
		
		model.addAttribute(Constants.BEANS, riddleClassifys);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "riddleClassify");
		
		return "admin/riddleClassify/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer riddleClassifyId) {
		
		RiddleClassify riddleClassify = riddleClassifyService.findRiddleClassify(riddleClassifyId);

		model.addAttribute(Constants.BEAN, riddleClassify);

		session.setAttribute(request, response, Constants.CHANNEL, "riddleClassify");
		
		return "admin/riddleClassify/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer  riddleClassifyId,Integer parentId,String classify,Integer  priority,Integer content,Integer  display) {
		
		riddleClassifyService.updateRiddleClassify(riddleClassifyId,0,classify,priority,content,display);

		session.setAttribute(request, response, Constants.CHANNEL, "riddleClassify");
		
		return "redirect:/admin/riddleClassify/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "riddleClassify");
		
		
		return "admin/riddleClassify/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
		 Integer  parentId,String classify,Integer  priority,Integer hascontent,Integer  display) {
		
		riddleClassifyService.saveRiddleClassify(0,classify,  priority,hascontent,display);

		session.setAttribute(request, response, Constants.CHANNEL, "riddleClassify");
		
		return "redirect:/admin/riddleClassify/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer riddleClassifyId) {
		
		riddleClassifyService.deleteRiddleClassify(riddleClassifyId);

		session.setAttribute(request, response, Constants.CHANNEL, "riddleClassify");
		
		return "redirect:/admin/riddleClassify/list";
	}
	@Autowired
	private RiddleClassifyService riddleClassifyService;
	@Autowired
	private SessionProvider session;
}
