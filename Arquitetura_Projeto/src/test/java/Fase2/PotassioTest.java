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
public class PotassioTest {
    
    @Test
    public void participacaoPotassioCTC(){
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        double resultado = new CorrecaoRecuperacaoPotassio().ParticipacaoPotassioCTC(0.15, 5.76, 1.63, 5.35);
        
        assertEquals(decimal.format(1.16), decimal.format(resultado));
    }
    
}
