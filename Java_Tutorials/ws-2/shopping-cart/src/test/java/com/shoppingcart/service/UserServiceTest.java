package com.shoppingcart.service;

import com.shoppingcart.entity.Order;
import com.shoppingcart.entity.Product;
import com.shoppingcart.entity.User;
import com.shoppingcart.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @MockBean
    private UserRepository userRepository;

    @Test
    public void saveUserTest() {
        List<Product> lsitOfProducts = Arrays.asList(new Product(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB"), new Product(2L, "iPhone XR", 35000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-iphone-xr-white-gallery-2020?wid=2000&hei=2000&fmt=jpeg&qlt=95&.v=1578943280921", 1, "iPhone XR 64 GB"));
        Order order = new Order(1L, 100000L, 10000L, 110000L, new Date(), lsitOfProducts);
        User user = new User(1L, "suneel", "kumar", "suneelpamujula@gmail.com", "9160980881", "Vindur,Gudur,Nellore", "Vindur,Gudur,Nellore", "Gudur", "AndhraPradesh", "India", "524101", "Vindur,Gudur,Nellore", "Vindur,Gudur,Nellore", "Gudur", "AndhraPradesh", "India", "524101", order);
        when(userRepository.save(user)).thenReturn(user);
        assertEquals(user, userService.saveUser(user));
    }
}
