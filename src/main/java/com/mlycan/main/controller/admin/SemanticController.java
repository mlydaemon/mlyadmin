package com.mlycan.main.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.mlycan.main.entity.Semantic;
import com.mlycan.main.service.LogicService;
import com.mlycan.main.service.SceneService;
import com.mlycan.main.service.SemanticService;
@Controller
@RequestMapping(value = { "semantic"})
public class SemanticController  extends BaseController {
	@RequestMapping(value = { "/achieve" },method = RequestMethod.POST)
	public void achieveKeywords(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String application, String semantic) {
		    List<Semantic> semantics =  semanticService.findList(null, application, semantic);
		    Map<String,Object> remap = new HashMap<String,Object>();
		    remap.put("success", 1);
		    remap.put(Constants.BEANS, semantics);
		    writeObject(response,remap);
	}
	@RequestMapping(value = { "/update" },method = RequestMethod.POST)
	public void updateKeywords(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String application, String semantic, String keyword, Integer precision, String remark) {
		    Integer count =  semanticService.replaceSemantic(application, semantic, keyword, precision, remark);
		    		
		    Map<String,Object> remap = new HashMap<String,Object>();
		    remap.put("success", count);
		    writeObject(response,remap);
	}
	@RequestMapping(value = { "/delete" },method = RequestMethod.POST)
	public void deleteKeywords(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer semanticId) {
		
		    Integer count =  semanticService.deleteSemantic(semanticId);
		    
		    Map<String,Object> remap = new HashMap<String,Object>();
		    remap.put("success", count);
		    writeObject(response,remap);
	}
	@Autowired
	private SemanticService semanticService;
	@Autowired
	private SessionProvider session;
}
