package com.mlycan.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Semantic;
import com.mlycan.main.mapper.SemanticMapper;
import com.mlycan.main.service.SemanticService;

@Service
public class SemanticServiceImpl implements SemanticService{
	@Autowired
    private SemanticMapper semanticMapper;
	@Override
	public List<Semantic> findList(String account, String application, String semantic) {
		// TODO Auto-generated method stub
		return semanticMapper.findList(account, application, semantic);
	}

	@Override
	public Integer replaceSemantic(String application, String semantic, String keyword, Integer precision,
			String remark) {
		Semantic sem = new Semantic();
		sem.setAccount("smoon");
		sem.setApplication(application);
		sem.setSemantic(semantic);
		sem.setKeyword(keyword);
		sem.setPrecision(precision);
		sem.setRemark(remark);
		return semanticMapper.replaceSemantic(sem);
				
	}

	@Override
	public Integer deleteSemantic(Integer semanticId) {
		// TODO Auto-generated method stub
		return semanticMapper.deleteSemantic(semanticId);
	}

}
