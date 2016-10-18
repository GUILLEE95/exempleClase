/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

/**
 * @author Guillem
 * @author Jeickson
 */
public class Palindrome {
    
    //Declare
    private String cadena;
    private String aux;
   
    //Constructors
    public Palindrome() {
    }
    public Palindrome(String cadena) {
        this.cadena = cadena;
    }

    //Getters and Setters
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String Cadena) {
        this.cadena = Cadena;
    }
    public String getAux() {
        return aux;
    }
   
    //Functions
    
    /**
     * Comprueba si una cadena es o palindrome
     */
    public boolean verificar() { 
	
        aux=""; //Le damos a aux un valor de cero.
        for (int i=this.cadena.length()-1;i>=0;i--){ // Bucle que recorre la cadena de atrás para alante
            aux+=cadena.charAt(i);                  //copiamos los caracteres de la cadena principal en aux segun el bucle 
        }                                         //por lo tanto se copiará de atras para alante por lo tanto al revés
        
        if (aux.equals(cadena)){// comparamos las dos cadenas 
            return true;
        }
        else {
            return false;
        }
	
    }
     
        @Override 
    public String toString (){
        return "La palabra introducida es :"+cadena+"   La inversa es :"+aux; // Devolvemos la palabra y la palabra al reves
    }
}
