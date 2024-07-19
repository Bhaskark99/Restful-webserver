package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer pId;
	private String pcode;
	private double  pcost;
	private double pdiscount;
	private double pgst;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	public double getPdiscount() {
		return pdiscount;
	}
	public void setPdiscount(double pdiscount) {
		this.pdiscount = pdiscount;
	}
	public double getPgst() {
		return pgst;
	}
	public void setPgst(double pgst) {
		this.pgst = pgst;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pcode=" + pcode + ", pcost=" + pcost + ", pdiscount=" + pdiscount + ", pgst="
				+ pgst + "]";
	}
	
	

}
