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
public abstract class ColorShape implements Shape{

    private char color;
  public ColorShape(char color){
       this.color = color;
   }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
    
}
