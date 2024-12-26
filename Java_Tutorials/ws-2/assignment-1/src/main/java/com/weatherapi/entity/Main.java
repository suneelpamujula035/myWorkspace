package com.weatherapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Main {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double temp;
	private double feels_like;
	private double temp_min;
	private double temp_max;
	private long pressure;
}
