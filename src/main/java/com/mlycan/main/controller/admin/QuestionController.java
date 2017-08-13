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
import com.mlycan.main.entity.Question;
import com.mlycan.main.service.QuestionService;

@Controller
@RequestMapping(value = { "question"})
public class QuestionController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage,String startTime,String endTime,String keywords,String command,String semantic) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Question> questions = questionService.findAll(keywords,command,semantic,startTime,endTime,count, curpage);

		Integer  total = questionService.findAllCount(keywords,command,semantic,startTime,endTime);
		
		model.addAttribute(Constants.BEANS, questions);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		model.addAttribute("keywords", keywords!=null?keywords:"");
		model.addAttribute("command", command!=null?command:"");
		model.addAttribute("semantic", semantic!=null?semantic:"");
		model.addAttribute("startTime", startTime!=null?startTime:"");
		model.addAttribute("endTime", endTime!=null?endTime:"");
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "question");
		
		return "admin/question/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer questionId) {
		
		Question question = questionService.findQuestion(questionId);

		model.addAttribute(Constants.BEAN, question);

		session.setAttribute(request, response, Constants.CHANNEL, "question");
		
		return "admin/question/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer questionId,String account,String application,String content,String command,String classify,String nextclassify,Integer pattern) {
		
		questionService.updateQuestion(questionId,account,application,content,command,classify,nextclassify, pattern);

		session.setAttribute(request, response, Constants.CHANNEL, "question");
		
		return "redirect:/admin/question/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "question");
		
		
		return "admin/question/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String account,String application,String content,String command,String classify,String nextclassify,Integer pattern) {
		
		questionService.saveQuestion(account,application,content,command,classify,nextclassify, pattern);

		session.setAttribute(request, response, Constants.CHANNEL, "question");
		
		return "redirect:/admin/question/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer questionId) {
		
		questionService.deleteQuestion(questionId);

		session.setAttribute(request, response, Constants.CHANNEL, "question");
		
		return "redirect:/admin/question/list";
	}
	@Autowired
	private QuestionService questionService;
	@Autowired
	private SessionProvider session;
}
