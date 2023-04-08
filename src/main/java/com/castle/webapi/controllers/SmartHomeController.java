package com.castle.webapi.controllers;

import com.castle.webapi.contract.WeatherSensorDto;
import com.castle.webapi.services.ISmartHomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/smarthome")
@RequiredArgsConstructor
public class SmartHomeController {

    private final ISmartHomeService smartHomeService;

    @PostMapping("/weathersensor/save")
    public ResponseEntity<WeatherSensorDto> saveWeatherSensor(WeatherSensorDto weatherSensorDto) {
        return smartHomeService.saveWeatherSensor(weatherSensorDto);
    }
    @GetMapping("weathersensor/get/latest")
    public ResponseEntity<WeatherSensorDto> getLatestWeatherSensor() {
        return smartHomeService.getLatestWeatherSensor();
    }
}
