/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;

/**
 *
 * @author josuebarriosrodriguez
 */
public class Iva {
    
   static final double IVA =0.18;
   public void calcularIva(double precio){
       double resultado= precio*IVA;
       resultado= resultado +precio;
       
       System.out.println("El resultado con Iva es "  +resultado);
        
   }
    
}
