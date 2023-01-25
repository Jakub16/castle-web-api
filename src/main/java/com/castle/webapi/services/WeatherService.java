package com.castle.webapi.services;

import com.castle.data.repositories.IDataRepository;
import com.castle.webapi.contract.WeatherDto;
import com.castle.webapi.mappers.ICatalogMappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final IDataRepository dataRepository;
    private final ICatalogMappers mappersCatalog;

    public WeatherDto getCurrentWeatherDto() {
        var weather =  dataRepository.getWeatherRepository().findFirstByOrderByUnixTimeDesc();
        var weatherDto = mappersCatalog.getWeatherMapper().map(weather);
        var weatherDescriptionDto = mappersCatalog.getWeatherDescriptionMapper().map(weather.getWeatherDescription());

        weatherDto.setWeatherDescriptionDto(weatherDescriptionDto);

        return weatherDto;
    }
}
