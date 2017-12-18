package com.mtc.app.vo;

public class Order {
	
	private int orderId;
	private int productId;
	private int orderQuantiy;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, int productId, int orderQuantiy) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.orderQuantiy = orderQuantiy;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public int getOrderQuantiy() {
		return orderQuantiy;
	}

	public void setOrderQuantiy(int orderQuantiy) {
		this.orderQuantiy = orderQuantiy;
	}
	
	

}
