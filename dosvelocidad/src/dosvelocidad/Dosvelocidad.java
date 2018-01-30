/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosvelocidad;

/**
 *
 * @author danu
 */
import java.util.*;
public class Dosvelocidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidad;
        System.out.print("Introduzca su velocidad en Km/h ");
        velocidad = sc.nextDouble();
        System.out.println(velocidad + " Km/h -> " + (velocidad*1000/3600) + " m/s");
    }
    
}
