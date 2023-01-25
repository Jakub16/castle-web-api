package com.castle.webapi.mappers;

import com.castle.data.model.DailyWeatherElement;
import com.castle.webapi.contract.DailyWeatherElementDto;

public class DailyWeatherElementMapper implements IMapEntities<DailyWeatherElement, DailyWeatherElementDto> {
    @Override
    public DailyWeatherElementDto map(DailyWeatherElement dailyWeatherElement) {
        return map(dailyWeatherElement, new DailyWeatherElementDto());
    }

    @Override
    public DailyWeatherElementDto map(DailyWeatherElement dailyWeatherElement, DailyWeatherElementDto dailyWeatherElementDto) {


        return dailyWeatherElementDto;
    }
}
