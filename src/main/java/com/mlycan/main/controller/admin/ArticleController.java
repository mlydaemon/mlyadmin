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

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Channel;
import com.mlycan.main.entity.Content;
import com.mlycan.main.service.ChannelService;
import com.mlycan.main.service.ContentService;

@Controller
@RequestMapping(value = { "article"})
public class ArticleController extends BaseController{
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		List<Content>  contents = contentService.findAll(count, curpage);
		
        model.addAttribute(Constants.BEANS, contents);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, 10);
		
		session.setAttribute(request, response, Constants.CHANNEL, "article");
		return "admin/article/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		
		List<Channel> channels = channelService.findChannels(1);
		
		model.addAttribute(Constants.CHANNELS, channels);
		
		session.setAttribute(request, response, Constants.CHANNEL, "article");
		return "admin/article/add";
	}
	@RequestMapping(value = { "/save"})
	public void save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer channelId, Integer userId,  Integer topLevel, Integer hasTitleImg,
			Integer status, Integer viewsDay, Integer commentsDay, Integer downloadsDay, Integer upsDay, String title,
			String shortTitle, String author, String origin, String originUrl, String description, Long releaseDate,
			String titleColor, String bold, String titleImg, String contentImg, String link, String txt) {
		
		contentService.saveContent(channelId, userId, topLevel, hasTitleImg, status, viewsDay,
				commentsDay, downloadsDay, upsDay, title, shortTitle, author, origin, originUrl, description,
				releaseDate, titleColor, bold, titleImg, contentImg, link, txt);
		Map<String,String> result=new HashMap<String,String>();
		result.put(Constants.RESULT, Constants.SUCCESSED);
		session.setAttribute(request, response, Constants.CHANNEL, "article");
		writeObject(response,result);
		
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer contentId) {
		Content content = contentService.findContent(contentId);
	    List<Channel> channels = channelService.findChannels(1);
	    
	    model.addAttribute(Constants.BEAN, content);
		model.addAttribute(Constants.CHANNELS, channels);
		session.setAttribute(request, response, Constants.CHANNEL, "article");
		return "admin/article/edit";
	}
	@RequestMapping(value = { "/update"})
	public void update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer contentId,Integer channelId, Integer userId, Long sortDate, Integer topLevel, Integer hasTitleImg,
			Integer status, Integer viewsDay, Integer commentsDay, Integer downloadsDay, Integer upsDay, String title,
			String shortTitle, String author, String origin, String originUrl, String description, Long releaseDate,
			String titleColor, String bold, String titleImg, String contentImg, String link, String txt) {
		
		contentService.updateContent(contentId, channelId, userId, sortDate, topLevel, hasTitleImg, status,
				viewsDay, commentsDay, downloadsDay, upsDay, title, shortTitle, author, origin, originUrl, 
				description, releaseDate, titleColor, bold, titleImg, contentImg, link, txt);
		
		Map<String,String> result=new HashMap<String,String>();
		result.put(Constants.RESULT, Constants.SUCCESSED);
		writeObject(response,result);
		session.setAttribute(request, response, Constants.CHANNEL, "article");
	}
	@Autowired
	private ContentService contentService;
	@Autowired
	private ChannelService channelService;
	@Autowired
	private SessionProvider session;
}
