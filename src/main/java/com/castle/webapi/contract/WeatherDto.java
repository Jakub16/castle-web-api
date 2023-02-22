package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

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
    private long sunrise;
    @JsonProperty("sunset")
    private long sunset;
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
