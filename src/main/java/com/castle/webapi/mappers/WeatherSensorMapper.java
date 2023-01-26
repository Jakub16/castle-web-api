package com.castle.webapi.mappers;

import com.castle.data.model.WeatherSensor;
import com.castle.webapi.contract.WeatherSensorDto;

public class WeatherSensorMapper implements IMapEntities<WeatherSensor, WeatherSensorDto> {
    @Override
    public WeatherSensorDto map(WeatherSensor weatherSensor) {
        return map(weatherSensor, new WeatherSensorDto());
    }

    @Override
    public WeatherSensorDto map(WeatherSensor weatherSensor, WeatherSensorDto weatherSensorDto) {
        weatherSensorDto.setId(weatherSensor.getId());
        weatherSensorDto.setSensorName(weatherSensor.getSensorName());
        weatherSensorDto.setSensorType(weatherSensor.getSensorType());
        weatherSensorDto.setSensorLocation(weatherSensor.getSensorLocation());
        weatherSensorDto.setTemperature(weatherSensor.getTemperature());
        weatherSensorDto.setHumidity(weatherSensor.getHumidity());

        return weatherSensorDto;
    }
}
