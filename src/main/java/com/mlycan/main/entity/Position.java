/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;

/**
 * @author sean
 *
 */
public class Position implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer positionId;//职位ID
	private Integer departmentId;//部门ID
	private String  departmentName;//部门名称
	private String  positionName;//职位名称
	private String  link;//访问地址
	private Integer  priority;//访问地址
	private String  channelIds;//栏目IDs
	
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getChannelIds() {
		return channelIds;
	}
	public void setChannelIds(String channelIds) {
		this.channelIds = channelIds;
	}
	
}
