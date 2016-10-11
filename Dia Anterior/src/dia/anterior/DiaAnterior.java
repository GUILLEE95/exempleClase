/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia.anterior;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
import java.util.Scanner;

public class DiaAnterior {
    static Scanner lector = new Scanner (System.in);
    static dia dia=new dia();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       System.out.println("Dame el Dia:");
       dia.setDia(lector.nextInt());
       System.out.println("Dame el Mes:");
       dia.setMes(lector.nextInt());
       System.out.println("Dame el Any:");
       dia.setAny(lector.nextInt());
    }
    
}
