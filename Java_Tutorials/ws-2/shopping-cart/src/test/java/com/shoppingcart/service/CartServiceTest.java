package com.shoppingcart.service;

import com.shoppingcart.entity.Cart;
import com.shoppingcart.repository.CartRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CartServiceTest {

    @Autowired
    private CartService cartService;
    @MockBean
    private CartRepository cartRepository;

    @Test
    @Order(1)
    public void saveCartItemTest() {
        Cart cart = new Cart(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB");
        when(cartRepository.save(cart)).thenReturn(cart);
        assertEquals(cart, cartService.saveCartItem(cart));
    }

    @Test
    @Order(2)
    public void findAllCartItemsTest() {
        when(cartRepository.findAll()).thenReturn(Stream.of(new Cart(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB"), new Cart(2L, "iPhone XR", 35000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-iphone-xr-white-gallery-2020?wid=2000&hei=2000&fmt=jpeg&qlt=95&.v=1578943280921", 1, "iPhone XR 64 GB")).collect(Collectors.toList()));
        assertEquals(2, cartService.findAllCartItems().size());
        verify(cartRepository, times(1)).findAll();
    }

    @Test
    @Order(3)
    public void findCartItemByIdTest() {
        Cart cart = new Cart(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB");
        long id = 1L;
        when(cartRepository.findById(id)).thenReturn(Optional.of(cart));
        assertEquals(cart, cartService.findCartItem(id));
    }


    @Test
    @Order(4)
    public void deleteCartItemTest() {
        Cart cart = new Cart(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB");
        cartService.deleteCartItem(cart);
        verify(cartRepository, times(1)).delete(cart);
    }

    @Test
    @Order(5)
    public void deleteAllCartItemsTest() {
        cartService.deleteAllCartItems();
        verify(cartRepository, times(1)).deleteAll();
    }

}
