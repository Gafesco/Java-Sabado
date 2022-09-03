/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso_sabado;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class iguales_o_no {
    
    
     public static void main(String[] args) {
         Scanner numero1 = new Scanner (System.in);
         System.out.println("Ingresar el primer numero: ");
         int num1 = numero1.nextInt();
         
         Scanner numero2 = new Scanner (System.in);
         System.out.println("Ingrese el segundo numero: ");
         int num2 = numero2.nextInt();
         
         if (num1 == num2){
             
             System.out.println("Los numeros son iguales");

         } else{
                     
                     System.out.println("Los numeros no son iguales");
                     }

     }
}
