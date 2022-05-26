/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import com.mycompany.test1.Iva;
import java.util.Scanner;

/**
 *
 * @author Xime
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        //vamos a instanciar o llamar una clase
        com.mycompany.test1.Calculadora calculadora = new com.mycompany.test1.Calculadora();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresar numero 2");
        int numero2 = scanner.nextInt();
        calculadora.suma(numero1, numero2);
        calculadora.resta(numero1,numero2);
        calculadora.multiplicacion(numero1,numero2);
        calculadora.division(numero1, numero2);
        
        System.out.println("Ingrese el nombre ");
        String nombre =scanner.next();
        System.out.println("Ingresar apellido ");
        String apellido = scanner.next();
        System.out.println("Hola Bievenido " +nombre + " "+apellido);
        
        
        Iva calcularIva = new Iva ();
        System.out.println("Ingrese el precio del articulo");
        double precio =scanner.nextDouble();
        calcularIva.calcularIva(precio);
    }

}
