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
	 */
	private static final long serialVersionUID = 1L;
	private Integer logicId;//逻辑ID
	private Integer sceneId;//场景ID
	private String  sceneName;//场景名称
	private String  logicName;//逻辑名称
	private String  command;//逻辑命令
	private String  semantic;//核心词库
	private String  code;//逻辑编码
	private String  comment;//备注
	private String  application;//备注
	private String  robotName;//备注
	private String  robotAccount;//备注
	private String  keywords;//关键词
	
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
	public String getSceneName() {
		return sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public Integer getSceneId() {
		return sceneId;
	}
	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getRobotName() {
		return robotName;
	}
	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}
	public String getRobotAccount() {
		return robotAccount;
	}
	public void setRobotAccount(String robotAccount) {
		this.robotAccount = robotAccount;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
}
