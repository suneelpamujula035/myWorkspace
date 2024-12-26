package com.invoiceinfo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

	private Long id;
	private String productName;
	private String description;
	private double price;
	private double quantity;
	private double tax;
	private double total;
}
