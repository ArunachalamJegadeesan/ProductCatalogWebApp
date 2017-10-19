package com.shop.model;

import java.io.Serializable;

public class Product implements Serializable {
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getusoc() {
		return usoc;
	}
	public void setusoc(String usoc) {
		usoc = usoc;
	}
	public char isAvailable() {
		return isAvailable;
	}
	public void setAvailable(char isAvailable) {
		this.isAvailable = isAvailable;
	}
	private String productName;
	private String regionCode;
	private String stateCode;
	private String usoc;
	private char isAvailable;
	
	

}
