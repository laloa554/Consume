package com.Consume.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Currency {
    public String code;
    public String name;
    public String plural;
    public String symbol;
    public String symbol_native;
}
