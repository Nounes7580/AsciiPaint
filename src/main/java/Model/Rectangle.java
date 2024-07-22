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
public class Rectangle extends ColorShape {

    private Point upperleft;
    private double width;
    private double height;

    public Rectangle(Point p, double width, double height, char color) {
        super(color);
        this.upperleft = new Point(p);
        this.height = height;
        this.width = width;

    }

   

    @Override
    public void move(double dx, double dy) {
        this.height = dx;
        this.width = dy;
    }

    @Override
    public boolean isInside(Point p) {
        if (p == null) {
            throw new IllegalArgumentException("vous êtes en dehors");
        }

        return (p.getX() >= upperleft.getX()&& p.getY() >= upperleft.getY()&&p.getX()<= upperleft.getX()+width&&p.getY()<=upperleft.getY()+height);
    }

}
