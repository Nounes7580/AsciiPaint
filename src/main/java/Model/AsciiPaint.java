/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.Drawing;

/**
 *
 * @author youne
 */
public class AsciiPaint {
   private Drawing drawing;

    public AsciiPaint() {
        drawing =new Drawing();
    }

    /**
     * controller of AsciiPaint
     * @param width
     * @param height 
     */
    
    public AsciiPaint(int width,int height) {
        drawing =new Drawing(height, width);
        
    }
    /**
     * 
     * methode who add a Circle in drawing
     * @param point
     * @param radius
     * @param color 
     */
   public void newCircle(Point point,double radius,char color){
     drawing.addShape(new Circle(point,radius, color));
   }
   /**
    * 
    * methode who add a Rectangle in drawing
    * @param point
    * @param width
    * @param heigth
    * @param color 
    */
   public void newRectangle(Point point,double width,double heigth,char color){
       
     drawing.addShape(new Rectangle(point, width, heigth, color));
   }
   /**
    * methode who a Square in drawing
    * @param point
    * @param side
    * @param color 
    */
      public void newCarre(Point point,double side,char color){
       
       drawing.addShape(new Carré(point, side, color));
       
   }
      /**
       * methode who we can draw a Shape
       * @return  draw of Shape
       */
      public String asAscii(){
         
            return drawing.toString();
      }
}
