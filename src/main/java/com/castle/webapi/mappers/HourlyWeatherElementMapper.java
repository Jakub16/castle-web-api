package com.castle.webapi.mappers;

import com.castle.data.model.HourlyWeatherElement;
import com.castle.webapi.contract.HourlyWeatherElementDto;

public class HourlyWeatherElementMapper implements IMapEntities<HourlyWeatherElement, HourlyWeatherElementDto> {
    @Override
    public HourlyWeatherElementDto map(HourlyWeatherElement hourlyWeatherElement) {
        return map(hourlyWeatherElement, new HourlyWeatherElementDto());
    }

    @Override
    public HourlyWeatherElementDto map(HourlyWeatherElement hourlyWeatherElement, HourlyWeatherElementDto hourlyWeatherElementDto) {


        return hourlyWeatherElementDto;
    }
}
