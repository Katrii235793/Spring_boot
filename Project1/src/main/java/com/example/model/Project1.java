package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class Project1 {
	
	
	private int id;
	private String name;
	private String email;
	private long ph;
	private String addr;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setAddress(Object address) {
		// TODO Auto-generated method stub
		
	}
	

}
