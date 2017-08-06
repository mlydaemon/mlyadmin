/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Scene;
import com.mlycan.main.mapper.SceneMapper;
import com.mlycan.main.service.SceneService;

/**
 * @author sean
 *
 */
@Service
public class SceneServiceImpl implements SceneService{
    @Autowired
    private SceneMapper sceneMapper;
	
	@Override
	public List<Scene> findAll(Integer count, Integer curpage) {
		// TODO Auto-generated method stub
		Integer currentCount = null;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return sceneMapper.findAll(count, currentCount);
	}

	public Integer findAllCount(){
		return sceneMapper.findAllCount();
	}
	
	@Override
	public Scene findScene(Integer sceneId) {
		// TODO Auto-generated method stub
		return sceneMapper.findScene(sceneId);
	}
	
	@Override
	public Integer saveScene(String sceneName,String application,String semantic,Integer active,String comment,String level,String performer,String processor,String keywords) {
		Scene scene = new Scene();
		scene.setSceneName(sceneName);
		scene.setApplication(application);
		scene.setSemantic(semantic);
		scene.setActive(active);
		scene.setComment(comment);
		scene.setLevel(level);
		scene.setPerformer(performer);
		scene.setProcessor(processor);
		scene.setKeywords(keywords);
		return sceneMapper.saveScene(scene);
	}
	@Override
	public Integer updateScene(Integer sceneId,String sceneName,String application,String semantic,Integer active,String comment,String level,String performer,String processor,String keywords) {
		
		Scene scene = sceneMapper.findScene(sceneId);
		if(scene == null){
			return null;
		}
		if(sceneName != null ){
			scene.setSceneName(sceneName);
		}
		if(scene !=null){
			scene.setApplication(application);
		}
		if(semantic !=null){
			scene.setSemantic(semantic);
		}
		if(active !=null){
			scene.setActive(active);
		}
		if(comment !=null){
			scene.setComment(comment);
		}
		if(level !=null){
			scene.setLevel(level);
		}
		if(performer !=null){
			scene.setPerformer(performer);
		}
		if(processor !=null){
			scene.setProcessor(processor);
		}
		if(keywords !=null){
			scene.setKeywords(keywords);
		}
		return sceneMapper.updateScene(scene);
	}
	@Override
	public Integer deleteScene(Integer sceneId) {
		return sceneMapper.deleteScene(sceneId);
	}

	@Override
	public List<Scene> findByRobotAccount(String account) {
		if(StringUtils.isBlank(account)){
			return null;
		}
		return sceneMapper.findByRobotAccount(account);
	}

	@Override
	public Scene findSceneForTrain(String application, String robotAccount) {
		if(StringUtils.isBlank(robotAccount)||StringUtils.isBlank(application)){
			return null;
		}
		return sceneMapper.findSceneForTrain(application, robotAccount);
	}

	@Override
	public List<Scene> findForRobotSwitch(Integer robotId) {
		// TODO Auto-generated method stub
		return sceneMapper.findForRobotSwitch(robotId);
	}

}
