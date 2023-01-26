package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

@Setter
public class DailyWeatherElementDto {

    @JsonProperty("id")
    private long id;
    @JsonProperty("unix_time")
    private long unixTime;
    @JsonProperty("sunrise")
    private long sunrise;
    @JsonProperty("sunset")
    private long sunset;
    @JsonProperty("day_temperature")
    private float dayTemperature;
    @JsonProperty("min_temperature")
    private float minTemperature;
    @JsonProperty("max_temperature")
    private float maxTemperature;
    @JsonProperty("night_temperature")
    private float nightTemperature;
    @JsonProperty("evening_temperature")
    private float eveningTemperature;
    @JsonProperty("morning_temperature")
    private float morningTemperature;
    @JsonProperty("day_perceived_temperature")
    private float dayPerceivedTemperature;
    @JsonProperty("night_perceived_temperature")
    private float nightPerceivedTemperature;
    @JsonProperty("evening_perceived_temperature")
    private float eveningPerceivedTemperature;
    @JsonProperty("morning_perceived_temperature")
    private float morningPerceivedTemperature;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("wind_speed")
    private float windSpeed;
    @JsonProperty("weather_description")
    private WeatherDescriptionDto weatherDescriptionDto;
    @JsonProperty("cloudiness")
    private int cloudiness;
    @JsonProperty("probability_of_precipitation")
    private float probabilityOfPrecipitation;
//    @JsonProperty("rain_amount")
//    private float rainAmount;
    @JsonProperty("uvi")
    private float uvi;

    public DailyWeatherElementDto setWeatherDescriptionDto(WeatherDescriptionDto weatherDescriptionDto) {
        this.weatherDescriptionDto = weatherDescriptionDto;
        return this;
    }
}
