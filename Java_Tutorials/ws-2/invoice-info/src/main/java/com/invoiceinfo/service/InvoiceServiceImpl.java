package com.invoiceinfo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.invoiceinfo.entity.Invoice;
import com.invoiceinfo.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Override
	public List<Invoice> fetchInvoices(PageRequest pageRequest) {
		Page<Invoice> findAll = invoiceRepository.findAll(pageRequest);
		return findAll.toList();
	}

	@Override
	public void saveInvoice(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	@Override
	public Invoice getInvoice(long id) {
		return invoiceRepository.findById(id).get();
	}

	@Override
	public void updateInvoice(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	@Override
	public void deleteInvoice(long id) {
		invoiceRepository.deleteById(id);
	}

	@Override
	public List<Invoice> fetchInvoices() {
		return invoiceRepository.findAll();
	}

	@Override
	public List<Invoice> findByInvoiceNumber(String invoiceNumber) {
		return invoiceRepository.findByInvoiceNumber(invoiceNumber);
	}

	@Override
	public List<Invoice> findByDueDate(LocalDate dueDate) {
		return invoiceRepository.findByDueDate(dueDate);
	}

}
