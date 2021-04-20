
package Fase2;

import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PotassioTest {
    
    @Test
    public void participacaoPotassioCTC(){
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        double resultado = new CorrecaoRecuperacaoPotassio().ParticipacaoPotassioCTC(0.15, 5.76, 1.63, 5.35);
        
        assertEquals(decimal.format(1.16), decimal.format(resultado));
    }
    
}
