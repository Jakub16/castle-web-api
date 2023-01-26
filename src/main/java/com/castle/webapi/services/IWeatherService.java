package com.castle.webapi.services;

import com.castle.webapi.contract.DailyWeatherDto;
import com.castle.webapi.contract.HourlyWeatherDto;
import com.castle.webapi.contract.WeatherDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IWeatherService {
    ResponseEntity<List<WeatherDto>> getAllCurrentWeatherDto();
    ResponseEntity<WeatherDto> getCurrentWeatherDtoById(Long id);
    ResponseEntity<WeatherDto> getLatestCurrentWeatherDto();
    ResponseEntity<DailyWeatherDto> getLatestDailyWeatherDto();
    ResponseEntity<HourlyWeatherDto> getLatestHourlyWeatherDto();

}
