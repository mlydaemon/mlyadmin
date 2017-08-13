package com.mlycan.main.controller.admin;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Channel;
import com.mlycan.main.entity.Logic;
import com.mlycan.main.entity.Reply;
import com.mlycan.main.entity.Scene;
import com.mlycan.main.entity.Semantic;
import com.mlycan.main.service.LogicService;
import com.mlycan.main.service.ReplyService;
import com.mlycan.main.service.SceneService;
import com.mlycan.main.service.SemanticService;

@Controller
@RequestMapping(value = { "scene"})
public class SceneController   extends BaseController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Scene> sceness = new ArrayList<Scene>();
		List<Scene> scenes = sceneService.findAll(count, curpage);
		 for(Iterator it2 = scenes.iterator();it2.hasNext();){
			 Scene scene = (com.mlycan.main.entity.Scene) it2.next();
             List<Logic> logics = logicService.findList(scene.getSceneId());
             scene.setLogics(logics);
             sceness.add(scene);
		 }
		Integer  total = sceneService.findAllCount();
		
		model.addAttribute(Constants.BEANS, scenes);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "admin/scene/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId) {
		
		Scene scene = sceneService.findScene(sceneId);

		model.addAttribute(Constants.BEAN, scene);

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "admin/scene/edit";
	}
	@RequestMapping(value = { "/preview"})
	public String preview(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId) {
		
		Scene scene = sceneService.findScene(sceneId);

		model.addAttribute(Constants.BEAN, scene);

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "admin/scene/preview";
	}
	
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId,String sceneName,String application,String semantic,Integer active,String comment,String level,String performer,String processor,String keywords) {
		
		sceneService.updateScene(sceneId,sceneName,application,semantic,active,comment,level,performer,processor,keywords);

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "redirect:/admin/scene/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		
		return "admin/scene/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String sceneName,String application,String semantic,Integer active,String comment,String level,String perfomer,String processor,String keywords) {
		
		sceneService.saveScene(sceneName,application,semantic,active,comment,level,perfomer,processor,keywords);

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "redirect:/admin/scene/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId) {
		
		sceneService.deleteScene(sceneId);

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "redirect:/admin/scene/list";
	}
	@RequestMapping(value = { "/config/keywords"})
	public String configKeywords(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId) {
		
		Scene scene = sceneService.findScene(sceneId);

		model.addAttribute(Constants.BEAN, scene);

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "admin/scene/config/keywords";
	}
	@RequestMapping(value = { "/config/replys"})
	public String configReply(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId) {
		
		Scene scene = sceneService.findScene(sceneId);

		model.addAttribute(Constants.BEAN, scene);

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "admin/scene/config/reply";
	}
	@RequestMapping(value = { "/config/major"})
	public String configMajor(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId) {
		
		Scene scene = sceneService.findScene(sceneId);
		
		List<Logic> logics = logicService.findList(scene.getSceneId());
        
		scene.setLogics(logics);
        
		model.addAttribute(Constants.BEAN, scene);

		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "admin/scene/config/major";
	}
	@RequestMapping(value = { "/upmajor"})
	public String updateMajor(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer sceneId,String logicode) {
		
		sceneService.updateSceneMajor(sceneId, logicode);
		session.setAttribute(request, response, Constants.CHANNEL, "scene");
		
		return "redirect:/admin/scene/list";
	}
	@Autowired
	private LogicService logicService;
	@Autowired
	private SceneService sceneService;
	@Autowired
	private SessionProvider session;
}
