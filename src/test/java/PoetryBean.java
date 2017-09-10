/**   
* @Title: PoetryBean.java 
* @Package com.mlycan.crawler.engine 
* @Description: TODO(用一句话描述该文件做什么) 
* @author mlycan  yuwei   
* @date 2017年9月6日 下午1:08:10 
* @version V1.0   
*/


/** 
* @ClassName: PoetryBean 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author mlycan  yuwei  
* @date 2017年9月6日 下午1:08:10 
*  
*/
public class PoetryBean {
     private String title;//标题
     private String author;//作者
     private String type;//类型
     private String original;//原文
     private String annotation;//注释
     private String translation;//译文
     private String appreciation;//鉴赏
     public PoetryBean(){
    	 
     }
     public PoetryBean(String title,String author,String type,String original,String annotation,String translation,String appreciation){
    	 this.title= title;
    	 this.author= author;
    	 this.type= type;
    	 this.original= original;
    	 this.annotation= annotation;
    	 this.translation= translation;
    	 this.appreciation= appreciation;  	 
     }
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	public String getAppreciation() {
		return appreciation;
	}
	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
     
}
