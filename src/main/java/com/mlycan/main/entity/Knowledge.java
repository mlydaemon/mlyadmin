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
public class Knowledge implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  questionId;//问题ID
	private String  answerId;//应答ID
	//提问
	private String  account;//机器人账号
	private String  application;//机器人名称
	private String  semantic;//当前语义库
	private String  questionCommand;//语义
	private String  questionContent;//内容
	//应答
	private String  answerContent;//内容
	private String  answerCommand;//语义
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
	public String getQuestionCommand() {
		return questionCommand;
	}
	public void setQuestionCommand(String questionCommand) {
		this.questionCommand = questionCommand;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public String getAnswerCommand() {
		return answerCommand;
	}
	public void setAnswerCommand(String answerCommand) {
		this.answerCommand = answerCommand;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	
	
}
