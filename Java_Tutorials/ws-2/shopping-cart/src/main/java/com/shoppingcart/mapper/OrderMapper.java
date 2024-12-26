package com.shoppingcart.mapper;

import com.shoppingcart.dto.OrderDto;
import com.shoppingcart.entity.Order;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Order orderDtoToOrder(OrderDto orderDto) {
        return modelMapper.map(orderDto, Order.class);
    }

    public OrderDto orderToOrderDto(Order order) {
        return modelMapper.map(order, OrderDto.class);
    }
}
