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
public class FechaCorrecta_o_no {
    public static void main(String[] args){

        Scanner m = new Scanner (System.in);
        System.out.println("Ingrese el numero de mes: ");
        int mes = m.nextInt();
        
        if (mes == 4 || mes == 6 || mes == 9|| mes == 11 || mes == 12 ){
            
            System.out.println("Dato correcto");
            Scanner nd = new Scanner (System.in);
            System.out.println("Ingrese el numero del dia: ");
            int numdia = nd.nextInt();
            
            if (numdia >=1 && numdia <=30){
                System.out.println("Dato correcto");

            } else {
                
                System.out.println("El día ingresado no es correcto");
            }
            
            Scanner a = new Scanner (System.in);
        System.out.println("Ingrese el año: ");
        int año = a.nextInt();
        if (año >= 0){
            System.out.println("Dato correcto");
        } else {
            
            System.out.println("El año ingresado no es valido");
        }
        
        System.out.println("La fecha ingresada es: " + numdia + "/" + mes + "/" + año);

        } else if (mes == 2){
            System.out.println("Dato correcto");
            Scanner nd = new Scanner (System.in);
            System.out.println("Ingrese el numero del dia: ");
            int numdia = nd.nextInt();
            
            if (numdia >=1 && numdia <=28){
System.out.println("Dato correcto");
                
            } else {
                
                System.out.println("El dia ingresado no es correcto");
            }
            Scanner a = new Scanner (System.in);
        System.out.println("Ingrese el año: ");
        int año = a.nextInt();
        if (año >= 0){
System.out.println("Dato correcto");
            
        } else {
            
            System.out.println("El año ingresado no es valido");
        }
        
        System.out.println("La fecha ingresada es : " + numdia + "/" + mes + "/" + año);


        } else if (mes == 1 || mes == 3 || mes == 5|| mes == 7 || mes == 8 || mes == 10){ 
            System.out.println("Dato correcto");
            
            Scanner nd = new Scanner (System.in);
            System.out.println("Ingrese el numero del dia: ");
            int numdia = nd.nextInt();

            if (numdia >=1 && numdia <=31){

   System.out.println("Dato correcto");
            } else{
                
                System.out.println("El numero ingresado no es correcto");
            }
            Scanner a = new Scanner (System.in);
        System.out.println("Ingrese el año: ");
        int año = a.nextInt();
        if (año >= 0){
System.out.println("Dato correcto");
            
        } else {
            
            System.out.println("El año ingresado no es valido");
        }
        
        System.out.println("La fecha ingresada es : " + numdia + "/" + mes + "/" + año);

        } 
        else {
            System.out.println("Numero de mes ingresado Incorrecto");
            
        }

    }
 }
