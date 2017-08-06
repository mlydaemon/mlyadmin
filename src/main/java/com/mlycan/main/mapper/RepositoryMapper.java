package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Repository;

public interface RepositoryMapper {

	public List<Repository>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public Repository  findRepository(@Param("knowledgeId")Integer knowledgeId);
	
	public Integer saveRepository(Repository repository);
	
	public Integer saveRiddleToKnowledge(List<String> riddle);
	
	public Integer updateRepository(Repository repository);
	
	public Integer deleteRepository(@Param("knowledgeId")Integer knowledgeId);
	
}
