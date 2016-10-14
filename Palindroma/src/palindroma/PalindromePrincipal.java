/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

import java.util.Scanner;

/**
 *Nos permite identicar una cadena palindroma
 * @author guillem
 * @author Jeickson
 */
public class PalindromePrincipal {

    /**
     * @param args the command line arguments
     */
    
    static Scanner lector = new Scanner (System.in);
    static Palindrome palabra=new Palindrome();
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Clase Palindrome.java
        //funcion verificar_Palindroma 
        //- return 1 (correcto) return 0 (incorrecto)s
        
       System.out.println("Dame tus numeros:");
       palabra.setCadena(lector.next());
    }
    
}
