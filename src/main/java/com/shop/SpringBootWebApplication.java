package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import com.shop.service.CatalogService;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@ComponentScan("com.shop")
public class SpringBootWebApplication  extends SpringBootServletInitializer {

	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class);
    }
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	
	@Bean
	public RestTemplate template(){
		return new RestTemplate();		
	}
	
	@Bean
	public CatalogService service(){
		return new CatalogService();		
	}
	
}