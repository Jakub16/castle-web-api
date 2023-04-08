package com.castle.webapi.services;

import com.castle.data.model.WeatherSensor;
import com.castle.webapi.contract.WeatherSensorDto;
import org.springframework.http.ResponseEntity;

public interface ISmartHomeService {
    ResponseEntity<WeatherSensorDto> saveWeatherSensor(WeatherSensorDto weatherSensorDto);
    ResponseEntity<WeatherSensorDto> getLatestWeatherSensor();
}
