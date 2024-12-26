package com.shoppingcart.repository;

import com.shoppingcart.entity.Item;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    @Order(1)
    public void saveListOfItemsTest() {
        List<Item> listOfItems = Stream.of(new Item(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB"), new Item(2L, "iPhone XR", 35000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-iphone-xr-white-gallery-2020?wid=2000&hei=2000&fmt=jpeg&qlt=95&.v=1578943280921", 1, "iPhone XR 64 GB")).collect(Collectors.toList());
        itemRepository.saveAll(listOfItems);
        List<Item> itemList = itemRepository.findAll();
        assertThat(itemList).hasSize(2);
    }

    @Test
    @Order(2)
    public void listOfItemsTest() {
        List<Item> listOfItems = itemRepository.findAll();
        assertThat(listOfItems).size().isGreaterThan(0);
    }

    @Test
    @Order(3)
    public void itemByIdTest() {
        Item item = itemRepository.findById(1L).get();
        assertEquals("iPhone 12", item.getName());
    }

}
