package com.niit.shoppingAdda.service;

import java.util.List;

import com.niit.shoppingAdda.model.Product;
import com.niit.shoppingAdda.model.Upload;

public interface ProductService{
void addProduct(Product p);
void removeProduct(int productId);
void updateProduct(Product p);
List<Product> getAllProducts();
Product getProductById(int productId);
public void uploadimage(Upload u);
	
}
