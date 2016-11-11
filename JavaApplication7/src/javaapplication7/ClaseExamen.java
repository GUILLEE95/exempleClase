package javaapplication7;

//importem Random per escollir la paraula a l'atzar, i l'escanner per la introduccio de lletres
import java.util.Random;
import java.util.Scanner;

/**
 * Clase de JavaApplication7.java
 * @version 1.0 Examen
 * @author Guillem Martínez
 * @since 11/11/2016
 */
public class ClaseExamen {
    //Scanner anomenat lector
    Scanner lector = new Scanner (System.in);
    //String amb les paraules que volem adivinar
    String[] paraules={"ATOM","MOLECULA","BIO", "PERL"};
    
    //Declarem variables
    String resposta, llegit="",paraula;
    boolean valid;
    int count, encerts, pos;
    char c; 
    
//VOID'S    
    public void pGeneral(){
    do{
           //Void random que agafa una paraula al atzar
           random();
               
            //Es crea l'array de caracters que mostren les encertades
            char lletres[]=new char[paraula.length()];
            for(int i=0;i<paraula.length();i++){
                lletres[i] ='_';
            }
            
            //Inicialitzem les tres variables
            count=0;
            encerts=0;
            
            do{
                valid=false;
                
                //Mostem per escriure una lletra valida, i si esta en la paraula, la posem com majuscula.
                //Tambe restringim les paraules que acceptem
              do{
                  //Mostem per escriure una lletra valida, i si esta en la paraula, la posem com majuscula.
                  LlValida();
                  //Restringim les paraules que acceptem
                  CaractersValids();  
              }while(valid == false || llegit.isEmpty() || llegit==null);
              
              //Passem la lletra en mayuscules a la variable c
              c=llegit.toUpperCase().charAt(0);
              
              //Passem paraula.indexOf(c) a la variable pos que ens servira per el cas de que no existeixi la lletra.
              pos = paraula.indexOf(c);
              
              
              if (pos == -1) {
                  
                  //Controla el numero d'intents
                  intents();
                  //Si no queden mes intents no deixa jugar mes, i has de triar opcio de tornar a jugar o acabar.
                  SenseIntents();
 
               } else {     
                        //Si no es error, sumem un encert, i mostrem que ho tornin a intentar
                        llEncertada(paraula,lletres);
                      }

             }while(count !=10);
        //Al finalitzar el joc amb victoria o derrota, mostrem si vol tornar a jugar
        //en cas que digui S,torna a començar el programa, si diu N, s'acaba.
        continuar();
       }while(resposta.equals("S"));
    }

    //Void per continuar
    private void continuar(){
        System.out.println("Vols continuar?(S/N)");
        resposta=lector.nextLine().toUpperCase();
    }
    
    //Void Lletra Encertada
    private void llEncertada(String paraula, char lletres[]){
        //Si no es error, sumem un encert, i mostrem que ho tornin a intentar
                       for(int i=0;i<lletres.length;i++){
                           if(paraula.charAt(i) == c){
                               
                               lletres[i] =c;
                              
                               encerts +=1;
                           }
                           System.out.print(lletres[i]+" ");
                           
                       }
                  System.out.println("Molt bé!!! Torna a intentar-ho");
                  pEncertada (paraula);    
    }
    
    //Void Paraula Encertada
    private void pEncertada (String paraula){
        //Si encerts es igual a la longitud de la paraula, significa que esta acertada, i mostem que ha encertat la paraula
        if(encerts == paraula.length()){
        System.out.println("Has acabat encertant la paraula. Felicitats!!!!");
        count =10;
        }
    }
    
    //Void Lletra Valida
    private void LlValida (){
        //Mostem per escriure una lletra valida, i si esta en la paraula, la posem com majuscula.
        System.out.println ("Si us plau, Escriu una lletra valida");
        llegit=lector.nextLine().toUpperCase();
    }
    
    //Void Caracters Valids
    private void CaractersValids (){
        //Restringim les paraules que acceptem
        if(llegit.matches("[ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ]")) valid=true;
    }
    
    //Void random
    private void random(){
        //Agafem al atzar una de les paraules que insertem al String
            Random rnd = new Random();
            int endevina=(int)(rnd.nextDouble()*paraules.length);
            
           //La paraula que ha sortit escollida pasa al string paraula i mostrem la pista de la longitud de la paraula
            paraula=paraules[endevina];
            System.out.println("La paraula que has d'encertar té "+paraula.length()+" lletres");
    }
    
    //Void intents
    private void intents(){
        //En cas d'error mostrem el missatge amb el numero d'intents que queden
        count++;
        System.out.println("Aquesta lletra no es troba dins de la paraula. Ara et queden "+ (10-count)+ " intents");   
    }
    
    //Void SenseIntents
    private void SenseIntents(){
       //Si count arriba a 10, mostem que s'han esgotat els intents
       if(count == 10) System.out.println("Has esgotat tots els intents"); 
    }
}