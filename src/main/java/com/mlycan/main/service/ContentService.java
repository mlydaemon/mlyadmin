package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Content;

public interface ContentService {
public List<Content>  findAll(Integer count,Integer curpage);
	
	public Content  findContent(Integer contentId);
	public Integer saveContent(Integer channelId,Integer userId,
			Integer topLevel,Integer  hasTitleImg,Integer  status,Integer  viewsDay,Integer   commentsDay,
			Integer downloadsDay,Integer upsDay,String title,String   shortTitle,String   author,
			String   origin,String   originUrl,String   description,Long   releaseDate,String   titleColor,
			String   bold,String   titleImg,String   contentImg,String   link,String txt);
	
	public Integer updateContent(Integer contentId,Integer channelId,Integer userId,Long    sortDate,
			Integer topLevel,Integer  hasTitleImg,Integer  status,Integer  viewsDay,Integer   commentsDay,
			Integer downloadsDay,Integer upsDay,String title,String   shortTitle,String   author,
			String   origin,String   originUrl,String   description,Long   releaseDate,String   titleColor,
			String   bold,String   titleImg,String   contentImg,String   link,String txt);
	public Integer deleteContent(Integer contentId);
}
