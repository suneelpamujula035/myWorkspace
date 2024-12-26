package com.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	
	@Autowired
	public ProductService productService;
	
	private static final Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping("/allproducts")
	public ResponseEntity<String> saveAllProduct(@RequestBody List<Product> products)
	{
		log.info("saveAllProduct(@RequestBody List<Product> products) method begins");
		log.debug("saveAllProduct(@RequestBody List<Product> products) method begins");
		return new ResponseEntity<String>(productService.saveAllProducts(products), HttpStatus.CREATED);
	}
	
	@PostMapping
	public ResponseEntity<Product> saveProduct(@RequestBody Product product)
	{
		return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Product> getProduct(@PathVariable long id)
	{
		return new ResponseEntity<Product>(productService.getProduct(id), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Product> updateProduct(@RequestBody Product product)
	{
		return new ResponseEntity<Product>(productService.updateProduct(product), HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable long id)
	{
		return new ResponseEntity<String>(productService.deleteProduct(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Product>> getAllProduct()
	{
		return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/getProduct/{name}")
	public ResponseEntity<List<Product>> getProduct(@PathVariable String name)
	{
		return new ResponseEntity<List<Product>>(productService.getProductByName(name), HttpStatus.OK);
	}
}
