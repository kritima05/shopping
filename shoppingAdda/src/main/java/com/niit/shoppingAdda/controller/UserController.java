package com.niit.shoppingAdda.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.niit.shoppingAdda.model.User;
import com.niit.shoppingAdda.service.ProductService;
import com.niit.shoppingAdda.service.UserService;
@Controller
public class UserController {
	
	private UserService userService;
	
	/**
	 * @param userService the userService to set
	 */
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value = "/")
	   public String printHello(Model model) {
		
	    return "Home";  
	   }
	@RequestMapping(value = "/home")
	   public String printHello1(Model model) {
		
	    return "Home";  
	   }
	  
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public ModelAndView userLogin() {
	    ModelAndView mv=new ModelAndView("Login");
	    return mv;
	   }

	  @RequestMapping(value = "/signup", method = RequestMethod.GET)
	   public ModelAndView userRegister(Model model) {
		  model.addAttribute("user",new User());
	    ModelAndView mv=new ModelAndView("SignUp");
	    
	    return mv;
	   }
	
	  @RequestMapping(value = "/signup", method = RequestMethod.POST)
	   public String userRegisterPost(@Valid @ModelAttribute("user") User u,BindingResult result,Model model) {
		  System.out.println(u);
	    if(result.hasErrors()){
	    	
	    	
	    }
	    else{
	    	userService.addUser(u);
	    	
	    }
		  
		  
	    return "Home";
}
}
