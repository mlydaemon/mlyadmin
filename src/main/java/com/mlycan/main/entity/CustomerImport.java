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
public class CustomerImport implements Serializable{
	/**
	 * 
	 */
	private String  nickname;//真实姓名
	private String  gender;//性别
	private String  printCount;//打印次数
	private String  birthday;//出生日期
	private String  intro;//个人介绍
	private String  comefrom;//来自
	private String  qq;//QQ
	private String  email;//email
	private String  phone;//电话
	private String  mobile;//手机
	private String  portrait;//会员头像
	private String  signature;//会员个性签名
	private String  province;//会员个性签名
	private String  city;//会员个性签名
	private String  street;//会员个性签名
	private String  country;//会员个性签名
	private String  zipcode;//会员个性签名
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getComefrom() {
		return comefrom;
	}
	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPortrait() {
		return portrait;
	}
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPrintCount() {
		return printCount;
	}
	public void setPrintCount(String printCount) {
		this.printCount = printCount;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
