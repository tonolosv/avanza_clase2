/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centigrados;



/**
 *
 * @author danu
 */
import java.util.*;
public class Centigrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      double gradosC, gradosF;
        System.out.print("Introduce grados Centigrados: ");
        gradosC = sc.nextDouble();
        gradosF = 32 + (9*gradosC/5);
        System.out.println(gradosC + "°C = " + gradosF + " °F");
    }
    
}
