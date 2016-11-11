/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenTest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import javaapplication7.ClaseExamen;

/**
 * Test de ClaseExamen.java
 * @version 1.0 Examen
 * @author Guillem Martínez
 * @since 11/11/2016
 */
@RunWith(Parameterized.class)
public class Test {
    
    public Test() {
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {"A",true}, {"Ç",false}, {"A",true} //Le pasamos 3 letras con el resultado esperado
           });
    }
    private String llegit;
    private boolean r;
    
    public Test(String llegit,boolean r) {
        this.llegit=llegit;
        this.r=r;
    }
    
     @org.junit.Test
    public void verificarTest(){
        ClaseExamen p = new ClaseExamen(this.llegit); 
        boolean res =p.verificar() ; //Devuelve true o false al usar verificar
        assertEquals(res,this.r); //Compalamos el resultado con el resultado esperado.
        
    }
}
