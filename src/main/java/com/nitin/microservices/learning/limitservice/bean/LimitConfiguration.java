package com.nitin.microservices.learning.limitservice.bean;

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
public class LimitConfiguration {

    private int maximum;
    private int minimum;
	private String msg;

	public LimitConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }
}
