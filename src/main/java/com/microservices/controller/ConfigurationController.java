package com.microservices.controller;

import com.microservices.conf.officeProps.OfficeConfigProperties;
import com.microservices.conf.officeProps.bean.OfficeConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nitin on Saturday, November/16/2019 at 1:14 AM
 */
@RestController
public class ConfigurationController {

    @Autowired
    private OfficeConfigProperties configuration;

    @GetMapping("/limits")
    public OfficeConfigBean retrieveLimitsFromConfigurations(){

        return new OfficeConfigBean(configuration.getMinHours(),
        		configuration.getMaxHours(),
        				configuration.getDuties());
    }

    @RequestMapping("/")
    public String index() {
        return "Hello : Spring Boot is Up and Running";
    }
}
