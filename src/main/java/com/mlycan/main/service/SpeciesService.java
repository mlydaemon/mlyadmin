package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Species;

public interface SpeciesService {
	   
		public List<Species>  findAll(Integer count,Integer curpage,Integer parentId);

		public Integer findAllCount();
		
		public Species  findSpecies(Integer speciesId);
		
		public List<Species>  findSpeciesByPid(Integer parentId);
		
		public Integer saveSpecies(Integer parentId,String speciesName,Integer active,String comment);
		
		public Integer updateSpecies(Integer  speciesId,Integer parentId,String speciesName,Integer active,String comment);
		
		public Integer deleteSpecies(Integer speciesId);
		
}
