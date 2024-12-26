package com.weatherapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weatherapi.entity.Weather;
import com.weatherapi.exception.CityNotFoundException;
import com.weatherapi.repository.WeatherRepository;

@Service
public class WeatherService {

	private static final String API_KEY = "65a4a02e5f84d8a72177dbef6fc2de51";
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private WeatherRepository weatherRepository;
	
	public Object getWeatherByCity(String city)
	{
		 //return restTemplate.getForEntity("https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+API_KEY, Object.class);
		//return restTemplate.exchange("https://api.openweathermap.org/data/2.5/weather?q={city}&units=metric&appid="+API_KEY, HttpMethod.GET,null,Object.class, city);
		return restTemplate.exchange("https://api.openweathermap.org/data/2.5/forecast?q={city}&units=metric&cnt=16&appid="+API_KEY, HttpMethod.GET,null,Object.class, city);
	}
	
	public Weather saveWeather(Weather weather)
	{
		return weatherRepository.save(weather);
	}
	
	public List<Weather> saveMultiplecitiesWeather(List<Weather> weather)
	{
		return weatherRepository.saveAll(weather);
	}
	
	public List<Weather> getAllCitiesWeather(String field)
	{
		List<Weather> weatherListOfAllCities = weatherRepository.findAll(Sort.by(Direction.ASC, field));
		if(weatherListOfAllCities.size()!=0)
		{
			return weatherListOfAllCities;
		}
		else
		{
			throw new CityNotFoundException("Weather details not found");
		}
	}
	
	public Weather	getWeatherByCityName(String city)
	{
		Weather findByCityName = weatherRepository.findByCityName(city);
		if(findByCityName!=null && city!="" || city!=null)
		{
			return findByCityName;
		}
		else
		{
			throw new CityNotFoundException("Weather details not found with the city name : "+city);
		}
	}
	
	
	
	public double gettingAvgPressure()
	{
		return weatherRepository.getAvgPressure();
	}
	
	public double gettingAvgTemparature()
	{
		return weatherRepository.getAvgTemparature();
	}
	
}
