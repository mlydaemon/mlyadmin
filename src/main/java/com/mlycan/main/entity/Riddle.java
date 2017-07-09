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
public class Riddle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer riddleId;//谜语ID
	private String  account;//smoon
	private String  conundrum;//谜面
	private String  mystery;//谜幕
	private String  reminder;//提示
	private String  answer;
	private String  explains;//解释
	private String  classify;//分类
	private String  createdTime;
	private String  updateTime;
	public Integer getRiddleId() {
		return riddleId;
	}
	public void setRiddleId(Integer riddleId) {
		this.riddleId = riddleId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getConundrum() {
		return conundrum;
	}
	public void setConundrum(String conundrum) {
		this.conundrum = conundrum;
	}
	public String getMystery() {
		return mystery;
	}
	public void setMystery(String mystery) {
		this.mystery = mystery;
	}
	public String getReminder() {
		return reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getExplains() {
		return explains;
	}
	public void setExplains(String explains) {
		this.explains = explains;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
