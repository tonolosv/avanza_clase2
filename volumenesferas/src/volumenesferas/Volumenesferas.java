/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumenesferas;

/**
 *
 * @author danu
 */
import java.util.*;
public class Volumenesferas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double radio, volumen;
        System.out.println("Introduzca radio de la esfera");
        radio = sc.nextDouble();
        System.out.println("Volumen de la esfera de radio " + radio + " = " + (4.0/3)
                *Math.PI*Math.pow(radio,3));
    }
    
}
