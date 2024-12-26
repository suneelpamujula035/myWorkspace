package com.invoiceinfo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.invoiceinfo.entity.Invoice;

public interface InvoiceService {

	void saveInvoice(Invoice invoice);
	
	Invoice getInvoice(long id);

	void updateInvoice(Invoice invoice);

	void deleteInvoice(long id);
	
	List<Invoice> fetchInvoices(PageRequest pageRequest);

	List<Invoice> fetchInvoices();
	
	List<Invoice> findByInvoiceNumber(String invoiceNumber);
	
	List<Invoice> findByDueDate(LocalDate dueDate);
	
}
