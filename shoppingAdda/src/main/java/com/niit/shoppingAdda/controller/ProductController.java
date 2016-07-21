package com.niit.shoppingAdda.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.shoppingAdda.model.Product;
import com.niit.shoppingAdda.service.ProductService;

@Controller
public class ProductController {
	
	private Product product;
	private ProductService productService;
	
	@Autowired(required=true)
	@Qualifier(value="productService")
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value = "/product/{sort}", method = RequestMethod.GET)
	   public ModelAndView userProduct(@PathVariable("sort") String Prodname ,  Model model) {
		  model.addAttribute("listProduct", productService.getAllProducts());

          System.out.println("hhhhhhhhhhhhhh");
          List<Product> filteredlist = new ArrayList<Product>();
          List<Product> list = productService.getAllProducts();
          Iterator<Product> i = list.iterator();
          while (i.hasNext()) {
                 Product p = (Product) i.next();
                 if (p.getCategory().equals(Prodname)) {
                        filteredlist.add(p);
                 }
 
          }
          String json = new Gson().toJson(filteredlist);
          ModelAndView mv = new ModelAndView("Product");
          mv.addObject("key",json);
          return mv;
	}
    
          @RequestMapping(value="/productdescription")
          public ModelAndView productDetailPage(@ModelAttribute("product") Product product)
          {          ModelAndView modelView=new  ModelAndView("ProductDescription");
                     this.product=product;
                     return modelView;
          }
    }
