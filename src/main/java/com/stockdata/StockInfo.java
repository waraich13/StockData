package com.stockdata;

import java.math.BigDecimal;

public class StockInfo {
	private String name;
	private BigDecimal price;
	private BigDecimal change;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "StockInfo [name=" + name + ", price=" + price + ", change=" + change + ", bid=" + bid + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getChange() {
		return change;
	}
	public void setChange(BigDecimal change) {
		this.change = change;
	}
	public BigDecimal getBid() {
		return bid;
	}
	public void setBid(BigDecimal bid) {
		this.bid = bid;
	}
	private BigDecimal bid;
	
}
