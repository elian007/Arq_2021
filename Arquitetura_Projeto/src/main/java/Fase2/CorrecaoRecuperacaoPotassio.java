
package Fase2;

public class CorrecaoRecuperacaoPotassio {
    
    public double ParticipacaoPotassioCTC(double potassio, double calcio, double magnesio, double HAL){
        
        return potassio/(calcio + magnesio + potassio + HAL) *100;
    }
    
   
}
