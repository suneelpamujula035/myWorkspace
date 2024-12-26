package com.weatherapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.weatherapi.entity.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

	Weather findByCityName(String city);
	
//	@Query("select w from Weather w where w.city.name=?1")
//	Weather gettingWeatherByCity(String city);

	
	//@Query("select AVG(w.list.main.pressure) from Weather w where w.city.name=?1")
	//@Query("select AVG(w.list.main.pressure) from Weather w where w.city.name=?1")
	
	@Query(value = "select AVG(pressure) from Main m", nativeQuery=true)
	double getAvgPressure();
	@Query(value = "select AVG(temp) from Main m", nativeQuery=true)
	double getAvgTemparature();

}
