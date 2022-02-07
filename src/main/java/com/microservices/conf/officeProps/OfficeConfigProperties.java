package com.microservices.conf.officeProps;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by nitin on Sunday, November/17/2019 at 1:32 PM
 *
 * Registering this bean as a Component. @ConfigurationProperties is sufficient
 * to register the bean as component. @Component is not needed.
 */

@Component
@ConfigurationProperties(prefix = "office")
@Getter
@Setter
public class OfficeConfigProperties {
    private int minHours;
    private int maxHours;
    private String duties;
}
