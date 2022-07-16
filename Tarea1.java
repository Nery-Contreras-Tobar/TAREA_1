/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;

/**
 *
 * @author TF039
 */
import java.util.Scanner;
public class Tarea1 {

   static Scanner scanner=new Scanner(System.in); 
    public static void main(String[] args) {
        
        System.out.println("Cual es tu nombre?");
       String nom = scanner.nextLine();

          System.out.print("Hola " + nom);
          System.out.println(" Que tipo de moneda quieres cambiar?");
          System.out.println("1.Dollar");
          System.out.println("2.Euro");
          System.out.println("3.yuanes");
          
          System.out.println("Selecciona la opcion que desees:");
          int opcion=scanner.nextInt();
         switch(opcion){

              case 1 -> Dolar();
                  
              case 2 -> Euro();
               
              case 3 -> Yuanes();

                }
            if (opcion>3){
                System.out.println("Dijite un nunmero valido");   
            }
            }
        static void Dolar(){
        System.out.println("Conversion a dollar");
       
         System.out.println("Escribe el valor en Quetzales:");
         int numero1=scanner.nextInt();
         
       double resultado = numero1*0.13;
    
       
       System.out.println(" El valor de Quetzales en Dolares son:"+resultado);
        }
            
       static void Euro(){
        System.out.println("Conversion a Euros");
        
         System.out.println("Escribe el valor en Quetzales:");
         int numero1=scanner.nextInt();
        
       double resultado = numero1*0.11;
       
       System.out.println(" El valor de Quetzales en Euros son :"+resultado);
       }
       
           static void Yuanes(){
        System.out.println("Conversion a Yuanes");
        
         System.out.println("Escribe el valor en Quetzales:");
         int numero1=scanner.nextInt();
        
       double resultado = numero1*0.84;
       
       System.out.println(" El valor de Quetzales en Yuanes son:"+resultado);
           }

    }
