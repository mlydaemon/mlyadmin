/**
 * 
 */
package com.mlycan.main.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author sean
 *
 *  谜语分类实体
 */

public class RiddleClassify implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer riddleClassifyId;//谜语分类ID
	private Integer parentId;//上级分类ID
	private String  classify;//谜语类别
	private Integer  priority;//分类优先级，默认为10
	private Integer  hascontent;//是否有内容，默认有
	private Integer  display;//是否显示，默认显示
	public Integer getRiddleClassifyId() {
		return riddleClassifyId;
	}
	public void setRiddleClassifyId(Integer riddleClassifyId) {
		this.riddleClassifyId = riddleClassifyId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getHascontent() {
		return hascontent;
	}
	public void setHascontent(Integer hascontent) {
		this.hascontent = hascontent;
	}
	public Integer getDisplay() {
		return display;
	}
	public void setDisplay(Integer display) {
		this.display = display;
	}
}
