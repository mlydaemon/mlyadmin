package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Content;

public interface ContentMapper {
	public List<Content>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);
	
	public Content  findContent(@Param("contentId")Integer contentId);
	
	public Integer saveContent(Content content);
	public Integer saveContentExt(Content content);
	public Integer saveContentTxt(Content content);
	
	public Integer updateContent(Content content);
	public Integer updateContentExt(Content content);
	public Integer updateContentTxt(Content content);
	
}
