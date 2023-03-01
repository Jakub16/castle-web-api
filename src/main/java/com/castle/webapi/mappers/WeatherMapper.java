package com.castle.webapi.mappers;

import com.castle.data.model.Weather;
import com.castle.webapi.contract.WeatherDto;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class WeatherMapper implements IMapEntities<Weather, WeatherDto> {
    @Override
    public WeatherDto map(Weather weather) {
        return map(weather, new WeatherDto());
    }

    @Override
    public WeatherDto map(Weather weather, WeatherDto weatherDto) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Date sunriseTime = new Date(weather.getSunrise() * 1000);
        Date sunsetTime = new Date(weather.getSunset() * 1000);

        weatherDto.setId(weather.getId());
        weatherDto.setLatitude(weather.getLatitude());
        weatherDto.setLongitude(weather.getLongitude());
        weatherDto.setTime(new Date(weather.getUnixTime() * 1000));
        weatherDto.setSunrise(simpleDateFormat.format(sunriseTime));
        weatherDto.setSunset(simpleDateFormat.format(sunsetTime));
        weatherDto.setTemperature(weather.getTemperature());
        weatherDto.setPerceivedTemperature(weather.getPerceivedTemperature());
        weatherDto.setPressure(weather.getPressure());
        weatherDto.setHumidity(weather.getHumidity());
        weatherDto.setCloudiness(weather.getCloudiness());
        weatherDto.setWindSpeed(weather.getWindSpeed());

        return weatherDto;
    }
}
