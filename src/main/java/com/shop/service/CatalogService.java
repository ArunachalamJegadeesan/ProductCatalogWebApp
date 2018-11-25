package com.shop.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shop.model.Product;

@Service
public class CatalogService {
	
	public CatalogService(){};
	
	Logger logger = LoggerFactory.getLogger(CatalogService.class);
	
	@Autowired
	private  RestTemplate template;
	
	@Value("${bff.endpoint.url}")
	private  String bffURL;
	
	public void create(Product product){	
		logger.debug("CatalogService Create Invoked" );
		if(product!=null)
		template.postForLocation(bffURL, product);
	}
	
	//retrive all products
	public Product[] retrieve(){
		logger.debug("CatalogService Retrive Invoked" );
		 Product[] products  =  template.getForObject(bffURL+"/getall", Product[].class);
		return products;
	}
	
	

}
