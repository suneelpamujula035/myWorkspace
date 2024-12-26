package com.shoppingcart.controller;

import com.shoppingcart.dto.OrderDto;
import com.shoppingcart.dto.UserDto;
import com.shoppingcart.entity.*;
import com.shoppingcart.mapper.OrderMapper;
import com.shoppingcart.mapper.UserMapper;
import com.shoppingcart.service.CartService;
import com.shoppingcart.service.EmailServiceImpl;
import com.shoppingcart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CartService cartService;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private EmailServiceImpl emailService;

    @GetMapping("/showUserForm")
    public String showUserForm(OrderDto orderDto, Model model, HttpSession httpSession) {
        Order order = orderMapper.orderDtoToOrder(orderDto);
        httpSession.setAttribute("order", order);
        model.addAttribute("userDto", new UserDto());
        return "user-form";
    }

    @PostMapping("/saveUser")
    public String saveUser(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult result, HttpSession httpSession) throws MessagingException {
        if (result.hasErrors()) {
            return "user-form";
        }
        User user = userMapper.userDtoToUser(userDto);
        Order myOrder = (Order) httpSession.getAttribute("order");
        Order order = myOrder;
        order.setOrderDate(new Date());
        List<Cart> allCartItems = cartService.findAllCartItems();
        List<Product> listOfProducts = new ArrayList<>();
        for (Cart c : allCartItems) {
            Product product = new Product();
            product.setName(c.getName());
            product.setPrice(c.getPrice());
            product.setProductThumbNailImage(c.getProductThumbNailImage());
            product.setMaxQuantityAllowed(c.getMaxQuantityAllowed());
            product.setDescription(c.getDescription());
            listOfProducts.add(product);
        }
        order.setProduct(listOfProducts);
        user.setOrder(order);
        userService.saveUser(user);
        emailService.sendEmail(user);
        cartService.deleteAllCartItems();
        httpSession.invalidate();
        return "thank-you";
    }
}
