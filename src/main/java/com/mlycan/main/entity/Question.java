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
public class Question implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer questionId;//语义ID
	private String  account;//机器人账号
	private String  application;//机器人名称
	private String  content;//内容
	private String  command;//语义
	private String  classify;//当前词库
	private String  nextclassify;//跳转词库
	private String  createTime;//创建时间
	private Integer  pattern;//模式
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public String getNextclassify() {
		return nextclassify;
	}
	public void setNextclassify(String nextclassify) {
		this.nextclassify = nextclassify;
	}
	public Integer getPattern() {
		return pattern;
	}
	public void setPattern(Integer pattern) {
		this.pattern = pattern;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
