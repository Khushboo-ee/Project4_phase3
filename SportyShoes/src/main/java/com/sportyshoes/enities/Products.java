package com.sportyshoes.enities;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Products {

	@Id
	public int prodId;
	public String prodName;
	public int prodPrice;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public Products(int prodId, String prodName, int prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
