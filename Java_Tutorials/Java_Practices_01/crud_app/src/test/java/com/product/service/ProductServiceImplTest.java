package com.product.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

public class ProductServiceImplTest {

	@Mock
	private ProductRepository productRepository;
	private ProductService productService;
	
	AutoCloseable autoCloseable;
	Product product;
	
	@BeforeEach
	void setUp()
	{
		autoCloseable = MockitoAnnotations.openMocks(this);
		productService = new ProductServiceImpl(productRepository);
		product = new Product(101, "Washing Machine", 8, 23500);
	}
	
	@AfterEach
	void tearDown() throws Exception
	{
		autoCloseable.close();
	}
	
	@Test
	void saveProductTest()
	{
		mock(Product.class);
		mock(ProductRepository.class);
		
		when(productRepository.save(product)).thenReturn(product);
		assertThat(productService.saveProduct(product)).isEqualTo(product);
	}
	
//	@Test
//	void updateProductTest()
//	{
//		mock(Product.class);
//		mock(ProductRepository.class);
//		
//		when(productRepository.save(product)).thenReturn(product);
//		assertThat(productService.updateProduct(product)).isEqualTo(product);
//	}
	
	@Test
	void getProductTest()
	{
		mock(Product.class);
		mock(ProductRepository.class);
		
		when(productRepository.findById(101L)).thenReturn(Optional.ofNullable(product));
		assertThat(productService.getProduct(101L).getName()).isEqualTo(product.getName());
	}
	
//	@Test
//	void getProductByNameTest()
//	{
//		mock(Product.class);
//		mock(ProductRepository.class);
//		
//		when(productRepository.findByName("Washing Machine").get(0).getQuantity()).thenReturn(new ArrayList<Product>(Collections.singleton(product)))
//	}
	
	@Test
	void getAllProductsTest()
	{
		mock(Product.class);
		mock(ProductRepository.class);
		
		when(productRepository.findAll()).thenReturn(new ArrayList<Product>(Collections.singleton(product)));
		assertThat(productService.getAllProducts().get(0).getName()).isEqualTo(product.getName());
	}
}
