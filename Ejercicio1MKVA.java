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
public class Ejercicio1MKVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int exConocimiento, entPersonal, testPsicologico;
        float notas;
        System.out.println("Ingrese nota de examen de conocimiento: ");
        exConocimiento = sc.nextInt();
        System.out.println("Ingrese nota de entrevista personal: ");
        entPersonal = sc.nextInt();
        System.out.println("Ingrese nota de test psicologico: ");
        testPsicologico = sc.nextInt();
        notas = ((float)(exConocimiento*40)/100)+((float)(entPersonal*35)/100)+((float)(testPsicologico*25)/100);
        System.out.println("nota final: " + notas);
        
        if(notas >= 17){
            System.out.println("Nivel 4");
        }
        if(notas < 17 && notas >= 14){
            System.out.println("Nivel 3");
        }
        if(notas < 14 && notas >= 11){
            System.out.println("Nivel 2");
        }
        if(notas < 11){
            System.out.println("Nivel 1");
            System.out.println("No puede alcanzar una vacante");
        }
    }
    
}
