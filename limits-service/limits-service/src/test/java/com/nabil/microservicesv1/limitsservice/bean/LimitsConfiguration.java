package com.nabil.microservicesv1.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LimitsConfiguration {

    private int maximum;
    private int minimum;
}
