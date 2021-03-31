/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase1;

import Fase1.Solo;
import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author elian
 */
public class CalculoPotassioTest {
    
     private Solo solo;
    
    @BeforeEach
    public void solo() throws Exception{
        solo = new Solo();
    }
    
   @Test
   public void PotassioNoSoloMenorZeroCinco(){
       double potassioNoSolo = 0.15, calcioNoSolo = 5.76, magnesioNoSolo = 1.63, HmaisAL = 5.35, porcentoDesejadoPotassio = 3;
       
       var resultado = solo.calculoPotassio(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL, porcentoDesejadoPotassio);
       
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(0.39), saida.format(resultado));
   }
   
    @Test
   public void PotassioNoSoloMaiorZeroCinco(){
       double potassioNoSolo = 0.6, calcioNoSolo = 5.76, magnesioNoSolo = 1.63, HmaisAL = 5.35, porcentoDesejadoPotassio = 3;
       
       var resultado = solo.calculoPotassio(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL, porcentoDesejadoPotassio);
       
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(0.6), saida.format(resultado));
   }
   
   @Test
   public void porcentoParticipacaoAtualPotassioCTCSolo(){
       double potassioNoSolo = 0.15, calcioNoSolo = 5.76, magnesioNoSolo = 1.63, HmaisAL = 5.35;
       
       var resultado = solo.porcentoParticipacaoAtualPotassioCTCSolo(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL);
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(1.16), saida.format(resultado));
   }
   
    @Test
    public void porcentoParticipacaoAtualPotassioCTCSolo2(){
       double potassioNoSolo = 0.6, calcioNoSolo = 5.76, magnesioNoSolo = 1.63, HmaisAL = 5.35;
       
       var resultado = solo.porcentoParticipacaoAtualPotassioCTCSolo(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL);
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(4.5), saida.format(resultado));
   }
   
    @Test
    public void equilibrioCorrecaoCTC(){
       double potassioNoSolo = 0.15, porcentoDesejadoPotassio = 3, porcentoAtualPotassioSolo = 1.2;
       
       var resultado = solo.equilibrioCorrecaoCTC(potassioNoSolo, porcentoDesejadoPotassio, porcentoAtualPotassioSolo);
       DecimalFormat saida = new DecimalFormat("0.00");
       assertEquals(saida.format(0.23), saida.format(resultado));
   }
}
