package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Repository;

public interface RepositoryService {
	   
		public List<Repository>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Repository  findRepository(Integer knowledgeId);
		
		public Integer saveRepository(String  account,String  application,String  semantic,String  command,String  content,String  code);
		
		public Integer updateRepository(Integer  knowledgeId,String  account,String  application,String  semantic,String  command,String  content,String  code);
		
		public Integer deleteRepository(Integer knowledgeId);
		
}
