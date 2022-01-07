package com.nabil.microservicesV2.limitsservice.controller;

import com.nabil.microservicesV2.limitsservice.bean.Limits;
import com.nabil.microservicesV2.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsController {


    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(),
                configuration.getMaximum());
		//return new Limits(1,1000);
    }
}
