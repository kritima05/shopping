package com.niit.shoppingAdda.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingAdda.DAO.ProductDAO;
import com.niit.shoppingAdda.model.Product;
import com.niit.shoppingAdda.model.Upload;

@Service
public class ProductServiceImp implements ProductService {
	private ProductDAO productDAO;
	public void setProductDAO(ProductDAO productDAO)
	{
		this.productDAO=productDAO;		
	}
	@Transactional
	public void addProduct(Product p) {
		this.productDAO.addProduct(p);
	}

	@Transactional
	public void removeProduct(int productId) {
		this.productDAO.removeProduct(productId);
	}
	@Transactional
	public void updateProduct(Product p) {
		System.out.println("update in service");
		this.productDAO.updateProduct(p);
	}
	@Transactional
	public List<Product> getAllProducts() {
		return this.productDAO.getAllProducts();
	}
	@Transactional
	public Product getProductById(int productId) {
		return this.productDAO.getProductById(productId);
	}
	@Transactional
	public void uploadimage(Upload u) {
		this.productDAO.uploadimage(u);
		
	}
}
