/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.common.web.Constants;
import com.mlycan.main.entity.Repository;
import com.mlycan.main.entity.Riddle;
import com.mlycan.main.mapper.RepositoryMapper;
import com.mlycan.main.service.RepositoryService;

/**
 * @author sean
 *
 */
@Service
public class RepositoryServiceImpl implements RepositoryService{
    @Autowired
    private RepositoryMapper repositoryMapper;
	
	@Override
	public List<Repository> findAll(Integer count, Integer curpage) {
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return repositoryMapper.findAll(count, currentCount);
	}

	public Integer findAllCount(){
		return repositoryMapper.findAllCount();
	}
	
	@Override
	public Repository findRepository(Integer knowledgeId) {
		// TODO Auto-generated method stub
		return repositoryMapper.findRepository(knowledgeId);
	}
	
	@Override
	public Integer saveRepository(String  account,String  application,String  semantic,String  command,String  content,String  code) {
		Repository repository = new Repository();
		repository.setAccount(account);
		repository.setApplication(application);
		repository.setSemantic(semantic);
		repository.setCommand(command);
		repository.setContent(content);
		repository.setCode(Constants.SPT+code+Constants.SPT+content.hashCode());
		return repositoryMapper.saveRepository(repository);
	}
	@Override
	public Integer updateRepository(Integer  knowledgeId,String  account,String  application,String  semantic,String  command,String  content,String  code) {
		
		Repository repository = repositoryMapper.findRepository(knowledgeId);
		if(repository == null){
			return null;
		}
		if(StringUtils.isNotBlank(account)){
			repository.setAccount(account);
		}
		if(application != null ){
			repository.setApplication(application);
		}
		if(semantic !=null){
			repository.setSemantic(semantic);
		}
		if(command !=null){
			repository.setCommand(command);
		}
		if(content !=null){
			repository.setContent(content);
		}
		repository.setCode(Constants.SPT+code+Constants.SPT+content.hashCode());
		return repositoryMapper.updateRepository(repository);
	}
	@Override
	public Integer deleteRepository(Integer knowledgeId) {
		// TODO Auto-generated method stub
		return repositoryMapper.deleteRepository(knowledgeId);
	}

}
