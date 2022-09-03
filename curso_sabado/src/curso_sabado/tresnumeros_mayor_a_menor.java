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
public class tresnumeros_mayor_a_menor {
    public static void main(String[] args) {
        
        Scanner numero1 = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = numero1.nextInt();
        
        Scanner numero2 = new Scanner (System.in);
        System.out.println("Ingrese el segundo numero: ");
        int num2 = numero2.nextInt();
        
        Scanner numero3 = new Scanner (System.in);
        System.out.println("Ingrese el tercer numero: ");
        int num3 = numero3.nextInt();
        
        if (num1 > num2 && num2> num3){
            
            System.out.println("Numeros ordenados de mayor a menor: " + num1 + ", " + num2 + ", " + num3);
        } 
        else if (num1 > num3 && num3 > num2){
            
            System.out.println("Numeros ordenados de mayor a menor: " + num1 +", "+ num3 + ", "+ num2);
        }
        else if(num2 > num1 && num1 > num3){
            
            System.out.println("Nuemros ordenados de mayor a menor: " + num2 + ", " + num1 + ", " + num3);            
        }
        
        else if (num2 > num3 && num3 > num1){
            
            System.out.println("Nuemros ordenados de mayor a menor: " + num2 + ", " + num3 + ", " + num1); 
        }
        else if(num3 > num1 && num1 > num2){
            System.out.println("Nuemros ordenados de mayor a menor: " + num3 + ", " + num1 + ", " + num2); 
        }
        else {
            System.out.println("Numeros ordenados de mayor a menor: " + num3 + ", " + num2 + ", " + num1);
            
        }
        
        
    }
}
