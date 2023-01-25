
package com.castle.webapi.mappers;

import com.castle.data.model.*;
import com.castle.webapi.contract.DailyWeatherElementDto;
import com.castle.webapi.contract.HourlyWeatherElementDto;
import com.castle.webapi.contract.WeatherDescriptionDto;
import com.castle.webapi.contract.WeatherDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class EntityMapper implements ICatalogMappers {
    private final IMapEntities<Weather, WeatherDto> weatherMapper;
    private final IMapEntities<WeatherDescription, WeatherDescriptionDto> weatherDescriptionMapper;
    private final IMapEntities<DailyWeatherElement, DailyWeatherElementDto> dailyWeatherElementMapper;
    private final IMapEntities<HourlyWeatherElement, HourlyWeatherElementDto> hourlyWeatherElementMapper;

}
