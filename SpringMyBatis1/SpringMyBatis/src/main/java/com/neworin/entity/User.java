package com.neworin.entity;

import java.util.List;

/**
 * 用户信息实体类
 * 
 */
public class User {
	private int uid;
	private String uname;
	private String upwd;
	private List<Role> roles; // 与角色表，多对多的关联
	private Certi certi; // 与身份证表，一对一的关联

	public User() {
		super();
	}

	public User(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}

	public User(int uid, String uname, String upwd) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Certi getCerti() {
		return certi;
	}

	public void setCerti(Certi certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd
				+ ", roles=" + roles + ", certi=" + certi + "]";
	}

}
