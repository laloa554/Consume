package com.Consume.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TimeZone {
    public String id;
    public Date current_time;
    public int gmt_offset;
    public String code;
    public boolean is_daylight_saving;
}
