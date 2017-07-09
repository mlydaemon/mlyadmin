/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.RiddleClassify;
import com.mlycan.main.mapper.RiddleClassifyMapper;
import com.mlycan.main.service.RiddleClassifyService;

/**
 * @author sean
 *
 */
@Service
public class RiddleClassifyServiceImpl implements RiddleClassifyService{
	   @Autowired
	    private RiddleClassifyMapper riddleClassifyMapper;
		
		@Override
		public List<RiddleClassify> findAll(Integer count, Integer curpage) {
			Integer currentCount = 0;
			if(count!=null && curpage!= null){
				currentCount = (curpage-1)*count;
			}
			return riddleClassifyMapper.findAll(count, currentCount);
		}

		public Integer findAllCount(){
			return riddleClassifyMapper.findAllCount();
		}
		
		@Override
		public RiddleClassify findRiddleClassify(Integer riddleClassifyId) {
			// TODO Auto-generated method stub
			return riddleClassifyMapper.findRiddleClassify(riddleClassifyId);
		}
		
		@Override
		public Integer saveRiddleClassify(Integer  parentId,String classify,Integer  priority,Integer hascontent,Integer  display) {
			RiddleClassify riddleClassify =new RiddleClassify();
			riddleClassify.setParentId(0);
			riddleClassify.setClassify(classify);;
			riddleClassify.setPriority(priority);
			riddleClassify.setHascontent(hascontent);
			riddleClassify.setDisplay(display);
			
			return riddleClassifyMapper.saveRiddleClassify(riddleClassify);
		}
		@Override
		public Integer updateRiddleClassify(Integer  riddleClassifyId,Integer parentId,String classify,Integer  priority,Integer content,Integer  display) {
			
			RiddleClassify riddleClassify = riddleClassifyMapper.findRiddleClassify(riddleClassifyId);
			if(riddleClassify == null){
				return null;
			}
			if(parentId != null ){
				riddleClassify.setParentId(parentId);
			}
			if(classify !=null){
				riddleClassify.setClassify(classify);
			}
			if(priority !=null){
				riddleClassify.setPriority(priority);		
			}
			if(content !=null){
				riddleClassify.setHascontent(content);		
			}
			if(display !=null){
				riddleClassify.setDisplay(display);
			}
			return riddleClassifyMapper.updateRiddleClassify(riddleClassify);
		}
		@Override
		public Integer deleteRiddleClassify(Integer riddleClassifyId) {
			// TODO Auto-generated method stub
			return riddleClassifyMapper.deleteRiddleClassify(riddleClassifyId);
		}
}
