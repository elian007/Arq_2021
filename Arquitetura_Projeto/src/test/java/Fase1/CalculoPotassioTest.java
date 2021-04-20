
package Fase1;

import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculoPotassioTest {
  
   @Test
   public void PotassioNoSoloMenorZeroCinco(){
       double potassioNoSolo = 0.15, calcioNoSolo = 5.76, magnesioNoSolo = 1.63, HmaisAL = 5.35, porcentoDesejadoPotassio = 3;
       
       var resultado = new Solo().calculoPotassio(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL, porcentoDesejadoPotassio);
       
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(0.39), saida.format(resultado));
   }
   
    @Test
   public void PotassioNoSoloMaiorZeroCinco(){
       double potassioNoSolo = 0.6, calcioNoSolo = 5.76, magnesioNoSolo = 1.63, HmaisAL = 5.35, porcentoDesejadoPotassio = 3;
       
       var resultado = new Solo().calculoPotassio(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL, porcentoDesejadoPotassio);
       
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(0.6), saida.format(resultado));
   }
   
   @Test
   public void porcentoParticipacaoAtualPotassioCTCSolo(){
       double potassioNoSolo = 0.15, calcioNoSolo = 5.76, magnesioNoSolo = 1.63, HmaisAL = 5.35;
       
       var resultado = new Solo().porcentoParticipacaoAtualPotassioCTCSolo(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL);
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(1.16), saida.format(resultado));
   }
   
    @Test
    public void porcentoParticipacaoAtualPotassioCTCSolo2(){
       double potassioNoSolo = 0.6, calcioNoSolo = 5.76, magnesioNoSolo = 1.63, HmaisAL = 5.35;
       
       var resultado = new Solo().porcentoParticipacaoAtualPotassioCTCSolo(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL);
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(4.5), saida.format(resultado));
   }
   
    @Test
    public void equilibrioCorrecaoCTC(){
       double potassioNoSolo = 0.15, porcentoDesejadoPotassio = 3, porcentoAtualPotassioSolo = 1.2;
       
       var resultado = new Solo().equilibrioCorrecaoCTC(potassioNoSolo, porcentoDesejadoPotassio, porcentoAtualPotassioSolo);
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(0.23), saida.format(resultado));
   }
}
