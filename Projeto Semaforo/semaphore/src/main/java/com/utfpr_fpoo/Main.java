package com.utfpr_fpoo;

import com.utfpr_fpoo.semaphore_light.SimpleLight;

public class Main {
    public static void main(String[] args) {
        SimpleLight simpleLight = new SimpleLight();
        simpleLight.turnOff();
        System.out.println("On: " + simpleLight.isOff());
        System.out.println("Off: " + simpleLight.isOn());
    }
}