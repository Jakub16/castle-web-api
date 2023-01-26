package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

@Setter
public class WeatherSensorDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("sensor_name")
    private String sensorName;
    @JsonProperty("sensor_type")
    private String sensorType;
    @JsonProperty("sensor_location")
    private String sensorLocation;
    @JsonProperty("temperature")
    private float temperature;
    @JsonProperty("humidity")
    private float humidity;
}