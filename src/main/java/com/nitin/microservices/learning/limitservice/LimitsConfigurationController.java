package com.nitin.microservices.learning.limitservice;

import com.nitin.microservices.learning.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nitin on Saturday, November/16/2019 at 1:14 AM
 */
@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){

        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
