package com.castle.webapi.mappers;

import com.castle.data.model.*;
import com.castle.webapi.contract.*;

public interface ICatalogMappers {
    IMapEntities<Weather, WeatherDto> getWeatherMapper();
    IMapEntities<WeatherDescription, WeatherDescriptionDto> getWeatherDescriptionMapper();
    IMapEntities<DailyWeatherElement, DailyWeatherElementDto> getDailyWeatherElementMapper();
    IMapEntities<HourlyWeatherElement, HourlyWeatherElementDto> getHourlyWeatherElementMapper();
    IMapEntities<WeatherSensor, WeatherSensorDto> getWeatherSensorMapper();
    IMapEntities<WeatherSensor, WeatherSensorDto> getWeatherSensorDtoMapper();
}
