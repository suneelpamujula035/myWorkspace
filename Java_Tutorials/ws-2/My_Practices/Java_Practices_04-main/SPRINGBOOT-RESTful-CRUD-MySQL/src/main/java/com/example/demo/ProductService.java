package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;

	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	public void saveProduct(Product product) {
		repo.save(product);
	}

	public Product getProductById(Integer id) {
		return repo.findById(id).get();
	}

	public void deleteProductById(Integer id) {
		repo.deleteById(id);
	}
}
