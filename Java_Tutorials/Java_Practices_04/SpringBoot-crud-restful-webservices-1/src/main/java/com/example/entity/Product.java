package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@Data//For creating getters and setters by it self using Lombok
@AllArgsConstructor// For creating All args constructor
@NoArgsConstructor// For creating No args constructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

	@Id
	@GeneratedValue()
	private int id;
	private String name;
	private int quantity;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
