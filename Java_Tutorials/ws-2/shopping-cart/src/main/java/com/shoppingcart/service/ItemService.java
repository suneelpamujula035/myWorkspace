package com.shoppingcart.service;

import com.shoppingcart.entity.Item;

import java.util.List;

public interface ItemService {

    List<Item> saveListOfItems(List<Item> items);

    List<Item> listOfItems();

    Item itemById(long id);
}
