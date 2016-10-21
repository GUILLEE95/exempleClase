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
	                                              
         String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
         String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
         
         for (int i=0; i<this.cadena.length(); i++) {
                 // Reemplazamos los caracteres especiales.
                 this.cadena = this.cadena.replace(original.charAt(i), ascii.charAt(i));
           }
         this.cadena = this.cadena.replace(" ","");
          this.cadena=this.cadena.toLowerCase();
         aux = new StringBuilder(this.cadena).reverse().toString();
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
