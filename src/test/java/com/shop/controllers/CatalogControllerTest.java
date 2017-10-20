/*
package com.shop.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
 
import java.util.Arrays;
 
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
 
import com.shop.model.Product;
import com.shop.service.CatalogService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestContext.class, WebAppContext.class})
@WebAppConfiguration
public class CatalogControllerTest {
	
	@Autowired 
    private  CatalogService service; 
	
	public void findAllProducts_ShouldAddEntriesToModelAndRenderToView() throws Exception 
	{
		
		Product p1 = new Product("iPhone8","i5365","Dallas","TX","Y");
		Product p2 = new Product("iPhone5S","i5368","Dallas","TX","Y");
		
		when(service.retrieve()).thenReturn(Arrays.asList(p1, p2));
		 
		
        
	}
}
*/