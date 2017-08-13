/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author sean
 *
 */
public class Reply implements Serializable{
	/**
	 */
	private Integer replyId;//ID	
	private String  account;//机器人账号
	private String  application;//应用编码
	private String  semantic;//语义库
	private String  keyword;//关键词
	private String  content;//备注
	private Integer  precision;//精确度
	private String  remark;//备注
	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
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
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getPrecision() {
		return precision;
	}
	public void setPrecision(Integer precision) {
		this.precision = precision;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
