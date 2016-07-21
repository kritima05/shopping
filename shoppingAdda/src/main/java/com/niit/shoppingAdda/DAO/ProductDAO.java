package com.niit.shoppingAdda.DAO;

import java.util.List;
import com.niit.shoppingAdda.model.Product;
import com.niit.shoppingAdda.model.Upload;



/**
 * @author admin
 *
 */
public interface ProductDAO {
void addProduct(Product p);
void removeProduct(int productId);
void updateProduct(Product p);
List<Product> getAllProducts();
Product getProductById(int productId);
public void uploadimage(Upload u);
	
}
