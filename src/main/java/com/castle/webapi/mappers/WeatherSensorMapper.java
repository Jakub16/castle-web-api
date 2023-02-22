package com.castle.webapi.mappers;

import com.castle.data.model.WeatherSensor;
import com.castle.webapi.contract.WeatherSensorDto;

import java.util.Date;

public class WeatherSensorMapper implements IMapEntities<WeatherSensor, WeatherSensorDto> {
    @Override
    public WeatherSensorDto map(WeatherSensor weatherSensor) {
        return map(weatherSensor, new WeatherSensorDto());
    }

    @Override
    public WeatherSensorDto map(WeatherSensor weatherSensor, WeatherSensorDto weatherSensorDto) {
        weatherSensorDto.setId(weatherSensor.getId());
        weatherSensorDto.setTime(new Date(weatherSensor.getUnixTime() * 1000));
        weatherSensorDto.setSensorName(weatherSensor.getSensorName());
        weatherSensorDto.setSensorType(weatherSensor.getSensorType());
        weatherSensorDto.setSensorLocation(weatherSensor.getSensorLocation());
        weatherSensorDto.setTemperature(weatherSensor.getTemperature());
        weatherSensorDto.setHumidity(weatherSensor.getHumidity());

        return weatherSensorDto;
    }
}
