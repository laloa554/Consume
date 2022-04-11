package com.Consume.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Security {
    public boolean is_proxy;
    public Object proxy_type;
    public boolean is_crawler;
    public Object crawler_name;
    public Object crawler_type;
    public boolean is_tor;
    public String threat_level;
    public Object threat_types;
}
