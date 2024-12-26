package com.shoppingcart.repository;

import com.shoppingcart.entity.Cart;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CartRepositoryTest {

    @Autowired
    private CartRepository cartRepository;

    @Test
    @Order(1)
    public void saveCartItemTest() {
        Cart cart = new Cart(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB");
        cartRepository.save(cart);
        assertThat(cartRepository.findAll()).hasSize(1);
    }

    @Test
    @Order(2)
    public void findCartItemTest() {
        Cart cart = cartRepository.findById(1L).get();
        assertEquals("iPhone 12", cart.getName());
    }

    @Test
    @Order(3)
    public void findAllCartItemsTest() {
        List<Cart> all = cartRepository.findAll();
        assertThat(all).hasSize(1);
    }

    @Test
    @Order(4)
    public void deleteCartItemTest() {
        Cart cart = cartRepository.findById(1L).get();
        Long id = cart.getId();
        cartRepository.delete(cart);
        assertThat(cartRepository.existsById(id)).isFalse();

    }

    @Test
    @Order(5)
    public void deleteAllCartItems() {
        List<Cart> all = cartRepository.findAll();
        cartRepository.deleteAll(all);
        assertThat(cartRepository.findAll()).size().isLessThan(1);
    }
}
