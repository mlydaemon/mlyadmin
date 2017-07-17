/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.SceneLogic;
import com.mlycan.main.mapper.SceneLogicMapper;
import com.mlycan.main.service.SceneLogicService;

/**
 * @author sean
 *
 */
@Service
public class SceneLogicServiceImpl implements SceneLogicService{
    @Autowired
    private SceneLogicMapper SceneLogicMapper;
	
	@Override
	public List<SceneLogic> findAll(Integer count, Integer curpage) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return SceneLogicMapper.findAll(count, currentCount);
	}

	public Integer findAllCount(){
		return SceneLogicMapper.findAllCount();
	}
	
	@Override
	public SceneLogic findSceneLogic(Integer slogicId) {
		// TODO Auto-generated method stub
		return SceneLogicMapper.findSceneLogic(slogicId);
	}
	
	@Override
	public Integer saveSceneLogic(String logicName,String comment) {
		SceneLogic sceneLogic = new SceneLogic();
		sceneLogic.setLogicName(logicName);
		sceneLogic.setComment(comment);
		return SceneLogicMapper.saveSceneLogic(sceneLogic);
	}
	@Override
	public Integer updateSceneLogic(Integer  slogicId,String logicName,String comment) {
		
		SceneLogic sceneLogic = SceneLogicMapper.findSceneLogic(slogicId);
		if(sceneLogic == null){
			return null;
		}
		if(slogicId != null ){
			sceneLogic.setSlogicId(slogicId);
		}
		if(logicName !=null){
			sceneLogic.setLogicName(logicName);
		}
		if(comment !=null){
			sceneLogic.setComment(comment);
		}
		return SceneLogicMapper.updateSceneLogic(sceneLogic);
	}
	@Override
	public Integer deleteSceneLogic(Integer slogicId) {
		return SceneLogicMapper.deleteSceneLogic(slogicId);
	}

}
