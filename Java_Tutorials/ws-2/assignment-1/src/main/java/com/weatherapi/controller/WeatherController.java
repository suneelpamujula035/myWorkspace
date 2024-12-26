package com.weatherapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapi.entity.Weather;
import com.weatherapi.service.WeatherService;

@RestController
@RequestMapping("/weather-client")
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	//fetching weather from openwetherapi
	@GetMapping("{city}")
	public ResponseEntity<Object> getWeatherByCity(@PathVariable String city)
	{
		return new ResponseEntity<Object>(weatherService.getWeatherByCity(city), HttpStatus.ACCEPTED);
	}
	
	//saving city weather to DB
	@PostMapping
	public ResponseEntity<Weather> saveCityWeather(@RequestBody Weather weather)
	{
		return new ResponseEntity<Weather>(weatherService.saveWeather(weather), HttpStatus.CREATED);
	}
	
	@PostMapping("/addMultipleCities")
	public ResponseEntity<List<Weather>> saveMultipleCitiesWeather(@RequestBody List<Weather> weather)
	{
		return new ResponseEntity<List<Weather>>(weatherService.saveMultiplecitiesWeather(weather), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllCities")
	public ResponseEntity<List<Weather>> getAllCitiesWeatherInfo(@RequestParam String field)
	{
		return new ResponseEntity<List<Weather>>(weatherService.getAllCitiesWeather(field), HttpStatus.OK);
	}
	
	@GetMapping("/getCityByName/{city}")
	public ResponseEntity<Weather> getWeatherByCityName(@PathVariable String city)
	{
		return new ResponseEntity<Weather>(weatherService.getWeatherByCityName(city), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/average")
	public ResponseEntity<String> getAvgWeatherForCity()
	{
		  
	      double avgTemperature = weatherService.gettingAvgTemparature();
	      double avgPressure = weatherService.gettingAvgPressure();
	      String avg = "Average Temparature : "+avgTemperature+" --------- "+"Average Pressure : "+avgPressure;
	      return new ResponseEntity<String>(avg, HttpStatus.OK);
	}
	
}
