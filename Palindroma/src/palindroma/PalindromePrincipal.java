/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

import java.util.Scanner; // Import para usar el scanner

/**
 *Programa que nos permite identicar una cadena palindroma
 * @author Guillem
 * @author Jeickson
 */
public class PalindromePrincipal {

    static Scanner lector = new Scanner (System.in); //Scanner per llegir per pantalla
    static Palindrome palabra=new Palindrome(); //Clase palindroma de nombre palabra.
    
    public static void main(String[] args) {
     
       System.out.println("Pon la palabra:"); //Printamos por pantalla para pedir la palabra
       palabra.setCadena(lector.nextLine()); //Usamos el Scanner para leer lo que el usuario pone
       if (palabra.verificar()) //Si la palabra devuelve true al ser palindroma
       {
           System.out.println("La palabra es palindroma"); //Printamos que es palindroma
       }
       else //Sino es palindroma devuelve false
       {
           System.out.println("La palabra no es palindroma");//Printamos que no es palindroma
       }
       System.out.println(palabra.toString()); //Printa la palabra y la palabra al reves
    }
    
}
