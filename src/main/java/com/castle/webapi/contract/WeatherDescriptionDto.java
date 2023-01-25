package com.castle.webapi.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

@Setter
public class WeatherDescriptionDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("main_description")
    private String mainDescription;
    @JsonProperty("description")
    private String description;
    @JsonProperty("icon")
    private String icon;
}
