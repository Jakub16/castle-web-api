package com.castle.webapi.services;

import com.castle.data.model.WeatherSensor;
import com.castle.data.repositories.IDataRepository;
import com.castle.webapi.contract.WeatherSensorDto;
import com.castle.webapi.mappers.ICatalogMappers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmartHomeService implements ISmartHomeService{

    private final IDataRepository dataRepository;
    private final ICatalogMappers mappersCatalog;
    @Override
    public ResponseEntity<WeatherSensorDto> saveWeatherSensor(WeatherSensorDto weatherSensorDto) {
        WeatherSensor weatherSensor = new WeatherSensor();
        dataRepository.
                getWeatherSensorRepository()
                .save(mappersCatalog.
                        getWeatherSensorDtoMapper()
                        .mapToEntity(weatherSensorDto, weatherSensor));

        return ResponseEntity.ok(weatherSensorDto);
    }

    @Override
    public ResponseEntity<WeatherSensorDto> getLatestWeatherSensor() {
        return ResponseEntity.ok(mappersCatalog.getWeatherSensorMapper().map(dataRepository.getWeatherSensorRepository().findFirstByOrderByUnixTimeDesc()));
    }
}
