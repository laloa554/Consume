package com.Consume.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Root {
    public String ip;
    public String hostname;
    public String type;
    public String continent_code;
    public String continent_name;
    public String country_code;
    public String country_name;
    public String region_code;
    public String region_name;
    public String city;
    public String zip;
    public double latitude;
    public double longitude;
    public Location location;
    public TimeZone time_zone;
    public Currency currency;
    public Connection connection;
    public Security security;
}
