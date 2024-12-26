package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.exception.ProductNotFoundException;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	public ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public String saveAllProducts(List<Product> products) {
		List<Product> productsList = productRepository.saveAll(products);
		return productsList.size()+" products saved";
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProduct(long id) {
		return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found with the id : "+id));
	}

	@Override
	public Product updateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElseThrow(()-> new ProductNotFoundException("Product not found with the id : "+product.getId()));
		existingProduct.setId(product.getId());
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		productRepository.save(existingProduct);
		return existingProduct;
	}

	@Override
	public String deleteProduct(long id) {
		productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found with the id : "+id));
		productRepository.deleteById(id);
		return "Product deleted with the id : "+id;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getProductByName(String name) {
		return productRepository.findByName(name);
	}

}
