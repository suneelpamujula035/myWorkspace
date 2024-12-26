package com.shoppingcart.controller;

import com.shoppingcart.dto.OrderDto;
import com.shoppingcart.entity.Cart;
import com.shoppingcart.entity.Item;
import com.shoppingcart.mapper.ProductMapper;
import com.shoppingcart.service.CartService;
import com.shoppingcart.service.ItemService;
import com.shoppingcart.util.CartUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Controller
public class CartController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private CartUtil cartUtil;

    String itemsList = "itemsList";
    String orderDto = "orderDto";

    @GetMapping("/getProduct/{id}")
    public String getProduct(@PathVariable long id, Model model) {
        Item item = itemService.itemById(id);
        String itemName = item.getName();
        Cart cart = productMapper.itemToCart(item);
        List<Cart> allCartItems = cartService.findAllCartItems();
        if (allCartItems.isEmpty()) {
            cartService.saveCartItem(cart);
        } else {
            Set<String> productNames = new HashSet<>();
            for (Cart c : allCartItems) {
                productNames.add(c.getName());
            }
            if (productNames.contains(itemName)) {
                log.info("Product already in the cart please increase the quantity");
            } else {
                cartService.saveCartItem(cart);
            }
            productNames.clear();
        }
        model.addAttribute(itemsList, cartUtil.cartToCartDto(cartService.findAllCartItems()));
        model.addAttribute(orderDto, new OrderDto());

        return "cart";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable long id, Model model) {
        Cart cartItem = cartService.findCartItem(id);
        cartService.deleteCartItem(cartItem);
        model.addAttribute(itemsList, cartUtil.cartToCartDto(cartService.findAllCartItems()));
        model.addAttribute(orderDto, new OrderDto());
        return "cart";
    }

    @GetMapping("/backToCart")
    public String backToCart(Model model) {
        model.addAttribute(itemsList, cartUtil.cartToCartDto(cartService.findAllCartItems()));
        model.addAttribute(orderDto, new OrderDto());
        return "cart";
    }
}
