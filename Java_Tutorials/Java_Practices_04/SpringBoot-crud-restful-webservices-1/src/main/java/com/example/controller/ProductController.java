package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> addProduct(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/products/{id}")
	public Product findAllProductById(@PathVariable int id)// We can also use @Requestparam
	{
		return service.getAProductById(id);
	}

	@GetMapping("/products/{/name}")
	public Product findAllProductByName(@PathVariable String name)// We can also use @Requestparam
	{
		return service.getProductBName(name);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProductById(int id) {
		return service.deleteProductById(id);
	}

	@PutMapping("/update")
	public Product updateProductById(@RequestBody Product product) {
		return service.updateProductById(product);
	}
}
