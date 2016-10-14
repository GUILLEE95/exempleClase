/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

/**
 *
 * @author alumne
 */
public class Palindrome {
    //Declare
    private String cadena;
    private String aux;
    //Constructors

    public Palindrome() {
    }

    public Palindrome(String cadena, String aux) {
        this.cadena = cadena;
        this.aux = aux;
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
    public int palindrome() { 
	int k=0;

	
        for (int i=this.cadena.length()-1;i>=0;i--){
            aux =aux+cadena.charAt(i);
        }
        if (aux.equals(cadena)){
            return 1;
        }
        else {
            return 0;
        }
	
    }
    @Override
    public String toString (){
        return "La palabra introducida es :"+cadena+"   La inversa es :"+aux;
    }
}
