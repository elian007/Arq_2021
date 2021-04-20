
package Fase1;

public class Solo {
    
    double calculoFosforo(double fosforoNoSolo, String textura, double teorParaAtingir){
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
    
    double porcentoParticipacaoAtualPotassioCTCSolo(double potassioNoSolo, double calcioNoSolo, double magnesioNoSolo, double HmaisAL){
         
         return potassioNoSolo / ((potassioNoSolo + calcioNoSolo + magnesioNoSolo) + HmaisAL) * 100;
     }
    
     double equilibrioCorrecaoCTC(double potassioNoSolo, double porcentoDesejadoPotassio, double porcentoAtualPotassioSolo){
        
        return (potassioNoSolo * porcentoDesejadoPotassio / porcentoAtualPotassioSolo) - potassioNoSolo;
   
    }
    
     double memoriaDeCalculos(double potassioNoSolo, double correcaoCTC){
        double correcaoPotassio;
        
        if(correcaoCTC < 0.01){
            return potassioNoSolo;
        }
        
        correcaoPotassio = potassioNoSolo + correcaoCTC;
        
        return correcaoPotassio;
        
    }
     
     double calculoPotassio(double potassioNoSolo, double calcioNoSolo, double magnesioNoSolo, double HmaisAL,double porcentoDesejadoPotassio){
        
        if(potassioNoSolo > 0.5){
            return potassioNoSolo;
        }
            double porcentoAtualPotassioSolo = porcentoParticipacaoAtualPotassioCTCSolo(potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL);
            double equilibrioCorrecaoCTC = equilibrioCorrecaoCTC(potassioNoSolo, porcentoDesejadoPotassio, porcentoAtualPotassioSolo);
            double correcao = memoriaDeCalculos(potassioNoSolo, equilibrioCorrecaoCTC);
            
        return correcao;
    }
}
