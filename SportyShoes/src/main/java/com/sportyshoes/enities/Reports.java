package com.sportyshoes.enities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Reports {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int rptId;
	public Date rptDate;
	public Customer custId;
	public Customer custName;
	public Order orderId;
	public Order orderAmt;
	public List<Products> prodList;
	public int getRptId() {
		return rptId;
	}
	public void setRptId(int rptId) {
		this.rptId = rptId;
	}
	public Date getRptDate() {
		return rptDate;
	}
	public void setRptDate(Date rptDate) {
		this.rptDate = rptDate;
	}
	public Customer getCustId() {
		return custId;
	}
	public void setCustId(Customer custId) {
		this.custId = custId;
	}
	public Customer getCustName() {
		return custName;
	}
	public void setCustName(Customer custName) {
		this.custName = custName;
	}
	public Order getOrderId() {
		return orderId;
	}
	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}
	public Order getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(Order orderAmt) {
		this.orderAmt = orderAmt;
	}
	public List<Products> getProdList() {
		return prodList;
	}
	public void setProdList(List<Products> prodList) {
		this.prodList = prodList;
	}
	public Reports(int rptId, Date rptDate, Customer custId, Customer custName, Order orderId, Order orderAmt,
			List<Products> prodList) {
		super();
		this.rptId = rptId;
		this.rptDate = rptDate;
		this.custId = custId;
		this.custName = custName;
		this.orderId = orderId;
		this.orderAmt = orderAmt;
		this.prodList = prodList;
	}
	public Reports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
