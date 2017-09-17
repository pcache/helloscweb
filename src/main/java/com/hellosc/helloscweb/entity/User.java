package com.hellosc.helloscweb.entity;

import java.util.Date;

public class User {
	
	/*
	 * 主键
	 */
	private String id;
	
	/*
	 * 手机号
	 */
	private String phone;
	
	/*
	 * 昵称
	 */
	private String nikeName;
	
	/*
	 * 添加时间
	 */
	private Date addTime;
	
	/*
	 * 修改时间
	 */
	private Date updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNikeName() {
		return nikeName;
	}

	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
