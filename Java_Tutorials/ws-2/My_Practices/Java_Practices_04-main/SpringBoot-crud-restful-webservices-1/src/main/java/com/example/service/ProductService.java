package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	// For save product
	public Product saveProduct(Product product) {
		return repo.save(product);
	}

	// For save list of products
	public List<Product> saveProducts(List<Product> products) {
		return repo.saveAll(products);
	}

	// For get all products
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	// For get product by id
	public Product getAProductById(int id) {
		return repo.findById(id).orElse(null);
	}

	// For get product by name
	public Product getProductBName(String name) {
		return repo.findByName(name);
	}
	
	// For delete product by id
	public String deleteProductById(int id)
	{
		repo.deleteById(id);
		return "product removed || "+id;
	}
	
	// For update product by id
		public Product updateProductById(Product product)
		{
			Product existingProduct = repo.findById(product.getId()).orElse(null);
			existingProduct.setName(product.getName());
			existingProduct.setQuantity(product.getQuantity());
			existingProduct.setPrice(product.getPrice());
			return repo.save(existingProduct);
		}
}
