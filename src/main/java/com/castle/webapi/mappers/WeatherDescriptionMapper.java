package com.castle.webapi.mappers;

import com.castle.data.model.WeatherDescription;
import com.castle.webapi.contract.WeatherDescriptionDto;
import org.springframework.stereotype.Component;

@Component
public class WeatherDescriptionMapper implements IMapEntities<WeatherDescription, WeatherDescriptionDto> {
    @Override
    public WeatherDescriptionDto map(WeatherDescription weatherDescription) {
        return map(weatherDescription, new WeatherDescriptionDto());
    }

    @Override
    public WeatherDescriptionDto map(WeatherDescription weatherDescription, WeatherDescriptionDto weatherDescriptionDto) {
        weatherDescriptionDto.setId(weatherDescription.getId());
        weatherDescriptionDto.setMainDescription(weatherDescription.getMainDescription());
        weatherDescriptionDto.setDescription(weatherDescription.getDescription());
        weatherDescriptionDto.setIcon(weatherDescription.getIcon());

        return weatherDescriptionDto;
    }
}
