/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author youne
 */
public class Circle extends ColorShape {

    private Point center;
    private double radius;

    public Circle(Point center, double radius, char color) {
        super(color);
        this.center = center;
        this.radius = radius;

    }

    @Override
    public boolean isInside(Point p) {
        if (p == null) {
            throw new IllegalArgumentException("vous etes en dehors");
        }
return Math.pow(p.getX()-center.getX(),2)+Math.pow(p.getY()-center.getY(), 2)<=radius;    }

    @Override
    public void move(double dx, double dy) {
       center.move(dx, dy);
    }

   
}
