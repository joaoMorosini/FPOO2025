package com.utfpr_fpoo.semaphore.app;

import java.io.IOException;
import java.time.LocalTime;

import com.utfpr_fpoo.semaphore.control.simple.OneWaySemaphoreControl;
import com.utfpr_fpoo.semaphore.control.simple.SemaphoreControl;
import com.utfpr_fpoo.semaphore.trafficLight.control.SimpleTrafficLightControl;
import com.utfpr_fpoo.semaphore.trafficLight.control.TrafficLightControl;
import com.utfpr_fpoo.semaphore.trafficLight.simple.SimpleTrafficLight;
import com.utfpr_fpoo.semaphore.util.gui.MyWindow;

public class AppOneWaySimpleSemaphoreControlTest {
 static private
    void oneWaySimpleSemaphoreTest() throws IOException {

        SimpleTrafficLight defaultOne = new SimpleTrafficLight();
        TrafficLightControl trafficLightControl = new SimpleTrafficLightControl(defaultOne);
        SemaphoreControl semaphoreControl = new OneWaySemaphoreControl(trafficLightControl);

        semaphoreControl.setAlertPeriod( LocalTime.now(),
                                         LocalTime.now().plusSeconds(30) );

        semaphoreControl.turnOn();

        MyWindow window = new MyWindow();
        window.add(defaultOne);
    }

    static public
    void main(String[] args) throws IOException {

        oneWaySimpleSemaphoreTest();
    }
}