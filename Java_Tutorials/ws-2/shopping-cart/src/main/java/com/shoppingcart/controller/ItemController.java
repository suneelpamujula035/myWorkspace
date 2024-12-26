package com.shoppingcart.controller;

import com.shoppingcart.dto.ItemDto;
import com.shoppingcart.entity.*;
import com.shoppingcart.mapper.ItemMapper;
import com.shoppingcart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemMapper itemMapper;

    @GetMapping("/")
    public String getAllProducts(Model model) {
        List<ItemDto> listOfItemDtos = new ArrayList<>();
        List<Item> items = itemService.listOfItems();
        for (Item i : items) {
            ItemDto itemDto = itemMapper.itemToItemDto(i);
            listOfItemDtos.add(itemDto);
        }

        model.addAttribute("items", listOfItemDtos);
        return "index";
    }

    @PostMapping("/saveItems")
    @ResponseBody
    public ResponseEntity<List<Item>> saveItems(@RequestBody List<ItemDto> itemDtos) {
        List<Item> itemsList = new ArrayList<>();
        for (ItemDto i : itemDtos) {
            Item item = itemMapper.itemDtoToItem(i);
            itemsList.add(item);
        }
        return new ResponseEntity<>(itemService.saveListOfItems(itemsList), HttpStatus.CREATED);
    }
}
