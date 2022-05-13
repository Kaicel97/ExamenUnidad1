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
public class Ejercicio5MKVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean condicion = true;
        while(condicion){
            System.out.println("-----------------MENU---------------");
            System.out.println("[1] Ejercicio 1");
            System.out.println("[1] Ejercicio 2");
            System.out.println("[1] Ejercicio 3");
            System.out.println("[1] Ejercicio 4");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                  System.out.println("EJERCICIO 1");
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
                  break;
                case 2:
                    System.out.println("EJERCICIO 2");
                    
                    double IGV, PrecioProducto, MontoTotal;
                    double Descuento = 0;
                    System.out.println("Ingrese precio del producto: ");
                    PrecioProducto = sc.nextDouble();

                    if(PrecioProducto > 2000){
                        Descuento = PrecioProducto*0.10;
                    }
                    if(PrecioProducto > 1000){
                        Descuento = PrecioProducto*0.10;
                    }
                    if(PrecioProducto > 500){
                        Descuento = PrecioProducto*0.2;
                    }
                    IGV = PrecioProducto*0.18;
                    MontoTotal = (PrecioProducto + IGV) - Descuento;

                    System.out.println("El IGV es: " + IGV);
                    System.out.println("El descuento es: " + Descuento);
                    System.out.println("El monto total a pagar es: " + MontoTotal);
                    
                    break;
                case 3:
                    System.out.println("EJERCICIO 3");
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
                    break;
                case 4:
                    System.out.println("EJERCICIO 4");
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
                    break;
            }
        }
    }
    
}
