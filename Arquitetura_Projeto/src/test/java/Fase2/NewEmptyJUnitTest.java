/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase2;

import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author elian
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void CalcularKgFosforoPorHectare(){
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        
        double valor = new CorrecaoRecuperacaoFosforo().qtdAplicarKgHectare(12.0, 18.0, 70.0, 8.59);
        
        assertEquals(decimal.format(123.95), decimal.format(valor));
    }
    
}
