package com.castle.webapi.controllers;

import com.castle.webapi.contract.WeatherDto;
import com.castle.webapi.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("")
    public WeatherDto getWeather() {
        return weatherService.getCurrentWeatherDto();
    }
}
