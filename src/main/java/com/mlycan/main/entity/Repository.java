/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;

/**
 * @author sean
 *
 */
public class Repository implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer knowledgeId;//谜语ID
	private String  account;//smoon
	private String  application;//所属场景
	private String  semantic;//语义
	private String  command;//命令
	private String  content;//内容
	private String  code;//
	private String  majorContent;// 
	private String  createTime;//创建时间
	public Integer getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(Integer knowledgeId) {
		this.knowledgeId = knowledgeId;
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
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getMajorContent() {
		return majorContent;
	}
	public void setMajorContent(String majorContent) {
		this.majorContent = majorContent;
	}
	
}