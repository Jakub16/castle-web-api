package com.castle.webapi.controllers;

import com.castle.webapi.contract.DailyWeatherDto;
import com.castle.webapi.contract.HourlyWeatherDto;
import com.castle.webapi.contract.WeatherDto;
import com.castle.webapi.services.IWeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final IWeatherService weatherService;

    @GetMapping("/current")
    public ResponseEntity<List<WeatherDto>> getAllCurrentWeather() {
        return weatherService.getAllCurrentWeatherDto();
    }

    @GetMapping("/current/{id}")
    public ResponseEntity<WeatherDto> getCurrentWeatherById(@PathVariable("id") Long id) {
        return weatherService.getCurrentWeatherDtoById(id);
    }

    @GetMapping("/current/latest")
    public ResponseEntity<WeatherDto> getLatestCurrentWeather() {
        return weatherService.getLatestCurrentWeatherDto();
    }

    @GetMapping("/daily/latest")
    public ResponseEntity<DailyWeatherDto> getLatestDailyWeather() {
        return weatherService.getLatestDailyWeatherDto();
    }

    @GetMapping("/hourly/latest")
    public ResponseEntity<HourlyWeatherDto> getLatestHourlyWeather() {
        return weatherService.getLatestHourlyWeatherDto();
    }
}
