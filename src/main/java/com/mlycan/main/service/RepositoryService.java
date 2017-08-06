package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Repository;

public interface RepositoryService {
	   
		public List<Repository>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Repository  findRepository(Integer knowledgeId);
		
		public Integer saveRepository(String  account,String  application,String  semantic,String  command,String  content,Integer  masterId,String  createTime);
		
		public Integer saveRiddleToKnowledge(String  account,String  conundrum,String  mystery,String  reminder,String  answer,String  explains);
		
		public Integer updateRepository(Integer  knowledgeId,String  account,String  application,String  semantic,String  command,String  content,Integer  masterId,String  createTime);
		
		public Integer deleteRepository(Integer knowledgeId);
		
}
