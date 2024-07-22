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
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {

        this(p.x, p.y);

    }
public double distance(Point other){
    
    return Math.sqrt(Math.pow(x-other.x, 2)+ Math.pow(y-other.y, 2 ));
}
   
public void move(double dx,double dy){
    this.x+=dx;
    this.y+=dy;
}
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    

}
