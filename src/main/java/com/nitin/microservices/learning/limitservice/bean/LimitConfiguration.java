package com.nitin.microservices.learning.limitservice.bean;

/**
 * Created by nitin on Saturday, November/16/2019 at 1:16 AM
 */
public class LimitConfiguration {


    private int maximum;
    private int minimum;

    //No Argument Constructor
    protected LimitConfiguration(){

    }

    public LimitConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
