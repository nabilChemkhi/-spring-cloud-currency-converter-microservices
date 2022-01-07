package com.nabil.microservicesv1.limitsservice;


import com.nabil.microservicesv1.limitsservice.bean.LimitsConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
public class LimitsConfigurationController {

    private Configuration configuration;

    @GetMapping("/limits")

    @HystrixCommand(fallbackMethod="fallbackRetrieveLimitsFromConfigurations")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {

          //  return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());

         throw new RuntimeException("Not available");


    }

    public LimitsConfiguration fallbackRetrieveLimitsFromConfigurations() {
        return new LimitsConfiguration(000, 00);
    }


}
