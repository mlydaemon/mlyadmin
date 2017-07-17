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
import com.mlycan.main.entity.SceneLogic;
import com.mlycan.main.service.SceneLogicService;

@Controller
@RequestMapping(value = { "sceneLogic"})
public class SceneLogicController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<SceneLogic> sceneLogics = sceneLogicService.findAll(count, curpage);

		Integer  total = sceneLogicService.findAllCount();
		
		model.addAttribute(Constants.BEANS, sceneLogics);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "sceneLogic");
		
		return "admin/sceneLogic/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer slogicId) {
		
		SceneLogic sceneLogic = sceneLogicService.findSceneLogic(slogicId);

		model.addAttribute(Constants.BEAN, sceneLogic);

		session.setAttribute(request, response, Constants.CHANNEL, "sceneLogic");
		
		return "admin/sceneLogic/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer slogicId,String logicName,String comment) {
		
		sceneLogicService.updateSceneLogic(slogicId,logicName,comment);

		session.setAttribute(request, response, Constants.CHANNEL, "sceneLogic");
		
		return "redirect:/admin/sceneLogic/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "sceneLogic");
		
		
		return "admin/sceneLogic/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String logicName,String comment) {
		
		sceneLogicService.saveSceneLogic(logicName,comment);

		session.setAttribute(request, response, Constants.CHANNEL, "sceneLogic");
		
		return "redirect:/admin/sceneLogic/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer slogicId) {
		
		sceneLogicService.deleteSceneLogic(slogicId);

		session.setAttribute(request, response, Constants.CHANNEL, "sceneLogic");
		
		return "redirect:/admin/sceneLogic/list";
	}
	@Autowired
	private SceneLogicService sceneLogicService;
	@Autowired
	private SessionProvider session;
}
