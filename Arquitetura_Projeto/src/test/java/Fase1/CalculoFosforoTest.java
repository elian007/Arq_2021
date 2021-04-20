
package Fase1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculoFosforoTest {
    
    
   @Test
   public void testeTeorMenorZeroZeroUm(){
       double fosforoNoSolo = 8.59, teorParaAtingir = 0;
       
       var resultado = new Solo().calculoFosforo(fosforoNoSolo, "Argiloso", teorParaAtingir);
       assertEquals(8.59, resultado);
   }
   @Test
   public void testeTeorMaiorZeroZeroUm(){
       double fosforoNoSolo = 8.59, teorParaAtingir = 10.0;
       
       var resultado = new Solo().calculoFosforo(fosforoNoSolo, "Argiloso", teorParaAtingir);
       assertEquals(10.0, resultado);
   }
}