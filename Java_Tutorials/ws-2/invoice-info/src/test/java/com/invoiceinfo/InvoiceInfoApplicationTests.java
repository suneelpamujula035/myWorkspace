package com.invoiceinfo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.invoiceinfo.entity.Invoice;
import com.invoiceinfo.entity.Product;
import com.invoiceinfo.repository.InvoiceRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class InvoiceInfoApplicationTests {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Test
	@Order(1)
	public void testCreateInvoice()
	{
		List<Product> products = new ArrayList<>();
		Product product1 = new Product("TV", "Sony 54 inches TV", 45000.0, 1.0, 8.0, 45000.0);
		Product product2 = new Product("AC", "Samsung 1 ton AC", 34000.0, 1.0, 6.0, 34000.0);
		products.add(product1);
		products.add(product2);
		
		Invoice invoice = new Invoice();
		invoice.setInvoiceNumber("INV-044");
		invoice.setBillTo("Sandeep");
		invoice.setDate(LocalDate.now());
		invoice.setDueDate(LocalDate.of(2021, 12, 31));
		invoice.setStatus("Sent");
		invoice.setProduct(products);
		invoiceRepository.save(invoice);
		assertNotNull(invoiceRepository.findByInvoiceNumber("INV-044"));
	}
	
	@Test
	@Order(2)
	public void testGetAllInvoices()
	{
		List<Invoice> invoices = invoiceRepository.findAll();
		assertThat(invoices).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testSearchInvoices()
	{
		List<Invoice> invoices = invoiceRepository.findByDueDate(LocalDate.of(2021, 12, 31));
		assertThat(invoices).size().isGreaterThan(0);
	}
	
	@Test
	@Order(4)
	public void testGetOneInvoice()
	{
		Invoice invoice = invoiceRepository.findByBillTo("Sandeep");
		System.out.println(invoice.getId());
		assertEquals("Sandeep", invoice.getBillTo());
	}
	
	@Test
	@Order(5)
	public void testUpdateInvoice()
	{
		Invoice invoice = invoiceRepository.findByBillTo("Sandeep");
		invoice.setStatus("Draft");
		invoiceRepository.save(invoice);
		assertNotEquals("Sent", invoiceRepository.findByBillTo("Sandeep").getStatus());
	}
	
	@Test
	@Order(6)
	public void testDeleteInvoice()
	{
		Invoice invoice = invoiceRepository.findByBillTo("Sandeep");
		Long id = invoice.getId();
		invoiceRepository.deleteById(id);
		assertThat(invoiceRepository.existsById(id)).isFalse();
	}

}
