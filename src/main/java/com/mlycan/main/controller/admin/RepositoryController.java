package com.mlycan.main.controller.admin;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.Logic;
import com.mlycan.main.entity.Repository;
import com.mlycan.main.entity.Scene;
import com.mlycan.main.service.LogicService;
import com.mlycan.main.service.RepositoryService;
import com.mlycan.main.service.SceneService;

@Controller
@RequestMapping(value = { "repository"})
public class RepositoryController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Repository> repositorys = repositoryService.findAll(count, curpage);

		Integer  total = repositoryService.findAllCount();
		
		model.addAttribute(Constants.BEANS, repositorys);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));
		//model.addAttribute(Constants.TALPAGE, 3);
		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		return "admin/repository/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer knowledgeId) {
		
		Repository repository = repositoryService.findRepository(knowledgeId);

		model.addAttribute(Constants.BEAN, repository);

		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		return "admin/repository/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer knowledgeId,String  account,String  application,String  semantic,String  command,String  content,Integer  masterId,String  createTime) {
		
		repositoryService.updateRepository(knowledgeId,account,application,semantic,command,content,masterId,createTime);

		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		return "redirect:/admin/repository/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model ,Integer sceneId) {

		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		Scene scene =sceneService.findScene(sceneId);
		
		 List<Logic> logics = logicService.findList(scene.getSceneId());
         scene.setLogics(logics);
         
         model.addAttribute(Constants.BEAN, scene);
         
		return "admin/repository/add";
	}
	@RequestMapping(value = { "/addRe"})
	public String addRe(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		
		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		
		return "admin/repository/addRe";
	}
	@RequestMapping(value = { "/addRiddle"})
	public String addRiddle(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		
		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		
		return "admin/repository/addRiddle";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String  account,String  application,String  semantic,String  command,String  content,Integer  masterId,String  createTime) {
		
		repositoryService.saveRepository(account,application,semantic,command,content,masterId,createTime);

		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		return "redirect:/admin/repository/list";
	}
          /*	ajax的方式添加数据        */
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = { "/saveRepository"},method = RequestMethod.POST)
	@ResponseBody
	public String saveRepository(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			@RequestBody String conditions) {
		ObjectMapper objectMapper =new ObjectMapper();
		JavaType javaType= objectMapper.getTypeFactory().constructParametricType(List.class,Repository.class);
		try {
			List<Repository> list= objectMapper.readValue(conditions, javaType);
			System.out.println(list);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*ObjectMapper objectMapper = new ObjectMapper();  
		        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, MyDomain.class);  
		        List<MyDomain> list = objectMapper.readValue(myDomain, javaType); */
		
		System.out.println("ssssssssss");
		//repositoryService.saveRepository();
		
		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		return "redirect:/admin/repository/list";
	}
	
	/*  一条谜语拆分为五条数据插入knowledge表中      */
	@RequestMapping(value = { "/saveRiddle"},method = RequestMethod.POST)
	public String saveRiddle(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String  account,String  conundrum,String  mystery,String  reminder,String  answer,String  explains) {
		
		repositoryService.saveRiddleToKnowledge(account, conundrum, mystery, reminder, answer, explains);
		
		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		return "redirect:/admin/repository/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer knowledgeId) {
		
		repositoryService.deleteRepository(knowledgeId);

		session.setAttribute(request, response, Constants.CHANNEL, "repository");
		
		return "redirect:/admin/repository/list";
	}
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private SessionProvider session;
	@Autowired
	private SceneService sceneService;
	@Autowired
	private LogicService logicService;
}
