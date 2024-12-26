package com.shoppingcart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

    String message = "message";
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = ItemNotFoundException.class)
    public String itemNotFoundExceptionHandler(Model model) {
        model.addAttribute(message, "Item Not Found by the given id");
        return "item-not-found";
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = CartProductNotFoundException.class)
    public String cartProductNotFoundExceptionHandler(Model model) {
        model.addAttribute(message, "Cart Product Not Found by the given id");
        return "cart-product-not-found";
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = ProductsNotFoundException.class)
    public String productsNotFoundExceptionHandler(Model model) {
        model.addAttribute(message, "Products not available in the Database");
        return "products-not-found";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public String genericExceptionHandler(Model model) {
        model.addAttribute(message, "Generic Exception Occured");
        return "error-page";
    }
}
