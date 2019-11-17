package com.nitin.microservices.learning.limitservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nitin on Sunday, November/17/2019 at 12:27 PM
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello : Spring Boot is Up and Running";
    }
}

