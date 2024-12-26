package com.shoppingcart.mapper;

import com.shoppingcart.dto.ProductDto;
import com.shoppingcart.entity.Cart;
import com.shoppingcart.entity.Item;
import com.shoppingcart.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Product productDtoToProduct(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }

    public ProductDto productToProductDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    public Product cartToProduct(Cart cart) {
        return modelMapper.map(cart, Product.class);
    }

    public Cart itemToCart(Item item) {
        return modelMapper.map(item, Cart.class);
    }
}
