/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;

/**
 * @author sean
 *
 */
public class Answer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer answerId;//应答ID
	private String  account;//机器人账号
	private String  application;//机器人名称
	private String  question;//问题
	private String  content;//内容
	private String  command;//语义
	private Integer  pattern;//模式
	public Integer getAnswerId() {
		return answerId;
	}
	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
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
	public Integer getPattern() {
		return pattern;
	}
	public void setPattern(Integer pattern) {
		this.pattern = pattern;
	}
}
