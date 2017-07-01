/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Function;
import com.mlycan.main.mapper.FunctionMapper;
import com.mlycan.main.service.FunctionService;

/**
 * @author sean
 *
 */
@Service
public class FunctionServiceImpl implements FunctionService{
    @Autowired
    private FunctionMapper functionmapper;
	@Override
	public List<Function> findFunction(Integer userId) {
		
		return functionmapper.findForMenu(userId);
	}
	@Override
	public List<Function> findAll(Integer count, Integer curpage,Integer parentId) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return functionmapper.findAll(count, currentCount,parentId);
	}
	@Override
	public Integer findAllCount(Integer parentId){
		// TODO Auto-generated method stub
		return functionmapper.findAllCount(parentId);
	}
	
	@Override
	public Function findFunction(Integer functionId, String functionPath) {
		// TODO Auto-generated method stub
		return functionmapper.findFunction(functionId, functionPath);
	}
	
}
