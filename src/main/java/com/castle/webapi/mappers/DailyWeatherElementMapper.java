package com.castle.webapi.mappers;

import com.castle.data.model.DailyWeatherElement;
import com.castle.webapi.contract.DailyWeatherElementDto;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DailyWeatherElementMapper implements IMapEntities<DailyWeatherElement, DailyWeatherElementDto> {

    @Override
    public DailyWeatherElementDto map(DailyWeatherElement dailyWeatherElement) {
        return map(dailyWeatherElement, new DailyWeatherElementDto());
    }

    @Override
    public DailyWeatherElementDto map(DailyWeatherElement dailyWeatherElement, DailyWeatherElementDto dailyWeatherElementDto) {
        SimpleDateFormat sunDateFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat generalTimeFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date generalTime = new Date(dailyWeatherElement.getUnixTime() * 1000);
        Date sunriseTime = new Date(dailyWeatherElement.getSunrise() * 1000);
        Date sunsetTime = new Date(dailyWeatherElement.getSunset() * 1000);

        dailyWeatherElementDto.setId(dailyWeatherElement.getId());
        dailyWeatherElementDto.setTime(generalTimeFormat.format(generalTime));
        dailyWeatherElementDto.setSunrise(sunDateFormat.format(sunriseTime));
        dailyWeatherElementDto.setSunset(sunDateFormat.format(sunsetTime));
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
        dailyWeatherElementDto.setRainAmount(dailyWeatherElement.getRainAmount());
        dailyWeatherElementDto.setUvi(dailyWeatherElement.getUvi());

        return dailyWeatherElementDto;
    }
}
