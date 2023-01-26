package com.castle.webapi.mappers;

import com.castle.data.model.DailyWeatherElement;
import com.castle.webapi.contract.DailyWeatherElementDto;
import org.springframework.stereotype.Component;

@Component
public class DailyWeatherElementMapper implements IMapEntities<DailyWeatherElement, DailyWeatherElementDto> {
    @Override
    public DailyWeatherElementDto map(DailyWeatherElement dailyWeatherElement) {
        return map(dailyWeatherElement, new DailyWeatherElementDto());
    }

    @Override
    public DailyWeatherElementDto map(DailyWeatherElement dailyWeatherElement, DailyWeatherElementDto dailyWeatherElementDto) {
        dailyWeatherElementDto.setId(dailyWeatherElement.getId());
        dailyWeatherElementDto.setUnixTime(dailyWeatherElement.getUnixTime());
        dailyWeatherElementDto.setSunrise(dailyWeatherElement.getSunrise());
        dailyWeatherElementDto.setSunset(dailyWeatherElement.getSunset());
        dailyWeatherElementDto.setDayTemperature(dailyWeatherElement.getDayTemperature());
        dailyWeatherElementDto.setMinTemperature(dailyWeatherElement.getMinTemperature());
        dailyWeatherElementDto.setMaxTemperature(dailyWeatherElement.getMaxTemperature());
        dailyWeatherElementDto.setNightTemperature(dailyWeatherElement.getNightTemperature());
        dailyWeatherElementDto.setEveningTemperature(dailyWeatherElement.getEveningTemperature());
        dailyWeatherElementDto.setMorningTemperature(dailyWeatherElement.getMorningTemperature());
        dailyWeatherElementDto.setDayPerceivedTemperature(dailyWeatherElement.getDayPerceivedTemperature());
        dailyWeatherElementDto.setNightPerceivedTemperature(dailyWeatherElement.getNightPerceivedTemperature());
        dailyWeatherElementDto.setEveningPerceivedTemperature(dailyWeatherElement.getEveningPerceivedTemperature());
        dailyWeatherElementDto.setMorningPerceivedTemperature(dailyWeatherElement.getMorningPerceivedTemperature());
        dailyWeatherElementDto.setPressure(dailyWeatherElement.getPressure());
        dailyWeatherElementDto.setHumidity(dailyWeatherElement.getHumidity());
        dailyWeatherElementDto.setCloudiness(dailyWeatherElement.getCloudiness());
        dailyWeatherElementDto.setProbabilityOfPrecipitation(dailyWeatherElement.getProbabilityOfPrecipitation());
        //dailyWeatherElementDto.setRainAmount(dailyWeatherElementDto.getRainAmount());
        dailyWeatherElementDto.setUvi(dailyWeatherElement.getUvi());

        return dailyWeatherElementDto;
    }
}
