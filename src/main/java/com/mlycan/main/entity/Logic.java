/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;

/**
 * @author sean
 *
 */
public class Logic implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer logicId;//逻辑ID
	private String  logicName;//逻辑名称
	private String  semantic;//核心词库
	private String  code;//逻辑编码
	private String  comment;//备注
	public Integer getLogicId() {
		return logicId;
	}
	public void setLogicId(Integer logicId) {
		this.logicId = logicId;
	}
	public String getLogicName() {
		return logicName;
	}
	public void setLogicName(String logicName) {
		this.logicName = logicName;
	}
	public String getSemantic() {
		return semantic;
	}
	public void setSemantic(String semantic) {
		this.semantic = semantic;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
