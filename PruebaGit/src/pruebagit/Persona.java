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
public class Persona {
	private String nombre;
	public int sueldoo;
	public static int complemento=800;
//	
	public Persona(){
		
		}
	public Persona(String nom, int sueldo){
		nombre=nom;
		sueldoo=sueldo;
	}
	public String getNom(){
		return nombre;
	}
	public int getComplemento(){
		return complemento;
	}
	public void setNom(String nom){
		this.nombre=nom;
	}
	public int getSueldo(){
		return sueldoo;
	}
	public void setSueldo(int sueldo){
		this.sueldoo=sueldo;
	}
}


