/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiocircunferencia;

/**
 *
 * @author danu
 */
import java.util.*;
public class RadioCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  radio, areaC, longitud;
        System.out.print("Introduce radio de la circunferencia: ");
        radio = sc.nextDouble();
        longitud = 2*Math.PI*radio;
        areaC = Math.PI*Math.pow(radio,2);
        System.out.println("Longitud de la circunferencia -> " + longitud);
        System.out.println("Área de la circunferencia -> " + areaC);
    }
    
}
