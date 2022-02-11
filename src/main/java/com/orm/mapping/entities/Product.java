package com.orm.mapping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

	@Id
	private int pid;
	private String pName;
	private int qty;
	private int price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", qty=" + qty + ", price=" + price + "]";
	}

	public Product(int pid, String pName, int qty, int price) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.qty = qty;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
