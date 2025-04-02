package com.utfpr_fpoo.semaphore_light;

public interface light {
    enum OnOff {ON, OFF};

    void turnOn();
    void turnOff();
    
    boolean isOn();
    boolean isOff();
    
} 
