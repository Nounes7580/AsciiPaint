/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AsciiPaint;
import Model.Point;
import View.View;



/**
 *
 * @author youne
 */
public class Controller {

    private AsciiPaint paint;
    private View view ;
    /**
     * controller of ascii
     */
    public void start(){
        view = new View();
        view.displayString("choisissez une taille pour la zone");
        
        paint = new AsciiPaint(view.askInt(),view.askInt());
         
       String action = view.askAction();
       
       while(!action.equals("exit")){
           if(action.equals("new")){
               String shape = view.askShape();
               if(shape.equals("cercle")){
                   paint.newCircle(view.askPoint(), view.askInt(), view.askColor());
               }else if(shape.equals("rectangle")){
                   paint.newRectangle(view.askPoint(), view.askInt(), view.askInt(), view.askColor());
               }else {
                   paint.newCarre(view.askPoint(), view.askInt(), view.askColor());
               }
               
           }
           if(action.equals("move")){
               
           }
           view.displayString(paint.asAscii());
       }
        
    }
   
    
}
