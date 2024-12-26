package com.shoppingcart.repository;

import com.shoppingcart.entity.Order;
import com.shoppingcart.entity.Product;
import com.shoppingcart.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUserTest() {
        List<Product> lsitOfProducts = Arrays.asList(new Product(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB"), new Product(2L, "iPhone XR", 35000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-iphone-xr-white-gallery-2020?wid=2000&hei=2000&fmt=jpeg&qlt=95&.v=1578943280921", 1, "iPhone XR 64 GB"));
        Order order = new Order(1L, 100000L, 10000L, 110000L, new Date(), lsitOfProducts);
        User user = new User(1L, "suneel", "kumar", "suneelpamujula@gmail.com", "9160980881", "Vindur,Gudur,Nellore", "Vindur,Gudur,Nellore", "Gudur", "AndhraPradesh", "India", "524101", "Vindur,Gudur,Nellore", "Vindur,Gudur,Nellore", "Gudur", "AndhraPradesh", "India", "524101", order);
        userRepository.save(user);
        assertThat(userRepository.findAll()).hasSize(1);

    }
}
