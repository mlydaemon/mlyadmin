package com.mlycan.main.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Knowledge;
import com.mlycan.main.service.AnswerService;
import com.mlycan.main.service.KnowledgeService;
import com.mlycan.main.service.QuestionService;
import com.mlycan.main.service.RobotService;

@Controller
@RequestMapping(value = { "knowledge"})
public class QATrainController extends BaseController {
	@RequestMapping(value = { "/achieve" },method = RequestMethod.POST)
	public void achieve(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			 String robotAccount, String application, String semantic, String questionCommand) {
		Map<String,Object> remap = new HashMap<String,Object>();
		if(StringUtils.isBlank(robotAccount)||StringUtils.isBlank(application)||StringUtils.isBlank(semantic)){
			remap.put("success", 0);
		}
		if(StringUtils.isBlank(questionCommand)){
			questionCommand = null;
		}
		remap.put("success", 1);
		List<Knowledge>  knowledges = knowledgeService.findKnowledges(robotAccount, application, semantic,questionCommand);
		remap.put("knowledges", knowledges);
		writeObject(response,remap);
	}
	/**
	 * 
	* @Title: receive 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param request
	* @param @param response
	* @param @param model
	* @param @param robotAccount//机器人账号
	* @param @param application//机器人名称
	* @param @param semantic//当前语义库
	* @param @param questionCommand//语义
	* @param @param questionContent//内容
	* @param @param answerContent//内容
	* @param @param answerCommand//语义
	* @return void    返回类型 
	* @throws
	 */
	@RequestMapping(value = { "/recquestion" },method = RequestMethod.POST)
	public void recquestion(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String robotAccount,String application,String semantic,
			String  questionCommand,String  questionContent) {

		questionService.saveQuestion(robotAccount,application,questionContent,questionCommand,semantic,semantic, 0);
		Map<String,Object> remap = new HashMap<String,Object>();
		remap.put("success", 1);
	    writeObject(response,remap);
	}
	@RequestMapping(value = { "/recanswer" },method = RequestMethod.POST)
	public void recanswer(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String robotAccount,String application,String semantic,String  questionContent,
			String  answerContent,String  answerCommand) {

		answerService.saveAnswer(robotAccount,application,questionContent,answerContent,answerCommand,0);
		Map<String,Object> remap = new HashMap<String,Object>();
		remap.put("success", 1);
	    writeObject(response,remap);
	}
	@RequestMapping(value = { "/delete" },method = RequestMethod.POST)
	public void delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer questionId,Integer answerId) {
		//questionService.saveQuestion(robotAccount,application,questionContent,questionCommand,semantic,semantic, 0);
		knowledgeService.deleteKnowledges(questionId,answerId);
		Map<String,Object> remap = new HashMap<String,Object>();
		remap.put("success", 1);
	    writeObject(response,remap);
	}
	@Autowired
	private AnswerService answerService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private KnowledgeService knowledgeService;
	@Autowired
	private SessionProvider session;
}
