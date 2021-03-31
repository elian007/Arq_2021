
package Fase1;

/**
 *
 * @author elian
 */
public class Solo {
    
    //============================Cálculos Fósforo====================================
    public double calculoFosforo(double fosforoNoSolo, String textura, double teorParaAtingir){
        double ideal;
        double soloCorrigido;
        
        if("Argiloso".equals(textura)){
            ideal = 9.0;
        }
        if("Textura Média".equals(textura)){
            ideal = 12.0;
        }
        
        if(teorParaAtingir > 0.01){
            return soloCorrigido = teorParaAtingir;
        }
        return fosforoNoSolo;
    }
    //==========================================================================
    //======================Cálculos Potássio===================================
    
    public double porcentoParticipacaoAtualPotassioCTCSolo(double potassioNoSolo, double calcioNoSolo, double magnesioNoSolo, double HmaisAL){
         
         return potassioNoSolo / ((potassioNoSolo + calcioNoSolo + magnesioNoSolo) + HmaisAL) * 100;
     }
    
    public double equilibrioCorrecaoCTC(double potassioNoSolo, double porcentoDesejadoPotassio, double porcentoAtualPotassioSolo){
        
        return (potassioNoSolo * porcentoDesejadoPotassio / porcentoAtualPotassioSolo) - potassioNoSolo;
   
    }
    
     public double memoriaDeCalculos(double potassioNoSolo, double correcaoCTC){
        double correcaoPotassio;
        
        if(correcaoCTC < 0.01){
            return potassioNoSolo;
        }
        
        correcaoPotassio = potassioNoSolo + correcaoCTC;
        
        return correcaoPotassio;
        
    }
     
     public double calculoPotassio(double potassioNoSolo, double calcioNoSolo, double magnesioNoSolo, double HmaisAL,double porcentoDesejadoPotassio){
        
        if(potassioNoSolo > 0.5){
            return potassioNoSolo;
        }
            double porcentoAtualPotassioSolo = porcentoParticipacaoAtualPotassioCTCSolo(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL);
            double equilibrioCorrecaoCTC = equilibrioCorrecaoCTC(potassioNoSolo, porcentoDesejadoPotassio, porcentoAtualPotassioSolo);
            double correcao = memoriaDeCalculos(potassioNoSolo, equilibrioCorrecaoCTC);
            
        return correcao;
    }
     
     
     //=========================================================================
     //=========================================================================
     /*
      public double calculoCalcio(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
       public double calculomagnesio(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
        public double calculoEnxofre(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
         public double calculoAluminio(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
          public double calculoHmaisAL(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
*/
}
