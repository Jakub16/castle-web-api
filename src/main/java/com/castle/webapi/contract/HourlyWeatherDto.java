package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class HourlyWeatherDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("unix_time_of_forecast")
    private long unixTimeOfForecast;
    @JsonProperty("hourly_weather")
    private List<HourlyWeatherElementDto> hourlyWeatherElementDtos = new ArrayList<>();
}
