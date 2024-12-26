package com.shoppingcart.mapper;

import com.shoppingcart.dto.CartDto;
import com.shoppingcart.entity.Cart;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Cart cartDtoToCart(CartDto cartDto) {
        return modelMapper.map(cartDto, Cart.class);
    }

    public CartDto cartToCartDto(Cart cart) {
        return modelMapper.map(cart, CartDto.class);
    }
}
