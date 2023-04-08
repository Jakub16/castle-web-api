package com.castle.webapi.mappers;

import com.castle.data.model.WeatherSensor;
import com.castle.webapi.contract.WeatherSensorDto;

import java.util.Date;

public class WeatherSensorDtoMapper implements IMapEntities<WeatherSensor, WeatherSensorDto> {
    @Override
    public WeatherSensorDto map(WeatherSensor weatherSensor) {
        return null;
    }

    @Override
    public WeatherSensorDto map(WeatherSensor weatherSensor, WeatherSensorDto weatherSensorDto) {
        return null;
    }

    @Override
    public WeatherSensor mapToEntity(WeatherSensorDto weatherSensorDto, WeatherSensor weatherSensor) {
        weatherSensor.setId(weatherSensorDto.getId());
        weatherSensor.setUnixTime(weatherSensorDto.getTime().getTime() / 1000);
        weatherSensor.setSensorName(weatherSensorDto.getSensorName());
        weatherSensor.setSensorType(weatherSensorDto.getSensorType());
        weatherSensor.setSensorLocation(weatherSensorDto.getSensorLocation());
        weatherSensor.setTemperature(weatherSensorDto.getTemperature());
        weatherSensor.setHumidity(weatherSensorDto.getHumidity());

        return weatherSensor;
    }
}
