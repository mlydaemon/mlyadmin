package com.mlycan.main.controller.admin;


import java.util.ArrayList;
import java.util.Iterator;
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
import com.mlycan.main.entity.Question;
import com.mlycan.main.entity.Robot;
import com.mlycan.main.entity.Scene;
import com.mlycan.main.entity.Species;
import com.mlycan.main.service.LogicService;
import com.mlycan.main.service.QuestionService;
import com.mlycan.main.service.RobotService;
import com.mlycan.main.service.SceneService;
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
		List<Robot> robotlist = new ArrayList<Robot>();
		for(Iterator it2 = robots.iterator();it2.hasNext();){
			Robot robot = (Robot) it2.next();
			List<Scene> sceness = new ArrayList<Scene>();
			List<Scene> scenes = sceneService.findByRobotAccount(robot.getAccount());
			for(Iterator it3 = scenes.iterator();it3.hasNext();){
				 Scene scene = (com.mlycan.main.entity.Scene) it3.next();
	             List<Logic> logics = logicService.findList(scene.getSceneId());
	             scene.setLogics(logics);
	             sceness.add(scene);
			 }
			robot.setScenes(sceness);
			robotlist.add(robot);
		}
		Integer  total = robotService.findAllCount();
		
		model.addAttribute(Constants.BEANS, robotlist);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "robot");
		
		return "admin/robot/list";
	}
	@RequestMapping(value = { "/trainLogicCore"})
	public String trainLogicCore(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String robotAccount,String application,String semantic) {
		Logic Logic = logicService.findLogicForTrain(robotAccount, application, semantic);
		//List<Question> questions = questionService.findQuestionForTrain(robotAccount,application ,semantic);
		model.addAttribute(Constants.BEAN, Logic);
		//model.addAttribute(Constants.BEANS, questions);
		session.setAttribute(request, response, Constants.CHANNEL, "robot");
		return "admin/robot/trainLogicCore";
	}
	@RequestMapping(value = { "/trainSceneCore"})
	public String trainSceneCore(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String robotAccount,String application,String semantic) {
		Scene scene = sceneService.findSceneForTrain(application,robotAccount);
		 List<Logic> logics = logicService.findList(scene.getSceneId());
		 model.addAttribute(Constants.BEAN, scene);
		 model.addAttribute(Constants.BEANS, logics);
		 session.setAttribute(request, response, Constants.CHANNEL, "robot");
		return "admin/robot/trainSceneCore";
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
			Integer robotId,String account,String nickname,Integer speciesId,Long birthday,Integer gender,String comefrom,String hobby,String comment) {
		robotService.updateRobot(robotId,account,nickname,speciesId,birthday,gender,comefrom,hobby,comment);

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
			String account,String nickname,Integer speciesId,Long birthday,Integer gender,String comefrom,String hobby,String comment) {
		
		robotService.saveRobot(account,nickname,speciesId,birthday,gender,comefrom,hobby,comment);

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
	private QuestionService questionService;
	@Autowired
	private LogicService logicService;
	@Autowired
	private SceneService sceneService;
	@Autowired
	private SpeciesService speciesService;
	@Autowired
	private RobotService robotService;
	@Autowired
	private SessionProvider session;
}
