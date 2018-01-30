/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

/**
 *
 * @author danu
 */
import java.util.*;
public class Pitagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cat1, cat2;
        System.out.print("Introduzca el valor del primer cateto: ");
        cat1 = sc.nextDouble();
        System.out.print("Ingrese el valor del siguiente cateto: ");
        cat2 = sc.nextDouble();
        System.out.println("Hipotenusa -> " + Math.sqrt(Math.pow(cat1,2)+ Math.pow(cat2,2)));
    }
    
}
