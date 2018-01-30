/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j017;

/**
 *
 * @author danu
 */
import java.io.*;
public class J017 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe tu nombre: ");
        String nom=in.readLine();
        System.out.println("Adios " + nom);
    }
    
}
