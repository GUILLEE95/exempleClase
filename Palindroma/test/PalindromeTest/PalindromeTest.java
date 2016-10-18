/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalindromeTest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import palindroma.Palindrome;

/**
 *
 * @author alumne
 */
@RunWith(Parameterized.class)
public class PalindromeTest {
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {"lol",true}, {"hola",false}, {"aja",true} //Le pasamos 3 palabras con el resultado esperado
           });
    }
    private String cadena;
    private boolean r;
    
    public PalindromeTest(String cadena,boolean r) {
        this.cadena=cadena;
        this.r=r;
    }
     @Test
    public void verificarTest(){
        Palindrome p = new Palindrome(this.cadena); //Clase palindroma de nombre p.
        boolean res =p.verificar() ; //Devuelve true o false al usar verificar
        assertEquals(res,this.r); //Compalamos el resultado con el resultado esperado.
        
    }
    
}
