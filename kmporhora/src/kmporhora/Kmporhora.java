/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmporhora;

/**
 *
 * @author danu
 */
import java.util.*;

public class Kmporhora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //no puse el scanner de la informacion, por eso no lo reconocia error es:
        /**Exception in thread "main" java.lang.UnsupportedOperationException: Not supported yet.
*Introduzca velocidad en Km/h: 	at kmporhora.sc.nextDouble(sc.java:15)
	at kmporhora.Kmporhora.main(Kmporhora.java:24)
C:\Users\danu\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 1 second)
         * 
         */
        Scanner sc = new Scanner(System.in);
        double velocidad;
        System.out.print("Introduzca velocidad en Km/h: ");
        velocidad = sc.nextDouble();
        System.out.println(velocidad + "Km/h " + velocidad*1000/3600 + " m/s");
    }
    
}
