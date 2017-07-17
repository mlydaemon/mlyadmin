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
	private Integer  appId;//
	private String   account;//机器人的账户编号
	private String   application;//应用
	private String   appName;//应用名称
	private String   classify;//词库
	private String   semantic;//核心语义库名称
	private Integer  active;//当前状态
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
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
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
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

}
