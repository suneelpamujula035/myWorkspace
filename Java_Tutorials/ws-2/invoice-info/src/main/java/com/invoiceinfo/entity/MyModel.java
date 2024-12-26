package com.invoiceinfo.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyModel {

	private InvoiceDto invoiceDto;
	private List<ProductDto> productDto;
}
