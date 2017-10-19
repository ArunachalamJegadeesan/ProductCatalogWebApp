package com.shop.controllers;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.shop.model.Product;
import com.shop.service.CatalogService;

@Controller
public class CatalogController {

	Logger logger = LoggerFactory.getLogger(CatalogController.class);
	
	@Autowired
    private CatalogService service; 
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String 	create(Model model){				
		logger.debug("inside createProduct>>>>");
		model.addAttribute("createProduct",new Product());
		return "createProduct";
	}
	

	@RequestMapping(value = "/catalogAdd", method = RequestMethod.POST)
	public String doCreate( @ModelAttribute("createProduct") Product productForm,
							Model model,BindingResult bindingResult) {
		
		logger.debug("Entering addProduct..");
		service.create(productForm);						
		if (bindingResult.hasErrors()) {
			return "createProduct";
		}		
		//userService.save(offerForm);
		logger.debug("after save Product>>>>");
		return "redirect:/productcreated";
	}
	
	
	
}