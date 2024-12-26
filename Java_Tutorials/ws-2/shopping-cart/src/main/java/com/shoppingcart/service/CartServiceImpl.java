package com.shoppingcart.service;

import com.shoppingcart.entity.Cart;
import com.shoppingcart.exception.CartProductNotFoundException;
import com.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart saveCartItem(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart findCartItem(long id) {

        Optional<Cart> byId = Optional.ofNullable(cartRepository.findById(id).orElseThrow(CartProductNotFoundException::new));
        Cart cart = null;
        if (byId.isPresent()) {
            cart = byId.get();
        }
        return cart;
    }

    @Override
    public void deleteCartItem(Cart cart) {
        cartRepository.delete(cart);
    }

    @Override
    public List<Cart> findAllCartItems() {
        return cartRepository.findAll();
    }

    @Override
    public void deleteAllCartItems() {
        cartRepository.deleteAll();
    }
}
