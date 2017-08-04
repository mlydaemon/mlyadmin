/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;

/**
 * 
 */
public class Application implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer robotSceneId;//场景ID	
	private Integer sceneId;//场景ID	
	private String sceneName;//场景名称
	private String  sceneComment;//场景备注
	private Integer robotId;//机器人ID	
	private String robotName;//机器人名称
	private String robotAccount;//机器人账号
	private String  robotComment;//机器人备注
	private String  application;//应用
	private String  semantic;//核心词库
	public Integer getSceneId() {
		return sceneId;
	}
	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}
	public String getSceneName() {
		return sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}
	public String getSceneComment() {
		return sceneComment;
	}
	public void setSceneComment(String sceneComment) {
		this.sceneComment = sceneComment;
	}
	public Integer getRobotId() {
		return robotId;
	}
	public void setRobotId(Integer robotId) {
		this.robotId = robotId;
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
	public String getRobotComment() {
		return robotComment;
	}
	public void setRobotComment(String robotComment) {
		this.robotComment = robotComment;
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
	public Integer getRobotSceneId() {
		return robotSceneId;
	}
	public void setRobotSceneId(Integer robotSceneId) {
		this.robotSceneId = robotSceneId;
	}
    	
}
