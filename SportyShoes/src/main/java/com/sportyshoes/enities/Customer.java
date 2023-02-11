package com.sportyshoes.enities;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Customer {
	@Id
	public int custId;
	public String custName;
	public String custUsername;
	public String custPassword;
	public Order orderId;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustUsername() {
		return custUsername;
	}
	public void setCustUsername(String custUsername) {
		this.custUsername = custUsername;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public Order getOrderId() {
		return orderId;
	}
	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String custUsername, String custPassword, Order orderId) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custUsername = custUsername;
		this.custPassword = custPassword;
		this.orderId = orderId;
	}
	

}
