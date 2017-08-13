/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author sean
 *
 */
public class Semantic implements Serializable{
	/**
	 */
	private Integer semanticId;//ID	
	private String  account;//机器人账号
	private String  application;//应用编码
	private String  semantic;//语义库
	private String  keyword;//关键词
	private Integer  precision;//精确度
	private String  remark;//备注
	public Integer getSemanticId() {
		return semanticId;
	}
	public void setSemanticId(Integer semanticId) {
		this.semanticId = semanticId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getSemantic() {
		return semantic;
	}
	public void setSemantic(String semantic) {
		this.semantic = semantic;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getPrecision() {
		return precision;
	}
	public void setPrecision(Integer precision) {
		this.precision = precision;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    	
}
