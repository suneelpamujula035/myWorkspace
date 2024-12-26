package com.product.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.product.entity.Product;

@DataJpaTest
public class ProductRepositoryTest {

	
	@Autowired
	private ProductRepository productRepository;
	
	Product product;
	
	@BeforeEach
	void setup()
	{
		product = new Product(101, "Mixi", 12, 3400);
		productRepository.save(product);
	}

	@AfterEach
	void tearDown()
	{
		product = null;
		productRepository.deleteAll();
	}
	
	@Test
	void testFindByNameFound()
	{
		List<Product> listOfProducts = productRepository.findByName("Mixi");
		assertThat(listOfProducts.get(0).getQuantity()==product.getQuantity());
		assertThat(listOfProducts.get(0).getPrice()==product.getPrice());
	}
	
	@Test
	void testFindByNameNotFound()
	{
		List<Product> listOfProducts = productRepository.findByName("TV");
		assertThat(listOfProducts.isEmpty()).isTrue();
	}
	
}