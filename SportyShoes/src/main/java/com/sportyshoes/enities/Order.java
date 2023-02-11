package com.sportyshoes.enities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Order {
	@Id
	public int orderId;
	public Date orderDate;
	public int orderAmt;
	public List<Products> prodList;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(int orderAmt) {
		this.orderAmt = orderAmt;
	}
	public List<Products> getProdList() {
		return prodList;
	}
	public void setProdList(List<Products> prodList) {
		this.prodList = prodList;
	}
	public Order(int orderId, Date orderDate, int orderAmt, List<Products> prodList) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderAmt = orderAmt;
		this.prodList = prodList;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
