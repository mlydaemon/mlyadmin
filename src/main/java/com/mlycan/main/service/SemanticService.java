package com.mlycan.main.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Customer;
import com.mlycan.main.entity.Semantic;

public interface SemanticService {
	
	    //配置语义库
		public List<Semantic>  findList(String  account,String  application,String  semantic);
		
		public Integer  replaceSemantic(String  application,String  semantic,String  keyword,Integer  precision,String  remark);
		/*获取语义库详情*/
		public Integer  deleteSemantic(Integer semanticId);
		
}
