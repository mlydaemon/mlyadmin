package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Content;
import com.mlycan.main.mapper.ChannelMapper;
import com.mlycan.main.mapper.ContentMapper;
import com.mlycan.main.service.ContentService;
@Service
public class ContentServiceImpl implements ContentService{

	
   @Autowired
   private ContentMapper contentMapper;
	 
	@Override
	public List<Content> findAll(Integer count, Integer curpage) {
		// TODO Auto-generated method stub
		return contentMapper.findAll(count, curpage);
	}

	@Override
	public Content findContent(Integer contentId) {
		if(contentId == null){
			return null;
		}
		return contentMapper.findContent(contentId);
	}

	@Override
	public Integer saveContent(Integer channelId, Integer userId, Integer topLevel, Integer hasTitleImg,
			Integer status, Integer viewsDay, Integer commentsDay, Integer downloadsDay, Integer upsDay, String title,
			String shortTitle, String author, String origin, String originUrl, String description, Long releaseDate,
			String titleColor, String bold, String titleImg, String contentImg, String link, String txt) {
		    Content content = new Content();
		    if(channelId == null){
		    	content.setChannelId(0);
		    }else{
		    	content.setChannelId(channelId);	
		    }
           if(userId == null){
        	   content.setUserId(0);
		    }else{
		    	content.setUserId(userId);
		    }
		    content.setSortDate(System.currentTimeMillis());
		    content.setTopLevel(topLevel==null?0:topLevel);
		    content.setHasTitleImg(hasTitleImg==null?0:hasTitleImg);
		    content.setStatus(status==null?0:status);
		    content.setViewsDay(viewsDay==null?0:viewsDay);
		    content.setCommentsDay(commentsDay==null?0:commentsDay);
		    content.setDownloadsDay(downloadsDay==null?0:downloadsDay);
		    content.setUpsDay(upsDay==null?0:upsDay);
		    content.setTitle(title);
		    content.setShortTitle(shortTitle);
		    content.setAuthor(author);
		    content.setOrigin(origin);
		    content.setOriginUrl(originUrl);
		    content.setDescription(description);
		    content.setReleaseDate(releaseDate);
		    content.setTitleColor(titleColor);
		    content.setBold(bold);
		    content.setContentImg(contentImg);
		    content.setTitleImg(titleImg);
		    content.setLink(link);
		    content.setTxt(txt);
		    Integer cid = contentMapper.saveContent(content);
		    if(cid !=null && cid>0){
		    	contentMapper.saveContentExt(content);
		    }
		    if(cid !=null && cid>0){
		    	contentMapper.saveContentTxt(content);
		    }
		    return cid;
	}

	@Override
	public Integer updateContent(Integer contentId, Integer channelId, Integer userId, Long sortDate, Integer topLevel,
			Integer hasTitleImg, Integer status, Integer viewsDay, Integer commentsDay, Integer downloadsDay,
			Integer upsDay, String title, String shortTitle, String author, String origin, String originUrl,
			String description, Long releaseDate, String titleColor, String bold, String titleImg, String contentImg,
			String link, String txt) {
		Content content = contentMapper.findContent(contentId);
		if(content == null ){
			return null;
		}
		if(channelId != null && channelId>0){
			content.setChannelId(channelId);
		}
		if(userId != null && userId>0){
			content.setUserId(userId);		
		}
		if(sortDate != null && sortDate>0){
			content.setSortDate(sortDate);
		}
		if(topLevel != null && topLevel>0){
			content.setTopLevel(topLevel);
		}
		if(hasTitleImg != null && hasTitleImg>0){
			content.setHasTitleImg(hasTitleImg);
		}
		if(status != null && status>0){
			content.setStatus(status);		
		}
		if(viewsDay != null && viewsDay>0){
			content.setViewsDay(viewsDay);	
		}
		if(commentsDay != null && commentsDay>0){
			content.setCommentsDay(commentsDay);
		}
		if(downloadsDay != null && downloadsDay>0){
			content.setDownloadsDay(downloadsDay);
		}
		if(upsDay != null && upsDay>0){
			 content.setUpsDay(upsDay);
		}
		if(StringUtils.isNotBlank(title)){
			content.setTitle(title);
		}
		if(StringUtils.isNotBlank(shortTitle)){
			content.setShortTitle(shortTitle);		
		}
		if(StringUtils.isNotBlank(author)){
			 content.setAuthor(author);
		}
		if(StringUtils.isNotBlank(origin)){
			content.setOrigin(origin);
		}
		if(StringUtils.isNotBlank(originUrl)){
			content.setOriginUrl(originUrl);	
		}
		if(StringUtils.isNotBlank(description)){
			content.setDescription(description);
		}
		if(releaseDate!=null && releaseDate>0){
			content.setReleaseDate(releaseDate);
		}
		if(StringUtils.isNotBlank(titleColor)){
			content.setTitleColor(titleColor);
		}
		if(StringUtils.isNotBlank(bold)){
			content.setBold(bold);
		}
		if(StringUtils.isNotBlank(contentImg)){
			 content.setContentImg(contentImg);
		}
		if(StringUtils.isNotBlank(titleImg)){
			content.setTitleImg(titleImg);
		}
		if(StringUtils.isNotBlank(link)){
			content.setLink(link);
		}
		if(StringUtils.isNotBlank(txt)){
			 content.setTxt(txt);
		}
		Integer count = contentMapper.updateContent(content);
		if(count != null && count>0){
			contentMapper.updateContentExt(content);
		}
		if(count != null && count>0){
			contentMapper.updateContentTxt(content);
		}
		
		
		return count;
	}

	@Override
	public Integer deleteContent(Integer contentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
