/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdosnumeros;

/**
 *
 * @author danu
 */
import java.util.*;
public class Leerdosnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarando la variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        //leyendo el primer numero
        System.out.print("Introduce dos numeros entero: ");
        n1 = sc.nextInt();
        //leyendo el segundo numero
        n2 = sc.nextInt();
        //Mostrando los numeros
        System.out.println("Ha introducido los numeros: " + n1 + " y " + n2);
    }
    
}
