package com.nitin.microservices.learning.limitservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by nitin on Sunday, November/17/2019 at 1:32 PM
 *
 * Registering this bean as a Component. @ConfigurationProperties is sufficient
 * to registewr the bean as component. @Component is not needed.
 */

@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
public class Configuration {

    private int minimum;
    private int maximum;
    private String msg;
}
