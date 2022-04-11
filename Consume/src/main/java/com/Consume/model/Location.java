package com.Consume.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Location {
    public int geoname_id;
    public String capital;
    public ArrayList<Language> languages;
    public String country_flag;
    public String country_flag_emoji;
    public String country_flag_emoji_unicode;
    public String calling_code;
    public boolean is_eu;
}
