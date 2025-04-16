package com.utfpr_fpoo;

import com.utfpr_fpoo.semaphore.light.AbstractLight;

public class Main {
    public static void main(String[] args) {
        AbstractLight simpleLight = new AbstractLight();
        simpleLight.turnOff();
        System.out.println("On: " + simpleLight.isOff());
        System.out.println("Off: " + simpleLight.isOn());
    }
}