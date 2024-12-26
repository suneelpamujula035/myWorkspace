package com.shoppingcart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min = 2, max = 256, message = "FirstName size should be between 2 to 256")
    private String firstName;
    @NotEmpty
    @Size(min = 2, max = 256, message = "LastName size should be between 2 to 256")
    private String lastName;
    @NotEmpty
    @NotBlank(message = "Email should not be blank")
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "Please provide valid Email")
    private String email;
    @NotEmpty(message = "Phone number should not be empty")
    @NotBlank(message = "Phone number should not be blank")
    @Pattern(regexp = "^(?:(?:\\+|0{0,2})91(\\s*|[\\-])?|[0]?)?([6789]\\d{2}([ -]?)\\d{3}([ -]?)\\d{4})$", message = "It should be Indian mobile number")
    private String phone;

    @NotEmpty
    private String billingAddressLine1;
    @NotEmpty
    private String billingAddressLine2;
    @NotEmpty
    private String billingCity;
    @NotEmpty
    private String billingState;
    @NotEmpty
    private String billingCountry;
    @NotEmpty
    @Min(value = 100000, message = "ZipCode size should be 6 digits")
    @Max(value = 999999, message = "ZipCode size should be 6 digits")
    private String billingZipCode;

    @NotEmpty
    private String shippingAddressLine1;
    @NotEmpty
    private String shippingAddressLine2;
    @NotEmpty
    private String shippingCity;
    @NotEmpty
    private String shippingState;
    @NotEmpty
    private String shippingCountry;
    @NotEmpty
    @Min(value = 100000, message = "ZipCode size should be 6 digits")
    @Max(value = 999999, message = "ZipCode size should be 6 digits")
    private String shippingZipCode;
}
