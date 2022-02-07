package com.microservices.conf.officeProps.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by nitin on Saturday, November/16/2019 at 1:16 AM
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OfficeConfigBean {
    private int minHours;
    private int maxHours;
    private String duties;
}
