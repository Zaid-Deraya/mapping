package com.orm.mapping.dto;

public class OrderResponse {
	
	private String name;
	private String pName;
	private int price;
	public OrderResponse(String name, String pName, int price) {
		super();
		this.name = name;
		this.pName = pName;
		this.price = price;
	}
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", pName=" + pName + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
