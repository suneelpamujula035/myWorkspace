package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {

	public String saveAllProducts(List<Product> products);
	public Product saveProduct(Product product);
	public Product getProduct(long id);
	public Product updateProduct(Product product);
	public String deleteProduct(long id);
	public List<Product> getAllProducts();
	public List<Product> getProductByName(String name);
}
