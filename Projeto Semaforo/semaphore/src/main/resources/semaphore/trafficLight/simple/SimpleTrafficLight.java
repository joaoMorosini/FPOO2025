package com.utfpr_fpoo.semaphore.trafficLight.simple;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.text.Position;

import com.utfpr_fpoo.semaphore.spot.SpotLight;

public class SimpleTrafficLight {
    private Point position;
    private Dimension dimension;
    private Mask image;
    private SpotLight yellow;
    private SpotLight green;
    private SpotLight red;

    public SimpleTrafficLight(Point position, Dimension dimension, Mask image, SpotLight yellow, SpotLight green,
            SpotLight red) {
        this.position = position;
        this.dimension = dimension;
        this.image = image;
        this.yellow = yellow;
        this.green = green;
        this.red = red;
    }
    public SimpleTrafficLight(Point position, Dimension dimension) {
        this.position = position;
        this.dimension = dimension;
        this.mask = null;
        this.red = new SpotLight(null, null);
        this.yellow = new SpotLight(null, null);
        this.green = new SpotLight(null, null);
        create();
    }

    private void create(){
        //future implementation
    }

    public Point getPosition() {
        return (Point) this.position.clone();
    }

    public void setPosition(Point position) {
        int xLeft = position.x;
        int yTop = position.y;
        this.position = new Point(xLeft, yTop);
    }

    public Dimension getDimension() {
        return (Dimension) this.dimension.clone();
    }

    public void setDimension(Dimension dimension) {
        int widht = dimension.width;
        int height = dimension.height;
        this.dimension = new Dimension(widht, height);
    }
}
