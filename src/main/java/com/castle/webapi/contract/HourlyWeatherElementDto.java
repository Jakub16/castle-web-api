package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class HourlyWeatherElementDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("time")
    private Date time;
    @JsonProperty("temperature")
    private float temperature;
    @JsonProperty("perceived_temperature")
    private float perceivedTemperature;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("uvi")
    private float uvi;
    @JsonProperty("cloudiness")
    private int cloudiness;
    @JsonProperty("wind_speed")
    private float windSpeed;
    @JsonProperty("weather_description")
    private WeatherDescriptionDto weatherDescriptionDto;
    @JsonProperty("probability_of_precipitation")
    private float probabilityOfPrecipitation;
//    @JsonProperty("rain_amount")
//    private float rainAmount;

    public HourlyWeatherElementDto setWeatherDescriptionDto(WeatherDescriptionDto weatherDescriptionDto) {
        this.weatherDescriptionDto = weatherDescriptionDto;
        return this;
    }
}
