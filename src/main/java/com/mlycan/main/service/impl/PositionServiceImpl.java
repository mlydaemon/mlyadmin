/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Position;
import com.mlycan.main.mapper.PositionMapper;
import com.mlycan.main.service.PositionService;

/**
 * @author sean
 *
 */
@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionMapper positionMapper;
	
	@Override
	public List<Position> findAll(Integer count, Integer curpage,Integer departmentId) {
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return positionMapper.findAll(count, currentCount,departmentId);
	}

	public Integer findAllCount(){
		return positionMapper.findAllCount();
	}
	
	@Override
	public Position findPosition(Integer PositionId) {
		// TODO Auto-generated method stub
		return positionMapper.findPosition(PositionId);
	}
	
	@Override
	public Integer savePosition(String  positionName,Integer  departmentId,String  link,Integer  priority,Integer[] permissions) {
		Position position = new Position();
		position.setPositionName(positionName);
		position.setDepartmentId(departmentId);
		position.setLink(link);
		position.setPriority(priority);
		 positionMapper.savePosition(position);
		 positionMapper.replacePosiChannel(position.getPositionId(),permissions);
		 return position.getPositionId();
	}
	@Override 
	public Integer updatePosition(Integer  positionId,String  positionName,Integer  departmentId,String  link,Integer  priority,Integer[] permissions) {
		
		Position position = positionMapper.findPosition(positionId);
		if(position == null){
			return null;
		}
		if(StringUtils.isNotBlank(positionName)){
			position.setPositionName(positionName);
		}
		if(departmentId != null ){
			position.setDepartmentId(departmentId);
		}
		if(StringUtils.isNotBlank(link)){
			position.setLink(link);
		}
		
		if(priority !=null){
			position.setPriority(priority);		
		}
		positionMapper.updatePosition(position);
		positionMapper.deletePosiChannel(positionId);
		positionMapper.replacePosiChannel(positionId,permissions);
		return position.getPositionId();
	}
	@Override
	public Integer deletePosition(Integer positionId) {
		// TODO Auto-generated method stub
		return positionMapper.deletePosition(positionId);
	}

}
