package com.invoiceinfo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.invoiceinfo.entity.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

	List<Invoice> findByInvoiceNumber(String invoiceNumber);
	
	Invoice findByBillTo(String invoiceNumber);
	
	@Query("select i from Invoice i where i.dueDate=?1")
	List<Invoice> findByDueDate(LocalDate dueDate);
	
	Page<Invoice> findAll(Pageable page);

}
