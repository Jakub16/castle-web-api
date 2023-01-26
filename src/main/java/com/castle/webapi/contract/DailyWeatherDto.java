package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class DailyWeatherDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("unix_time_of_forecast")
    private long unixTimeOfForecast;
    @JsonProperty("daily_weather")
    private List<DailyWeatherElementDto> dailyWeatherElementDtos = new ArrayList<>();
}
