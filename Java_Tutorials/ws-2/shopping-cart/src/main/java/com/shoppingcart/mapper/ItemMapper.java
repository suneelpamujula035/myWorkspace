package com.shoppingcart.mapper;

import com.shoppingcart.dto.ItemDto;
import com.shoppingcart.entity.Item;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Item itemDtoToItem(ItemDto itemDto) {
        return modelMapper.map(itemDto, Item.class);
    }

    public ItemDto itemToItemDto(Item item) {
        return modelMapper.map(item, ItemDto.class);
    }
}
