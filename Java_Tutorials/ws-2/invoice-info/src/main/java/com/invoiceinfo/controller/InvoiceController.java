package com.invoiceinfo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.invoiceinfo.entity.Invoice;
import com.invoiceinfo.entity.InvoiceDto;
import com.invoiceinfo.entity.MyModel;
import com.invoiceinfo.entity.Product;
import com.invoiceinfo.entity.ProductDto;
import com.invoiceinfo.repository.InvoiceRepository;
import com.invoiceinfo.service.InvoiceService;

@Controller
public class InvoiceController {

	@Autowired
	private InvoiceRepository invoiceRepository;
	@Autowired
	private InvoiceService invoiceService;

	private static final int PAGE_SIZE = 3;
	private long totalInvoicesCount;

	private PageRequest gotoPage(int page) {
		PageRequest request = PageRequest.of(page, PAGE_SIZE);
		return request;
	}

	@GetMapping("/")
	public String showInvoiceList(Model model,
			@RequestParam(value = "pageNo", required = false, defaultValue = "0") String pageNo) {

		int lastPageNo;
		int gotoPageNo = Integer.parseInt(pageNo);
		List<Invoice> invoiceList = new ArrayList<Invoice>();
		int count = invoiceList.size();
		for (Invoice i : invoiceService.fetchInvoices(gotoPage(gotoPageNo))) {
			invoiceList.add(i);
		}

		totalInvoicesCount = invoiceRepository.count();
		if (totalInvoicesCount % PAGE_SIZE != 0) {
			lastPageNo = (int) (totalInvoicesCount / PAGE_SIZE) + 1;
		} else {
			lastPageNo = (int) (totalInvoicesCount / PAGE_SIZE);
		}
		model.addAttribute("lastPageNo", lastPageNo);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("totalInvoicesCount", totalInvoicesCount);
		model.addAttribute("lastPageNo", lastPageNo);
		model.addAttribute("invoices", invoiceList);
		return "invoice-list";
	}

	@GetMapping("/showAddInvoicePage")
	public String addInvoice(Model model) {
		MyModel myModel = new MyModel();
		model.addAttribute("myModel", myModel);
		return "add-invoice";
	}

	@PostMapping("/saveInvoice")
	public String saveInvoice(@Valid @ModelAttribute("myModel") MyModel myModel) {

		InvoiceDto invoiceDto = myModel.getInvoiceDto();
		List<ProductDto> productDto = myModel.getProductDto();

		List<Product> products = new ArrayList<>();

		Invoice invoice = new Invoice();
		invoice.setBillTo(invoiceDto.getBillTo());
		invoice.setInvoiceNumber(invoiceDto.getInvoiceNumber());
		invoice.setDate(invoiceDto.getDate());
		invoice.setDueDate(invoiceDto.getDueDate());
		invoice.setStatus(invoiceDto.getStatus());
		invoice.setAmount(invoiceDto.getAmount());

		for (ProductDto p : productDto) {
			Product product = new Product();
			product.setProductName(p.getProductName());
			product.setDescription(p.getDescription());
			product.setPrice(p.getPrice());
			product.setQuantity(p.getQuantity());
			product.setTax(p.getTax());
			product.setTotal(p.getTotal());
			products.add(product);
		}

		invoice.setProduct(products);
		invoiceService.saveInvoice(invoice);
		return "redirect:/";
	}

	public List<Product> listOfProducts;
	
	@GetMapping("/updateInvoice")
	public String updateInvoice(@RequestParam("invoiceId") long id, Model model) {
		Invoice invoice = invoiceService.getInvoice(id);
		listOfProducts = invoice.getProduct();
		model.addAttribute("invoice", invoice);
		return "update-invoice";
	}

	@PostMapping("/updatingInvoice")
	public String updatingInvoice(@ModelAttribute("invoice") Invoice invoice) {
		invoice.setProduct(listOfProducts);
		invoiceService.updateInvoice(invoice);
		return "redirect:/";
	}

	@GetMapping("/deleteInvoice")
	public String deleteInvoice(@RequestParam("invoiceId") long id) {
		invoiceService.deleteInvoice(id);
		return "redirect:/";
	}

	@GetMapping("/searchInvoice")
	public String searchInvoice(Model model, HttpServletRequest request) {
		String normalDate = request.getParameter("search");
		if (normalDate == "" || normalDate == null) {
			return "redirect:/";
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dueDate = LocalDate.parse(normalDate, formatter);
		List<Invoice> invoices = invoiceService.findByDueDate(dueDate);
		model.addAttribute("invoices", invoices);
		model.addAttribute("normalDate", normalDate);
		return "success-results";
	}

}
