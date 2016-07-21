package com.niit.shoppingAdda.controller;


import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingAdda.model.Product;
import com.niit.shoppingAdda.model.Upload;
import com.niit.shoppingAdda.service.ProductService;

@Controller
public class AdminController {

	private ProductService productService;
	
	@Autowired(required=true)
	@Qualifier(value="productService")
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	 
	@RequestMapping(value="/admin/adminP")
	String getAllProducts(Model model)
	{
	   model.addAttribute("product", new Product());
	        model.addAttribute("listProduct", productService.getAllProducts());
	        return "AdminPage";	
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	String upload(Model model)
	{
	   model.addAttribute("upload", new Upload());
	        return "Upload";	
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	String upload1(@ModelAttribute("upload") Upload u,BindingResult result,HttpServletRequest request)
	{
		MultipartFile file=u.getImage();
		productService.uploadimage(u);
		System.out.println(u.getImage());
		String filelocation=request.getSession().getServletContext().getRealPath("/resources/images/");
		
		System.out.println(filelocation);
		String filename=filelocation+"\\"+u.getId()+".jpg";
		System.out.println(filename);
		
		
		try{
			byte b[]=file.getBytes();
			FileOutputStream fos=new FileOutputStream(filename);
			fos.write(b);
			fos.close();
	    	}
		catch(IOException ex){}
		catch(Exception e){}
	  	return "Home";
	}
	
	@RequestMapping(value="/admin/add",method=RequestMethod.POST)
	String insertProduct(@Valid @ModelAttribute("product") Product p,BindingResult result, Model model,HttpServletRequest request)
	{
		if(result.hasErrors())
		{
			System.out.println("error");
			model.addAttribute("listProduct", this.productService.getAllProducts());
			return "redirect:/admin/adminP";
		}
		else{
		if(p.getId()==0)
		{
			System.out.println("p.getid is zero");
		this.productService.addProduct(p);
		MultipartFile file=p.getImage();
		String filelocation=request.getSession().getServletContext().getRealPath("/resources/images/");
		System.out.println(filelocation);
		String filename=filelocation+"\\"+p.getId()+".jpg";
		System.out.println(filename);
		
		try{
			byte b[]=file.getBytes();
			FileOutputStream fos=new FileOutputStream(filename);
			fos.write(b);
			fos.close();
	    	}
		catch(IOException ex){}
		catch(Exception e){}
			}	
		else{
			System.out.println("product is updating");
		this.productService.updateProduct(p);		
			}
	return "redirect:/admin/adminP";
	}
	
	}

				@RequestMapping("/delete/{id}")
	    		String deleteProduct(@PathVariable("id") int id)
	    		{
	    			this.productService.removeProduct(id);
	    			return "redirect:/admin/adminP";
	    		}
	    		
	    		@RequestMapping("/edit/{id}")
	    	    public String updateProduct(@PathVariable("id") int id, Model model){
	    			System.out.println("update in controller"+id);
	    	        model.addAttribute("product", this.productService.getProductById(id));
	    	        model.addAttribute("listProduct",this.productService.getAllProducts());
	    	        return "AdminPage";
	    	    }
	  
	        }





