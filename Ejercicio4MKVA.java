/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fp.ejercicios;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio4MKVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        char sexo;
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese su sexo: ");
            sexo = sc.next().charAt(0);
        if(edad > 70){
            System.out.println("Vacuna tipo C");
        }
        if (edad >= 16 && edad < 70){
            if(sexo == 'F'){
                System.out.println("Vacuna tipo B"); 
            }
            if(sexo == 'M'){
                System.out.println("Vacuna tipo A"); 
            }
        }
        if(edad < 16){
            System.out.println("Vacuna tipo A"); 
        }
    }
    
}
