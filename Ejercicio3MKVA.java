/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fp.ejercicios;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author usuario
 */
public class Ejercicio3MKVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        double suma,resta, division, multiplicacion, potencia, RaizCuadrada, modulo;
        char signo;
        System.out.println("Ingrese el valor 1: ");
        valor1 = sc.nextInt();
        System.out.println("Ingrese el valor 2: ");
        valor2 = sc.nextInt();
        System.out.println("Ingrese el signo: ");
        signo = sc.next().charAt(0);
        switch (signo) {
            case '+': 
                System.out.println("Debes sumar");
                suma = valor1 + valor2;
                System.out.println("La suma es: " + suma);
                break;
            case '-': 
                System.out.println("Debes restar");
                resta = valor1 - valor2;
                System.out.println("La resta es: " + resta);
                break;
            case '/': 
                System.out.println("Debes dividir");
                division = valor1 / valor2;
                System.out.println("La division es: " + division);
                break;
            case '*': 
                System.out.println("Debes multiplicar");
                multiplicacion = valor1*valor2;
                System.out.println("La multiplicacion es: " + multiplicacion);
                break;
            case '^': 
                System.out.println("Debes calcular la potencia");
                potencia = Math.pow(valor1,valor2);
                System.out.println("La potencia es: " + potencia);
                break;
            case 'R': 
                System.out.println("Debes calcular la raiz cuadrada");
                RaizCuadrada = Math.sqrt(valor1);
                System.out.println("La raiz cuadrada es: " + RaizCuadrada);
                break;
            case '%': 
                System.out.println("Debes calcular el modulo de 2");
                modulo = Math.floorMod(valor1,valor2);
                System.out.println("El modulo es: " + modulo);
                break;
        }
    }
    
}
