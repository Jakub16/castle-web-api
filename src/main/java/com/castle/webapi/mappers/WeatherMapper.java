package com.castle.webapi.mappers;

import com.castle.data.model.Weather;
import com.castle.webapi.contract.WeatherDto;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class WeatherMapper implements IMapEntities<Weather, WeatherDto> {
    @Override
    public WeatherDto map(Weather weather) {
        return map(weather, new WeatherDto());
    }

    @Override
    public WeatherDto map(Weather weather, WeatherDto weatherDto) {
        weatherDto.setId(weather.getId());
        weatherDto.setLatitude(weather.getLatitude());
        weatherDto.setLongitude(weather.getLongitude());
        weatherDto.setTime(new Date(weather.getUnixTime() * 1000));
        weatherDto.setSunrise(weather.getSunrise());
        weatherDto.setSunset(weather.getSunset());
        weatherDto.setTemperature(weather.getTemperature());
        weatherDto.setPerceivedTemperature(weather.getPerceivedTemperature());
        weatherDto.setPressure(weather.getPressure());
        weatherDto.setHumidity(weather.getHumidity());
        weatherDto.setCloudiness(weather.getCloudiness());
        weatherDto.setWindSpeed(weather.getWindSpeed());

        return weatherDto;
    }
}
