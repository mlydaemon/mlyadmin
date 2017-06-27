package com.mlycan.main.entity;

import java.io.Serializable;

public class User  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer userId;//用户序号	Y
	private String  account;//账号	Y
	private String  password;//密码	Y
	private String  positionIds;//职位ids
	private String  positionNames;//职位名称
	private String  nickname;//职位名称
	private String  phone;//职位名称
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPositionIds() {
		return positionIds;
	}
	public void setPositionIds(String positionIds) {
		this.positionIds = positionIds;
	}
	public String getPositionNames() {
		return positionNames;
	}
	public void setPositionNames(String positionNames) {
		this.positionNames = positionNames;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
