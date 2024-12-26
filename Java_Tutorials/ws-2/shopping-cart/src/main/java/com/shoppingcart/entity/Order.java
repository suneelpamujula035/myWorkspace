package com.shoppingcart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_tbl")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double subTotal;
    private double totalTax;
    private double grandTotal;
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Product.class)
    @JoinColumn(name = "order_product_fid", referencedColumnName = "id")
    private List<Product> product;

}
