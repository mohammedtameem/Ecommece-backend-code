package com.luv2code.ecommerce.dto;

import lombok.Data;


public class PurchaseResponse {

    private String orderTrackingNumber;

	public PurchaseResponse(String orderTrackingNumber) {
		super();
		this.orderTrackingNumber = orderTrackingNumber;
	}

	public PurchaseResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}

	public void setOrderTrackingNumber(String orderTrackingNumber) {
		this.orderTrackingNumber = orderTrackingNumber;
	}
    
    

}
