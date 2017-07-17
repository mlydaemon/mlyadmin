package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Species;

public interface SpeciesMapper {

	public List<Species>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage,@Param("parentId")Integer parentId);

	public Integer findAllCount();
	
	public Species  findSpecies(@Param("speciesId")Integer speciesId);
	
	public List<Species>  findSpeciesByPid(@Param("parentId")Integer parentId);
	
	public Integer saveSpecies(Species species);
	
	public Integer updateSpecies(Species species);
	
	public Integer deleteSpecies(@Param("speciesId")Integer speciesId);
	
}
