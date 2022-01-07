package com.nabil.microservicesv1.limitsservice;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component //can be removed included in @ConfigurationProperties
@ConfigurationProperties("limits-service")
@Data
public class Configuration {

    private  int maximum;
    private  int minimum;
}
