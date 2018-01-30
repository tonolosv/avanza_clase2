/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buenosdias;

/**
 *
 * @author danu
 */
import java.util.*;
public class Buenosdias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce tu nombre: ");
        cadena = sc.nextLine();
        System.out.println("Buenos días " + cadena);
    }
    
}
