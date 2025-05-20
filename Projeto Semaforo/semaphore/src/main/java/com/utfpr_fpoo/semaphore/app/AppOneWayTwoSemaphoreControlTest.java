package com.utfpr_fpoo.semaphore.app;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.utfpr_fpoo.semaphore.control.simple.OneWaySemaphoreControl;
import com.utfpr_fpoo.semaphore.control.simple.SemaphoreControl;
import com.utfpr_fpoo.semaphore.trafficLight.control.SimpleTrafficLightControl;
import com.utfpr_fpoo.semaphore.trafficLight.control.TrafficLightControl;
import com.utfpr_fpoo.semaphore.trafficLight.simple.SimpleTrafficLight;
import com.utfpr_fpoo.semaphore.util.gui.MyWindow;
import java.awt.Point;
import java.awt.Dimension;
public class AppOneWayTwoSemaphoreControlTest {

    private MyWindow window = new MyWindow();
    private SemaphoreControl semaphoreControl;

    private TrafficLightControl createTrafficLight(Point position,
                                                  Dimension dimension) throws IOException 
    {
        SimpleTrafficLight trafficLight = new SimpleTrafficLight(position, dimension);
        window.add(trafficLight);

        return (new SimpleTrafficLightControl(trafficLight));
    }
    private void create() throws IOException
    {
        List<TrafficLightControl> list = new ArrayList<>();
        list.add(createTrafficLight(new Point(100, 100), new Dimension(70, 180)));
        list.add(createTrafficLight(new Point(300, 100), new Dimension(70, 180)));

        semaphoreControl = new OneWaySemaphoreControl(list);
    }
    public AppOneWayTwoSemaphoreControlTest() throws IOException {
    this.create();
    semaphoreControl.setAlertPeriod(LocalTime.now(),
                                    LocalTime.now().plusSeconds(30));
    semaphoreControl.turnOn();
}

public static void main(String[] args) throws IOException {
    new AppOneWayTwoSemaphoreControlTest();
}

}

