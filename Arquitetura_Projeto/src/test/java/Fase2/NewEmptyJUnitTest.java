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
       
        double valor = new CorrecaoRecuperacaoFosforo().qtdAplicarFosforo(12.0, new FonteFosforo().valorFosforo(1), 70.0, 8.59);
        
        assertEquals(decimal.format(123.95), decimal.format(valor));
    }
    
    @Test
    public void calcularCustoPorHectare(){
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        
        double kgPorHectare = new CorrecaoRecuperacaoFosforo().qtdAplicarFosforo(12.0, new FonteFosforo().valorFosforo(1), 70.0, 8.59);
        double custoPorHectare = new CorrecaoRecuperacaoFosforo().custoCorrecaoFosforo(1260.0, kgPorHectare);
        
        assertEquals(decimal.format(156.18), decimal.format(custoPorHectare));
    }
    
    @Test
    public void EnxofreCorrecaoFosforo(){
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        double enxofre = new CorrecaoRecuperacaoFosforo().enxofreKgHectare(1);
        
        assertEquals(decimal.format(12.4), decimal.format(enxofre));
    }
    
    @Test
    public void CalcioCorrecaoFosforo(){
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        double calcio = new CorrecaoRecuperacaoFosforo().calcioKgHectare(1, 123.95);
        
        assertEquals(decimal.format(34.71), decimal.format(calcio));

    }
}
