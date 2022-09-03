/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso_sabado;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Curso_sabado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese un numero de mes: ");
        int mes = sp.nextInt();
switch (mes){
    case 1:
        System.out.println("El mes ingresado es Enero");
        break;
       
    case 2:
                System.out.println("El mes ingresado es Febrero");
        break;

            case 3:
                System.out.println("El mes ingresado es Marzo");
        break;
            case 4:
                System.out.println("El mes ingresado es Abril");
        break;
            case 5:
                System.out.println("El mes ingresado es Mayo");
        break;
            case 6:
                System.out.println("El mes ingresado es Junio");
        break;
        
    case 7:
                System.out.println("El mes ingresado es Julio");
        break;
            case 8:
                System.out.println("El mes ingresado es Agosto");
        break;
            case 9:
                System.out.println("El mes ingresado es Septiembre");
        break;
            case 10:
                System.out.println("El mes ingresado es Octubre");
        break;
        
            case 11:
                System.out.println("El mes ingresado es Noviembre");
        break;
        
            case 12:
                System.out.println("El mes ingresado es Diciembre");
        break;
    default:
        System.out.println("Ingrese un número que no sea mayor a 12");
    
    
    
    
}

    } 
    
}
