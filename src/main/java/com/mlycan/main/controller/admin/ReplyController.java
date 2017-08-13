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
import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Reply;
import com.mlycan.main.service.ReplyService;
@Controller
@RequestMapping(value = { "reply"})
public class ReplyController   extends BaseController {
	
	@RequestMapping(value = { "/achieve" },method = RequestMethod.POST)
	public void achieveReplys(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String application, String semantic) {
		    List<Reply> replys =  replyService.findList(null, application, semantic);
		    Map<String,Object> remap = new HashMap<String,Object>();
		    remap.put("success", 1);
		    remap.put(Constants.BEANS, replys);
		    writeObject(response,remap);
	}
	@RequestMapping(value = { "/update" },method = RequestMethod.POST)
	public void updateReplys(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String application, String semantic, String keyword,String content, Integer precision, String remark) {
		    Integer count =  replyService.replaceReply(application, semantic, keyword,content, precision, remark);
		    		
		    Map<String,Object> remap = new HashMap<String,Object>();
		    remap.put("success", count);
		    writeObject(response,remap);
	}
	@RequestMapping(value = { "/delete" },method = RequestMethod.POST)
	public void deleteReplys(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer replyId) {
		
		    Integer count =  replyService.deleteReply(replyId);
		    
		    Map<String,Object> remap = new HashMap<String,Object>();
		    remap.put("success", count);
		    writeObject(response,remap);
	}
	
	@Autowired
	private ReplyService replyService;
}
