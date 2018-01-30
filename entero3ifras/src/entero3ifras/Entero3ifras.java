/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entero3ifras;

/**
 *
 * @author danu
 */
import java.util.*;
public class Entero3ifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Introduzca valor de N: ");
        N = sc.nextInt();
        System.out.println("Primera cifra de " + N + "-> " + (N/100));
        System.out.println("Cifra central de " + N + "-> " + (N/10)%10);
        System.out.println("Última cifra de " + N + "-> " + (N%10));
    }
    
}
