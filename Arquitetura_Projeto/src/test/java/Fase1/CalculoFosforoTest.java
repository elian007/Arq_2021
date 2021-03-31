/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase1;

import Fase1.Solo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author elian
 */
public class CalculoFosforoTest {
    
    private Solo solo;
    
    @BeforeEach
    public void solo() throws Exception{
        solo = new Solo();
    }
    
   @Test
   public void testeTeorMenorZeroZeroUm(){
       double fosforoNoSolo = 8.59, teorParaAtingir = 0;
       
       var resultado = solo.calculoFosforo(fosforoNoSolo, "Argiloso", teorParaAtingir);
       assertEquals(8.59, resultado);
   }
   @Test
   public void testeTeorMaiorZeroZeroUm(){
       double fosforoNoSolo = 8.59, teorParaAtingir = 10.0;
       
       var resultado = solo.calculoFosforo(fosforoNoSolo, "Argiloso", teorParaAtingir);
       assertEquals(10.0, resultado);
   }
}
