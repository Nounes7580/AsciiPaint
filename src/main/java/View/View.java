/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Point;
import java.util.Scanner;

/**
 *
 * @author youne
 */
public class View {

    Scanner clavier;

    public View() {
        clavier = new Scanner(System.in);

        
    }

    public Point askPoint() {
        System.out.println("entrez le point en coordonnée x");
        int x = askInt();
        System.out.println("entrez le point en coordonnée y");
        int y = askInt();
        return new Point(x, y);
    }

    public int askInt() {
        System.out.println("entrez un nombre entier");
        while (!clavier.hasNextInt()) {
            System.out.println("un nombre entier svp!!!");
            clavier.next();
        }
        return clavier.nextInt();
    }
    
    public void displayString(String str){
        System.out.println(str);
        
    }
    public String askAction(){
        System.out.println("que voulez vous faire ? NEW , MOVE , EXIT ");
        String str = "";
        str = clavier.next();
        while(!str.toLowerCase().equals("new")&& !str.toLowerCase().equals("move")&& !str.toLowerCase().equals("exit")){
            System.out.println("je ne comprend pas");
           str = clavier.next();
        }
        return str;
    }
    public char askColor(){
        System.out.println("la couleur ?");
        return clavier.next().charAt(0);
    }
    public String askShape(){
        System.out.println("que voulez vous faire ? CERCLE , RECTANGLE , CARRE ");
        String str = "";
         str = clavier.next();
        while(!str.toLowerCase().equals("cercle")&&!str.toLowerCase().equals("rectangle")&&!str.toLowerCase().equals("carre")){
            System.out.println("je ne comprend pas");
           str= clavier.next();
        }
        return str;
    }
   
    
}
