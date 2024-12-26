package com.product.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.product.entity.Product;
import com.product.service.ProductService;

import ch.qos.logback.core.net.ObjectWriter;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private ProductService productService;
	
	Product productOne;
	Product productTwo;
	List<Product> productList = new ArrayList<>();
	
	@BeforeEach
	void setUp()
	{
		productOne = new Product(101, "Washing Machine", 8, 23500);
		productTwo = new Product(102, "Refrigirator", 3, 45000);
		productList.add(productOne);
		productList.add(productTwo);
	}
	
	@AfterEach
	void tearDown() throws Exception
	{
		
	}
	
	@Test
	void getProductTest() throws Exception
	{
		when(productService.getProduct(101L)).thenReturn(productOne);
		this.mockMvc.perform(get("/api/product/101")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	void getAllProductsTest() throws Exception
	{
		when(productService.getAllProducts()).thenReturn(productList);
		this.mockMvc.perform(get("/api/product")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	void deleteProductTest() throws Exception
	{
		when(productService.deleteProduct(101L)).thenReturn("Product deleted with the id : "+101L);
		this.mockMvc.perform(delete("/api/product/101")).andDo(print()).andExpect(status().isOk());
	}
	
//	@Test
//	void saveProductTest() throws Exception
//	{
//		ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
//        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
//        String requestJson=ow.writeValueAsString(productOne);
//        
//		when(productService.saveProduct(productOne)).thenReturn(productOne);
//		this.mockMvc.perform(post("/api/product").contentType(MediaType.APPLICATION_JSON).content(requestJson).andDo(print()).andExpect(status().isOk());
//	}
}
