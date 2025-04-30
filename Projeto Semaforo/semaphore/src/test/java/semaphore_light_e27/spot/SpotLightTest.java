package semaphore_light_e27.spot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.ClassOrderer.DisplayName;

import com.utfpr_fpoo.semaphore.light.e27.AbstractLightE27;
import com.utfpr_fpoo.semaphore.light.e27.E27LightBulb;
import com.utfpr_fpoo.semaphore.spot.SpotLight;
import java.awt.Point;
import java.awt.Dimension;
class SpotLightTest {
    @Test
    void shouldTurnOn(){
        AbstractLightE27 light = new AbstractLightE27();
        SpotLight spot = new SpotLight(null, null);
        spot.setLight(light);

        light.turnOff();
        spot.turnOn();

        assertTrue(light.isOn());
        assertTrue(spot.isOn());

    }
    @Test
    void shouldTurnOff(){
        AbstractLightE27 light = new AbstractLightE27();
        SpotLight spot = new SpotLight(null, null);
        spot.setLight(light);

        light.turnOn();
        spot.turnOff();

        assertTrue(light.isOff());
        assertTrue(spot.isOff());

    }
    @Test
    void shouldReturnCloneOfPosition(){
        SpotLight spot = new SpotLight(null, null);
        spot.setLight(new E27LightBulb());
        final int xLeft = 20;
        final int yTop = 50;
        spot.setPosition(xLeft, yTop);

        Point position = spot.getPosition();
        position.setLocation(new Point(30,30));

        assertEquals(xLeft, spot.getPosition().getX());
        assertEquals(yTop, spot.getPosition().getY());
    }
    @Test
    void shouldReturnCloneOfDimension(){
        SpotLight spot = new SpotLight(null, null);
        spot.setLight(new E27LightBulb());
        final int widht = 20;
        final int height = 20;
        spot.setDimension(new Dimension(widht, height));

        Dimension dimension = spot.getDimension();
        dimension.setSize(100, 120);

        assertEquals(widht, spot.getDimension().getWidth());
        assertEquals(height, spot.getDimension().getHeight());
    }
}
