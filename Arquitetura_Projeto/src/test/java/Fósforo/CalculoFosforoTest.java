/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fósforo;

import Model.Solo;
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
       var resultado = solo.calculoFosforo(8.59, "Argiloso", 0);
       assertEquals(8.59, resultado);
   }
   @Test
   public void testeTeorMaiorZeroZeroUm(){
       var resultado = solo.calculoFosforo(8.59, "Argiloso", 10.0);
       assertEquals(10.0, resultado);
   }
}
