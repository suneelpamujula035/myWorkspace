package com.invoiceinfo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDto {

	private Long id;
	private String invoiceNumber;
	private String billTo;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate date;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dueDate;
	private String status;
	private double amount;
}
