/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;

/**
 * @author sean
 *
 */
public class SceneLogic implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer slogicId;//场景逻辑ID
	private String  logicName;//逻辑名称
	private String  comment;//备注
	public Integer getSlogicId() {
		return slogicId;
	}
	public void setSlogicId(Integer slogicId) {
		this.slogicId = slogicId;
	}
	public String getLogicName() {
		return logicName;
	}
	public void setLogicName(String logicName) {
		this.logicName = logicName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
