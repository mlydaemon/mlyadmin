package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.RiddleClassify;

public interface RiddleClassifyService {
	
	public List<RiddleClassify>  findAll(Integer count,Integer curpage);

	public Integer findAllCount();
	
	public RiddleClassify  findRiddleClassify(Integer riddleClassifyId);
	
	public Integer saveRiddleClassify(Integer  parentId,String classify,Integer  priority,Integer content,Integer  display);
	
	public Integer updateRiddleClassify(Integer  riddleClassifyId,Integer parentId,String classify,Integer  priority,Integer hascontent,Integer  display);
	
	public Integer deleteRiddleClassify(Integer riddleClassifyId);
		
}
