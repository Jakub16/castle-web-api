package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class WeatherDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("latitude")
    private float latitude;
    @JsonProperty("longitude")
    private float longitude;
    @JsonProperty("time")
    private Date time;
    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("temperature")
    private float temperature;
    @JsonProperty("perceived_temperature")
    private float perceivedTemperature;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("cloudiness")
    private int cloudiness;
    @JsonProperty("wind_speed")
    private float windSpeed;
    @JsonProperty("weather_description")
    private WeatherDescriptionDto weatherDescriptionDto;
}
