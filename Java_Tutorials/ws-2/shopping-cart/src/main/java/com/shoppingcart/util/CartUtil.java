package com.shoppingcart.util;

import com.shoppingcart.dto.CartDto;
import com.shoppingcart.entity.Cart;
import com.shoppingcart.mapper.CartMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartUtil {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CartMapper cartMapper;

    public List<CartDto> cartToCartDto(List<Cart> allCartItems) {
        List<CartDto> listOfCartDtos = new ArrayList<>();
        for (Cart c : allCartItems) {
            CartDto cartDto = cartMapper.cartToCartDto(c);
            listOfCartDtos.add(cartDto);
        }
        return listOfCartDtos;
    }
}
