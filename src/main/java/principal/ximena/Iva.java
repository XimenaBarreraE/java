package principal.ximena;

public class Iva {
    
   static final double IVA =0.18;
   public void calcularIva(double precio){
       double resultado= precio*IVA;
       resultado= resultado +precio;
       
       System.out.println("El resultado con Iva es "  +resultado);
        
   }
    
}
