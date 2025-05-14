package semaphore_light_e27.control;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.utfpr_fpoo.semaphore.trafficLight.TrafficLight;
import com.utfpr_fpoo.semaphore.trafficLight.control.SimpleTrafficLightControl;
import com.utfpr_fpoo.semaphore.trafficLight.simple.SimpleTrafficLight;


class SimpleTrafficLightControlTest {
    @Test
    void shouldTurnGreen() throws IOException {
        // given
        TrafficLight trafficLight = new SimpleTrafficLight() ;
        SimpleTrafficLightControl control = new SimpleTrafficLightControl(trafficLight);

        // do action
        control.turnGreen();

        // check
        assertTrue(trafficLight.spotGreen().isOn());
        assertTrue(trafficLight.spotYellow().isOff());
        assertTrue(trafficLight.spotRed().isOff());
    }

    @Test
    void shouldTurnYellow() throws IOException {
         // given
        TrafficLight trafficLight = new SimpleTrafficLight() ;
        SimpleTrafficLightControl control = new SimpleTrafficLightControl(trafficLight);

        // do action
        control.turnYellow();

        // check
        assertTrue(trafficLight.spotGreen().isOff());
        assertTrue(trafficLight.spotYellow().isOn());
        assertTrue(trafficLight.spotRed().isOff());
    }

    @Test
    void shouldTurnRed() throws IOException{
          // given
        TrafficLight trafficLight = new SimpleTrafficLight() ;
        SimpleTrafficLightControl control = new SimpleTrafficLightControl(trafficLight);

        // do action
        control.turnRed();

        // check
        assertTrue(trafficLight.spotGreen().isOff());
        assertTrue(trafficLight.spotYellow().isOff());
        assertTrue(trafficLight.spotRed().isOn());
    }

    @Test
    void shouldTurnOff() throws IOException{
         // given
        TrafficLight trafficLight = new SimpleTrafficLight() ;
        SimpleTrafficLightControl control = new SimpleTrafficLightControl(trafficLight);

        // do action
        control.turnOff();

        // check
        assertTrue(trafficLight.spotGreen().isOff());
        assertTrue(trafficLight.spotYellow().isOff());
        assertTrue(trafficLight.spotRed().isOff());
    }
}