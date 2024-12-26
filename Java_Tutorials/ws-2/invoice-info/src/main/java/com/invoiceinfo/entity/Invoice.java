package com.invoiceinfo.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String invoiceNumber;
	private String billTo;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate date;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dueDate;
	private String status;
	private double amount;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="invoice_id")
	private List<Product> product = new ArrayList<>();
	
}
