/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Species;
import com.mlycan.main.mapper.SpeciesMapper;
import com.mlycan.main.service.SpeciesService;

/**
 * @author sean
 *
 */
@Service
public class SpeciesServiceImpl implements SpeciesService{
    @Autowired
    private SpeciesMapper speciesMapper;
	
	@Override
	public List<Species> findAll(Integer count, Integer curpage,Integer parentId) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return speciesMapper.findAll(count, currentCount,parentId);
	}

	public Integer findAllCount(){
		return speciesMapper.findAllCount();
	}
	
	@Override
	public Species findSpecies(Integer speciesId) {
		// TODO Auto-generated method stub
		return speciesMapper.findSpecies(speciesId);
	}
	@Override
	public List<Species> findSpeciesByPid(Integer parentId) {
		// TODO Auto-generated method stub
		return speciesMapper.findSpeciesByPid(parentId);
	}
	
	@Override
	public Integer saveSpecies(Integer parentId,String speciesName,Integer active,String comment) {
		Species species = new Species();
		species.setParentId(parentId);
		species.setSpeciesName(speciesName);
		species.setActive(active);
		species.setComment(comment);
		return speciesMapper.saveSpecies(species);
	}
	@Override
	public Integer updateSpecies(Integer  speciesId,Integer parentId,String speciesName,Integer active,String comment) {
		
		Species species = speciesMapper.findSpecies(speciesId);
		if(species == null){
			return null;
		}
		if(parentId != null ){
			species.setParentId(parentId);
		}
		if(speciesName !=null){
			species.setSpeciesName(speciesName);
		}
		if(active !=null){
			species.setActive(active);
		}
		if(comment !=null){
			species.setComment(comment);
		}
		return speciesMapper.updateSpecies(species);
	}
	@Override
	public Integer deleteSpecies(Integer speciesId) {
		return speciesMapper.deleteSpecies(speciesId);
	}

}
