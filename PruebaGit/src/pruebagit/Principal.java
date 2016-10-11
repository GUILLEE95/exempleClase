/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author Guillem Martinez
 */
import java.io.*; //importacion de paquetes de clase java.io
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {	
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList listaPersonas = new ArrayList();
	public static void main(String[] args){
		Persona persona = new Persona();
		int sel=0,pos=0;
		String name;
		while(sel!=5){
			sel= menu();
			switch(sel){
				case 1:
					listaPersonas.add(insertarDatos());
					break;
				case 2:
					printarDatos();
					break;
				default:
					break;				
			}
		}
	}		
	public static int menu(){
		int opcion=0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Menu\n");
		System.out.println("1. Insertar\n");
		System.out.println("2. Mostrar\n");
		System.out.println("3. Salir\n");
		opcion = sc.nextInt(); 
		return (opcion);
	}
	
	public static Persona insertarDatos(){		
		String nom;
		Persona p = new Persona();
		System.out.print("Dame tu nombre: ");
		nom=sc.next();
		p.setNom(nom);
		System.out.print("Dame tu Complemento: ");
		p.setSueldo(sc.nextInt());	
		return p;
	}
	
	public static void printarDatos(){
		String nombre,complemento;
		int sueldo;
		for(int i=0;i<listaPersonas.size();i++){
			Persona persona = (Persona)listaPersonas.get(i);			
			System.out.print("Este es tu nombre: ");			
			System.out.print(persona.getNom()+"\n");
			System.out.print("Este es tu complemento: ");
			System.out.print(persona.getSueldo()+"\n");	
			System.out.print("Este es tu sueldo base: ");
			System.out.print(persona.getComplemento()+"\n");		
		}
	}	
}

