package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@Autowired
	private CustomerRepo repo;
	
	@GetMapping("/")
	public String details()
	{
		return "edureka.jsp";
	}
	
	@GetMapping("/details")
	public String details(Customers customers)
	{
		repo.save(customers);
		return "edureka.jsp";
	}
	
	@GetMapping("/getdetails")
	public String getdetails()
	{
		return "viewCustomers.jsp";
	}
	
	@PostMapping("/getdetails")
	public ModelAndView getdetails(@RequestParam int cid)
	{
		ModelAndView mv = new ModelAndView("Retrieve");
		Customers customers = repo.findById(cid).orElse(null);
		mv.addObject(customers);

		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/customers")
	public List<Customers> getCustomers()
	{
		return repo.findAll();
	}
	
	@ResponseBody
	@RequestMapping("/customers/{cid}")
	public String getCustomers2( @PathVariable("cid") int cid)
	{
		return repo.findById(cid).toString();
	}
	
	@PostMapping("/customers")
	public Customers getCustomers3(@RequestBody Customers customers)
	{
		repo.save(customers);
		return customers;
	}
	
	@DeleteMapping("/customers/{cid}")
	public Customers getCustomers3(@PathVariable("cid") int cid)
	{
		Customers customers = repo.getOne(cid);
		repo.delete(customers);
		return customers;
	}
	
	@PutMapping(path="/customers", consumes = {"application/json"})
	public Customers getCustomers4(@RequestBody Customers customers)
	{
		repo.save(customers);
		return customers;
	}
}
