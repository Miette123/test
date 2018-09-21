package com.example.demo.order;

public class Order {
	private Long id;
	private String orderName;
	private String orderTime;
	private String content;
	public Long getId() {
		return id;
	}
	public String getOrderName() {
		return orderName;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	
}
