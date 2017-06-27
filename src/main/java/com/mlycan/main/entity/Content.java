package com.mlycan.main.entity;

public class Content {
	private Integer contentId;
	private Integer channelId;//栏目ID
	private String channelName;//栏目ID
	private Integer userId;//用户ID
	private Long    sortDate;//排序日期
	private Integer topLevel;
	private Integer  hasTitleImg;
	private Integer  status;//状态(0:草稿;1:审核中;2:审核通过;3:回收站)
	private Integer  viewsDay;//日访问数
	private Integer   commentsDay;//日评论数
	private Integer downloadsDay;//
	private Integer upsDay;//
	private String title; //'标题',
	private String   shortTitle; // '简短标题',
	private String   author; // '作者',
	private String   origin; // '来源',
	private String   originUrl; //'来源链接',
	private String   description; // '描述',
	private Long   releaseDate; // '发布日期',
	private String   titleColor; // '标题颜色',
	private String   bold; // '是否加粗',
	private String   titleImg;// '标题图片',
	private String   contentImg; // '内容图片',
	private String   typeImg ;// '类型图片',
	private String   link ;// '外部链接',
	private String txt; //内容
	public Integer getContentId() { 
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Long getSortDate() {
		return sortDate;
	}
	public void setSortDate(Long sortDate) {
		this.sortDate = sortDate;
	}
	public Integer getTopLevel() {
		return topLevel;
	}
	public void setTopLevel(Integer topLevel) {
		this.topLevel = topLevel;
	}
	public Integer getHasTitleImg() {
		return hasTitleImg;
	}
	public void setHasTitleImg(Integer hasTitleImg) {
		this.hasTitleImg = hasTitleImg;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getViewsDay() {
		return viewsDay;
	}
	public void setViewsDay(Integer viewsDay) {
		this.viewsDay = viewsDay;
	}
	public Integer getCommentsDay() {
		return commentsDay;
	}
	public void setCommentsDay(Integer commentsDay) {
		this.commentsDay = commentsDay;
	}
	public Integer getDownloadsDay() {
		return downloadsDay;
	}
	public void setDownloadsDay(Integer downloadsDay) {
		this.downloadsDay = downloadsDay;
	}
	public Integer getUpsDay() {
		return upsDay;
	}
	public void setUpsDay(Integer upsDay) {
		this.upsDay = upsDay;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOriginUrl() {
		return originUrl;
	}
	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Long releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getTitleColor() {
		return titleColor;
	}
	public void setTitleColor(String titleColor) {
		this.titleColor = titleColor;
	}
	public String getBold() {
		return bold;
	}
	public void setBold(String bold) {
		this.bold = bold;
	}
	public String getTitleImg() {
		return titleImg;
	}
	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}
	public String getContentImg() {
		return contentImg;
	}
	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
	}
	public String getTypeImg() {
		return typeImg;
	}
	public void setTypeImg(String typeImg) {
		this.typeImg = typeImg;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
}