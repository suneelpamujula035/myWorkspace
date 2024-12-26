package com.shoppingcart.service;

import com.shoppingcart.entity.Item;
import com.shoppingcart.exception.ItemNotFoundException;
import com.shoppingcart.exception.ProductsNotFoundException;
import com.shoppingcart.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> saveListOfItems(List<Item> items) {
        return itemRepository.saveAll(items);
    }

    @Override
    public List<Item> listOfItems() {
        List<Item> itemList = itemRepository.findAll();
        if (itemList.isEmpty()) {
            throw new ProductsNotFoundException();
        }
        return itemList;
    }

    @Override
    public Item itemById(long id) {
        Optional<Item> item = Optional.ofNullable(itemRepository.findById(id).orElseThrow(ItemNotFoundException::new));
        Item item1 = null;
        if (item.isPresent()) {
            item1 = item.get();
        }
        return item1;
    }

}
