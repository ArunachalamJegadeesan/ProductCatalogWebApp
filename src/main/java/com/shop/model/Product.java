package com.shop.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

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
	public String getUsoc() {
		return usoc;
	}
	public void setUsoc(String usoc) {
		this.usoc = usoc;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	@NotEmpty(message = "Product Name is Blank/inValid")
	@NotNull
	private String productName;
	
	@NotEmpty(message = "Region Code is Blank/inValid")
	@Size(min = 2, max = 10)	
	private String regionCode;
	
	@NotEmpty(message = "State Code is Blank/inValid- State Code Should be two digits")
	@Size(min = 2, max = 2)
	private String stateCode;
	
	@NotEmpty(message = "usoc invlaid")
	@NotNull
	private String usoc;
	@NotNull
	private String available;
	
	public String toString(){

        if (available.equals("Y"))
        return productName +" available in  region"+ regionCode+ "of the state "+stateCode +"(usoc :"+usoc+")";
        else
            return productName +"  not available in  region"+ regionCode+ "of the state "+stateCode +"(usoc :"+usoc+")";
    }
	public Product(String productName, String usoc,
            String regionCode, String stateCode, String available){
		this.productName=productName;
		this.usoc=usoc;
		this.regionCode=regionCode;
		this.stateCode=stateCode;
		this.available=available;
  }
  public Product(){	
	  
  }
}
