package com.weatherapi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int cnt;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@OneToMany(cascade =CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "WHEATHER_LISTOFDT_FID", referencedColumnName = "id")
	private List<ListOfDt> list = new ArrayList<>();
	
	@Embedded
	private City city;	
}
