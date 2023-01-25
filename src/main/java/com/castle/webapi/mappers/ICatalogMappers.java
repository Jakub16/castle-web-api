package com.castle.webapi.mappers;

import com.castle.data.model.DailyWeatherElement;
import com.castle.data.model.HourlyWeatherElement;
import com.castle.data.model.Weather;
import com.castle.data.model.WeatherDescription;
import com.castle.webapi.contract.DailyWeatherElementDto;
import com.castle.webapi.contract.HourlyWeatherElementDto;
import com.castle.webapi.contract.WeatherDescriptionDto;
import com.castle.webapi.contract.WeatherDto;

public interface ICatalogMappers {
    IMapEntities<Weather, WeatherDto> getWeatherMapper();
    IMapEntities<WeatherDescription, WeatherDescriptionDto> getWeatherDescriptionMapper();
    IMapEntities<DailyWeatherElement, DailyWeatherElementDto> getDailyWeatherElementMapper();
    IMapEntities<HourlyWeatherElement, HourlyWeatherElementDto> getHourlyWeatherElementMapper();
}
