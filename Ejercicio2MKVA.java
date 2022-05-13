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
public class Ejercicio2MKVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
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
    }
    
}
