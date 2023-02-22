package com.castle.webapi.mappers;

import com.castle.data.model.HourlyWeatherElement;
import com.castle.webapi.contract.HourlyWeatherElementDto;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HourlyWeatherElementMapper implements IMapEntities<HourlyWeatherElement, HourlyWeatherElementDto> {
    @Override
    public HourlyWeatherElementDto map(HourlyWeatherElement hourlyWeatherElement) {
        return map(hourlyWeatherElement, new HourlyWeatherElementDto());
    }

    @Override
    public HourlyWeatherElementDto map(HourlyWeatherElement hourlyWeatherElement, HourlyWeatherElementDto hourlyWeatherElementDto) {
        hourlyWeatherElementDto.setId(hourlyWeatherElement.getId());
        hourlyWeatherElementDto.setTime(new Date(hourlyWeatherElement.getUnixTime() * 1000));
        hourlyWeatherElementDto.setTemperature(hourlyWeatherElement.getTemperature());
        hourlyWeatherElementDto.setPerceivedTemperature(hourlyWeatherElement.getTemperature());
        hourlyWeatherElementDto.setPressure(hourlyWeatherElement.getPressure());
        hourlyWeatherElementDto.setHumidity(hourlyWeatherElement.getHumidity());
        hourlyWeatherElementDto.setUvi(hourlyWeatherElement.getUvi());
        hourlyWeatherElementDto.setCloudiness(hourlyWeatherElement.getCloudiness());
        hourlyWeatherElementDto.setWindSpeed(hourlyWeatherElement.getWindSpeed());

        return hourlyWeatherElementDto;
    }
}
