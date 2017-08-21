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
import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Logic;
import com.mlycan.main.entity.Scene;
import com.mlycan.main.service.LogicService;
import com.mlycan.main.service.SceneService;

@Controller
@RequestMapping(value = { "logic"})
public class LogicController extends BaseController{
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String sceneName,Integer count,Integer curpage) {
		logger.debug("Enter LogicController:list;parameter:sceneName="+sceneName+",count="+count+",curpage="+curpage);
		if(count ==null){
			count = 50;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Logic> logics = logicService.findAll(sceneName,count, curpage);

		Integer  total = logicService.findAllCount(sceneName);
		
		model.addAttribute(Constants.BEANS, logics);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		logger.debug("Exit LogicController:list");
		return "admin/logic/list";
	}
	@RequestMapping(value = { "/preview"})
	public String preview(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId) {
		
		Logic logic = logicService.findLogicForConfig(logicId);

		model.addAttribute(Constants.BEAN, logic);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "admin/logic/preview";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId) {
		
		Logic logic = logicService.findLogic(logicId);
		
		List<Scene> scene= sceneService.findAll(null, null);

		model.addAttribute(Constants.BEAN, logic);

		model.addAttribute(Constants.BEANS, scene);
		
		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		logger.debug("Exit LogicController:edit");
		return "admin/logic/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId,Integer sceneId,String logicName,String command,String semantic,String code,String comment,String keywords) {
	
		logicService.updateLogic(logicId,sceneId,logicName,command,semantic,code,comment,keywords);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		logger.debug("Exit LogicController:update");
		return "redirect:/admin/logic/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		List<Scene> scene= sceneService.findAll(null, null);
		
		model.addAttribute(Constants.BEANS, scene);
		
		logger.debug("Exit LogicController:add");
		return "admin/logic/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId,String logicName,String command,String semantic,String code,String comment,String keywords) {

		logicService.saveLogic(sceneId,logicName,command,semantic,code,comment,keywords);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "redirect:/admin/logic/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId) {
		
		logicService.deleteLogic(logicId);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		logger.debug("Exit LogicController:delete");
		return "redirect:/admin/logic/list";
	}
	@RequestMapping(value = { "/config/keywords"})
	public String configKeywords(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId) {
		
		Logic logic = logicService.findLogicForConfig(logicId);

		model.addAttribute(Constants.BEAN, logic);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "admin/logic/config/keywords";
	}
	@RequestMapping(value = { "/config/replys"})
	public String configReply(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer logicId) {
		
		Logic logic = logicService.findLogicForConfig(logicId);

		model.addAttribute(Constants.BEAN, logic);

		session.setAttribute(request, response, Constants.CHANNEL, "logic");
		
		return "admin/logic/config/reply";
	}
	@Autowired
	private LogicService logicService;
	@Autowired
	private SessionProvider session;
	@Autowired
	private SceneService sceneService;
}
