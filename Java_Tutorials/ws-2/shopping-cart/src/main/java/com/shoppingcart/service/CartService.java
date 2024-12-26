package com.shoppingcart.service;

import com.shoppingcart.entity.Cart;

import java.util.List;

public interface CartService {

    Cart saveCartItem(Cart cart);

    Cart findCartItem(long id);

    void deleteCartItem(Cart cart);

    List<Cart> findAllCartItems();

    void deleteAllCartItems();
}
