package com.shop.service;

import java.util.ArrayList;
import java.util.List;

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
	RestTemplate template;
	
	@Value("${catalog.service.endpoint.url}")
	private  String catlogserviceurl;
	
	public void create(Product product){	
		logger.info("CatalogService Create Invoked" );
		if(product!=null)
		template.postForLocation(catlogserviceurl, product);						
	}
	
	
	public Product[] retrieve(){
		logger.info("CatalogService Retrive Invoked" );
		 Product[] products  =  template.getForObject(catlogserviceurl, Product[].class);		  		
		return products;
	}
	
	

}
