package com.sportyshoes.enities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	public int id;
	public String name;
	public String uname;
	public String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Admin(int id, String name, String uname, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.uname = uname;
		this.pwd = pwd;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
