package com.castle.webapi.services;

import com.castle.data.repositories.IDataRepository;
import com.castle.webapi.contract.*;
import com.castle.webapi.mappers.ICatalogMappers;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService implements IWeatherService{

    private final IDataRepository dataRepository;
    private final ICatalogMappers mappersCatalog;

    public WeatherService(IDataRepository dataRepository,
                          ICatalogMappers mappersCatalog) {
        this.dataRepository = dataRepository;
        this.mappersCatalog = mappersCatalog;
    }

    @Override
    public ResponseEntity<List<WeatherDto>> getAllCurrentWeatherDto() {
        var weatherList = dataRepository.getWeatherRepository().findAll();
        List<WeatherDto> weatherDtoList = new ArrayList<>();

        weatherList.forEach((weather) -> {
            var weatherDto = mappersCatalog
                    .getWeatherMapper()
                    .map(weather);
            var weatherDescriptionDto = mappersCatalog
                    .getWeatherDescriptionMapper()
                    .map(weather.getWeatherDescription());

            weatherDto.setWeatherDescriptionDto(weatherDescriptionDto);
            weatherDtoList.add(weatherDto);
        });

        return ResponseEntity.ok(weatherDtoList);
    }

    @Override
    public ResponseEntity<WeatherDto> getCurrentWeatherDtoById(Long id) {
        var weather =  dataRepository.getWeatherRepository().findById(id).get();
        var weatherDto = mappersCatalog
                .getWeatherMapper()
                .map(weather);
        var weatherDescriptionDto = mappersCatalog
                .getWeatherDescriptionMapper()
                .map(weather.getWeatherDescription());

        weatherDto.setWeatherDescriptionDto(weatherDescriptionDto);

        return ResponseEntity.ok(weatherDto);
    }

    @Override
    public ResponseEntity<WeatherDto> getLatestCurrentWeatherDto() {
        var weather =  dataRepository.getWeatherRepository().findFirstByOrderByUnixTimeDesc();
        var weatherDto = mappersCatalog.getWeatherMapper().map(weather);
        var weatherDescriptionDto = mappersCatalog.getWeatherDescriptionMapper().map(weather.getWeatherDescription());

        weatherDto.setWeatherDescriptionDto(weatherDescriptionDto);

        return ResponseEntity.ok(weatherDto);
    }

    @Override
    public ResponseEntity<DailyWeatherDto> getLatestDailyWeatherDto() {
        var dailyWeather = dataRepository.getDailyWeatherRepository().findFirstByOrderByUnixTimeOfForecastDesc();
        var dailyWeatherDto = new DailyWeatherDto();
        dailyWeatherDto.setId(dailyWeather.getId());
        dailyWeatherDto.setUnixTimeOfForecast(dailyWeather.getUnixTimeOfForecast());

        dailyWeather
                .getDailyWeatherElements()
                .forEach((dailyWeatherElement) -> {
                    var weatherDescriptionDto = mappersCatalog
                            .getWeatherDescriptionMapper()
                            .map(dailyWeatherElement.getWeatherDescription());

                    dailyWeatherDto
                            .getDailyWeatherElementDtos()
                            .add(mappersCatalog
                                    .getDailyWeatherElementMapper()
                                    .map(dailyWeatherElement)
                                    .setWeatherDescriptionDto(weatherDescriptionDto));

                });
        return ResponseEntity.ok(dailyWeatherDto);
    }

    @Override
    public ResponseEntity<HourlyWeatherDto> getLatestHourlyWeatherDto() {
        var hourlyWeather = dataRepository.getHourlyWeatherRepository().findFirstByOrderByUnixTimeOfForecastDesc();
        var hourlyWeatherDto = new HourlyWeatherDto();
        hourlyWeatherDto.setId(hourlyWeather.getId());
        hourlyWeatherDto.setUnixTimeOfForecast(hourlyWeather.getUnixTimeOfForecast());

        hourlyWeather
                .getHourlyWeatherElements()
                .forEach((hourlyWeatherElement) -> {
                    var weatherDescriptionDto = mappersCatalog
                            .getWeatherDescriptionMapper()
                            .map(hourlyWeatherElement.getWeatherDescription());

                    hourlyWeatherDto
                            .getHourlyWeatherElementDtos()
                            .add(mappersCatalog
                                    .getHourlyWeatherElementMapper()
                                    .map(hourlyWeatherElement)
                                    .setWeatherDescriptionDto(weatherDescriptionDto));
                });
        return ResponseEntity.ok(hourlyWeatherDto);
    }
}
