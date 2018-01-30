/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;

/**
 *
 * @author danu
 */
import java.util.*;
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,p;
        System.out.println("Introduzca longitud del primer lado del triangulo: ");
        a = sc.nextDouble();
        System.out.println("Introduzca longitud del segundo lado del trinagulo");
        b = sc.nextDouble();
        System.out.println("Introduzca longitud del tercer lado del triangulo");
        c = sc.nextDouble();
        p = (a+b+c)/2;
        System.out.println("Area -> " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
    
}
