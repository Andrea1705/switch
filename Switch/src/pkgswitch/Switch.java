/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        
/*
Crear un programa que simule la petición de
una opción según el siguiente menú y muestre
en pantalla que ha ingresado a la opción
seleccionada con las opciones siguientes:
        
¡Gracias por contactarte con nosotros!
¿En qué podemos ayudarte?
A) Documentación
B) Cotización
C) Asistencia
D) Siniestros
E) Información de Pagos
F) Otras Consultas
G) Anulación
Escribe la letra de la opción seleccionada.
        
Debe mostrarse:
Has elegido Documentación (o la opción que haya elegido)
*/
 
Scanner tecla = new Scanner(System.in);
        System.out.println("¡Gracias por contactarte con nosotros!\n¿En qué podemos ayudarte?"
                + "\n\nEscribe la letra de la opción seleccionada: \n A. Documentación "
                + "\n B. Cotización \n C. Asistencia \n D. Siniestros \n E. Información de pagos "
                + "\n F. Otras consultas \n G. Anulación \n Luego presionar enter " );
        
                
        char caracter = tecla.next().charAt(0);
                
        switch (caracter){
            case 'A','a':System.out.println("Has elegido A. Documentación");break;
            case 'B','b':System.out.println("Has elegido B. Cotización");break;
            case 'C','c':System.out.println("Has elegido C. Asistencia");break;
            case 'D','d':System.out.println("Has elegido D. Siniestros");break;
            case 'E','e':System.out.println("Has elegido E. Información de pagos");break;
            case 'F','f':System.out.println("Has elegido F. Otras consultas");break;
            case 'G','g':System.out.println("Has elegido: G. Anulación"); break;
            default: System.out.println("Opción inválida"); break;           
        }
        System.out.println("****************************");        
/*
Solicitar al usuario que ingrese dos números.
Luego ofrecerle un menú con las siguientes opciones:
1-suma 2-resta 3-multiplicación 4-división
Finalmente, mostrar el resultado de la operación
aritmética elegida.
*/
    
        System.out.println("Ingrese dos número: \nPresionando enter después de cada uno de ellos ");
       
        double num1 = tecla.nextDouble();
        double num2 = tecla.nextDouble();
        
        System.out.println("Para realizar operaciones con sus números, ingrese la opción deseada:"
                + " \n 1. Realizar una suma, ingrese 1 \n 2. Realizar una resta, ingrese 2 "
                + "\n 3. Realizar una multiplicación, ingrese 3 \n 4. Realizar una división, ingrese 4");
        
        
        double operacion = tecla.nextDouble();
        char opcion = (char)operacion; 
                
        
        switch (opcion){
            case 1: System.out.println("La suma de sus dos números es: "+ (num1 + num2));break;
            case 2: System.out.println("La resta de sus dos números es: " + (num1 - num2));break;
            case 3: System.out.println("La multiplicación de sus dos números es: " + (num1 * num2));break;
            case 4: System.out.println("La división de sus dos números es: " + (num1 / num2));break;
            default: System.out.println("Opción inválida");
        }
                              
               
    }
}
