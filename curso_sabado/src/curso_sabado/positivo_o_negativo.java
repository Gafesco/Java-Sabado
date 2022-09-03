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
public class positivo_o_negativo {
    
    public static void main(String[] args) {
        
        
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero para operar: ");
        int numop = num.nextInt();
        
        if (numop >= 0){
            
            System.out.println("El numero es Positivo");
            
        } else {
            
            System.out.println ("El numero es negativo");
        }

    }
}
