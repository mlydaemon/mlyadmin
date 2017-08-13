/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author sean
 *
 */
public class Scene implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sceneId;//场景ID	
	private String sceneName;//场景名称
	private Integer robotId;//机器人ID	
	private String robotName;//机器人名称
	private String robotAccount;//机器人账号
	private String  application;//应用
	private String  semantic;//核心词库
	private Integer  active;//是否启用
	private String  comment;//备注
	private String  level;//等级
	private String  major;//等级
	private String  performer;//执行者
	private String  processor;//处理者
	private String  keywords;//关键字
	private List<Logic> logics;
	
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
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public List<Logic> getLogics() {
		return logics;
	}
	public void setLogics(List<Logic> logics) {
		this.logics = logics;
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
	public Integer getRobotId() {
		return robotId;
	}
	public void setRobotId(Integer robotId) {
		this.robotId = robotId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPerformer() {
		return performer;
	}
	public void setPerformer(String performer) {
		this.performer = performer;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
