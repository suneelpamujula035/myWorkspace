package com.seleniumexpress.expressdhaba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.expressdhaba.dao.MenuDAO;
import com.seleniumexpress.expressdhaba.entity.Menu;

@Controller
public class MenuController {

	@Autowired
    private MenuDAO menuDAO;
    
	@RequestMapping("/menuList")
	public String showMenu(Model model)
	{
		List<Menu> menuList = menuDAO.getMenu();
		System.out.println(menuList);
		model.addAttribute("menuItems", menuList);
		return "menu";
	}
}
