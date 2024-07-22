/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Point;
import Model.Shape;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author youne
 */
public class Drawing {

    private LinkedList<Shape> shapes;
    private int height;
    private int width;

    public Drawing() {
    }

    public Drawing(int height, int width) {
        this.shapes = new LinkedList<>();

        this.height = height;
        this.width = width;
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public Shape getShapeAt(Point p) {
        for (Shape shape : shapes) {
            if (shape.isInside(p)) {
                return shape;
            }
        }
        return null;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Point p = new Point(i, j);
                boolean isfind = false;
                for (Shape shape : shapes) {
                    if (shape.isInside(p)) {
                        str += shape.getColor();
                        isfind = true;
                    }
                }
                if (!isfind) {
                    str += " ";
                }
            }
            str += "\n";
        }
        return str;
    }

}
