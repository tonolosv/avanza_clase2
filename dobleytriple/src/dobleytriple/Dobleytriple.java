/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleytriple;

/**
 *
 * @author danu
 */
import java.util.*;
public class Dobleytriple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un numero entero: ");
        numero = sc.nextInt();
        System.out.println("Número introducido: " + numero);
        System.out.println("Doble de " + numero + "-> " + 2*numero);
        System.out.println("Triple de " + numero + "-> " + 3*numero);
    }
}
