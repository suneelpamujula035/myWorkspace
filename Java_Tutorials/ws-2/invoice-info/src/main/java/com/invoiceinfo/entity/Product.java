package com.invoiceinfo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private String description;
	private double price;
	private double quantity;
	private double tax;
	private double total;
	@ManyToOne
	private Invoice invoice;
	
	public Product(String productName, String description, double price, double quantity, double tax,
			double total) {
		super();
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.tax = tax;
		this.total = total;
	}
	
}
