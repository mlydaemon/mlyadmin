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
import com.mlycan.main.entity.Answer;
import com.mlycan.main.service.AnswerService;

@Controller
@RequestMapping(value = { "answer"})
public class AnswerController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Answer> answers = answerService.findAll(count, curpage);

		Integer  total = answerService.findAllCount();
		
		model.addAttribute(Constants.BEANS, answers);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "answer");
		
		return "admin/answer/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer answerId) {
		
		Answer answer = answerService.findAnswer(answerId);

		model.addAttribute(Constants.BEAN, answer);

		session.setAttribute(request, response, Constants.CHANNEL, "answer");
		
		return "admin/answer/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer answerId,String account,String application,String question,String content,String command,Integer pattern) {
		
		answerService.updateAnswer(answerId,account,application,question,content,command,pattern);

		session.setAttribute(request, response, Constants.CHANNEL, "answer");
		
		return "redirect:/admin/answer/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "answer");
		
		
		return "admin/answer/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String account,String application,String content,String command,String classify,String nextclassify,Integer pattern) {
		
		answerService.saveAnswer(account,application,content,content,command,pattern);

		session.setAttribute(request, response, Constants.CHANNEL, "answer");
		
		return "redirect:/admin/answer/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer answerId) {
		
		answerService.deleteAnswer(answerId);

		session.setAttribute(request, response, Constants.CHANNEL, "answer");
		
		return "redirect:/admin/answer/list";
	}
	@Autowired
	private AnswerService answerService;
	@Autowired
	private SessionProvider session;
}
