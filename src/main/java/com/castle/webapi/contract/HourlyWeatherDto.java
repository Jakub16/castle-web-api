package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class HourlyWeatherDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("time_of_forecast")
    private Date timeOfForecast;
    @JsonProperty("hourly_weather")
    private List<HourlyWeatherElementDto> hourlyWeatherElementDtos = new ArrayList<>();
}
