package com.utfpr.fpoo.ticTacToe.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.utfpr.fpoo.ticTacToe.gui.Paintable;

public class Button implements Paintable{
    private Point position;
    private Dimension dimension;

    public Button(){
        this.position = new Point(0, 0);
        this.dimension = new Dimension(20, 20);
    }
    public Button(int x, int y){
        this.position = new Point(x, y);
        this.dimension = new Dimension(20, 20);
    }
    public Button(int x, int y, int width, int height){
        this.position = new Point(x, y);
        this.dimension = new Dimension(width, height);
    }
    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }
    public Dimension getSize() {
        return dimension;
    }
    public void setSize(Dimension dimension) {
        this.dimension = dimension;
    }
    public int width(){
        return this.dimension.width;
    }
    public int height(){
        return this.dimension.height;
    }

    public boolean isOver(Point point){
        int xLeft = this.position.x;
        int yTop = this.position.y;
        int xRight = xLeft + this.width();
        int yBotton = yTop + this.height();

        return ((point.x > xLeft && point.x < xRight) &&
                (point.y > yTop && point.y < yBotton));
    }

    public MouseListener mouseListener() {

        return new MouseListenerAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                   if( !isOver( me.getPoint() ))
                        return;
            System.out.println("oieee!");

        
    }
        };

    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(position.x, position.y, dimension.width, dimension.height);
      }
}