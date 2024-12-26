package com.shoppingcart.service;

import com.shoppingcart.entity.Item;
import com.shoppingcart.repository.ItemRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ItemServiceTest {

    @Autowired
    private ItemService itemService;
    @MockBean
    private ItemRepository itemRepository;

    @Test
    @Order(1)
    public void saveListOfItemsTest() {
        List<Item> listOfItems = Stream.of(new Item(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB"), new Item(2L, "iPhone XR", 35000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-iphone-xr-white-gallery-2020?wid=2000&hei=2000&fmt=jpeg&qlt=95&.v=1578943280921", 1, "iPhone XR 64 GB")).collect(Collectors.toList());
        when(itemRepository.saveAll(listOfItems)).thenReturn(listOfItems);
        assertEquals(listOfItems, itemService.saveListOfItems(listOfItems));
    }

    @Test
    @Order(2)
    public void listOfItemsTest() {
        when(itemRepository.findAll()).thenReturn(Stream.of(new Item(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB"), new Item(2L, "iPhone XR", 35000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/refurb-iphone-xr-white-gallery-2020?wid=2000&hei=2000&fmt=jpeg&qlt=95&.v=1578943280921", 1, "iPhone XR 64 GB")).collect(Collectors.toList()));
        assertEquals(2, itemService.listOfItems().size());
    }

    @Test
    @Order(3)
    public void itemByIdTest() {
        Item item = new Item(1L, "iPhone 12", 65000, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-white-select-2020?wid=940&hei=1112&fmt=png-alpha&.v=1604343705000", 1, "iPhone 12 128GB");
        long id = 1L;
        when(itemRepository.findById(id)).thenReturn(Optional.of(item));
        assertEquals(item, itemService.itemById(id));
    }
}
