/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author elian
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void test(){
        assertEquals(123.95079365079366, new CorrecaoRecuperacaoFosforo().qtdAplicarKgHectare(12.0, 18.0, 70.0, 8.59));
    }
    
}
