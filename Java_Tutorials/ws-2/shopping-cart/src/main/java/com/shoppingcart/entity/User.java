package com.shoppingcart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 256)
    private String firstName;
    @Size(max = 256)
    private String lastName;
    @Size(max = 256)
    private String email;
    @Size(max = 256)
    private String phone;

    @Size(max = 256)
    private String billingAddressLine1;
    @Size(max = 256)
    private String billingAddressLine2;
    @Size(max = 256)
    private String billingCity;
    @Size(max = 256)
    private String billingState;
    @Size(max = 256)
    private String billingCountry;
    @Size(max = 256)
    private String billingZipCode;

    @Size(max = 256)
    private String shippingAddressLine1;
    @Size(max = 256)
    private String shippingAddressLine2;
    @Size(max = 256)
    private String shippingCity;
    @Size(max = 256)
    private String shippingState;
    @Size(max = 256)
    private String shippingCountry;
    @Size(max = 256)
    private String shippingZipCode;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Order.class)
    @JoinColumn(name = "user_order_fid", referencedColumnName = "id")
    private Order order;

}
