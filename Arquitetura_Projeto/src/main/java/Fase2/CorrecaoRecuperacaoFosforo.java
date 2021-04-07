/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase2;

/**
 *
 * @author elian
 */
public class CorrecaoRecuperacaoFosforo {
   
    
    double qtdAplicarFosforo(
            double teorFosforoAtingir, 
            double fonteFosforo, 
            double eficienciaFosforo,
            double fosforoSolo
            ){
     
        double correcaoSolo;
        if((teorFosforoAtingir - fosforoSolo) < 0.01)
            correcaoSolo = 0.0;
        else
            correcaoSolo = ((teorFosforoAtingir - fosforoSolo) * 2.0) * 2.29;
        
       
        double aplicarCorrecao = (correcaoSolo*100.0) / (eficienciaFosforo/100.0) / 100.0;
        
        double KgPorHectareFosforo = (aplicarCorrecao * 100.0)/ fonteFosforo;
        
        return KgPorHectareFosforo;
    }
    
    double custoCorrecaoFosforo(double valorTonelada, double qtdFosforoKg){
        return valorTonelada * (qtdFosforoKg/1000);
    }
    
    
    double enxofreKgHectare(int fonte) {
        double enxofre;
        double fosforoKgHectare = qtdAplicarFosforo(12.0, new FonteFosforo().valorFosforo(1), 70.0, 8.59);
        double alqueire = fosforoKgHectare * 2.42;

        switch (fonte) {
            case 1:
                enxofre = (alqueire * 0.1)/2.42;
                return enxofre;
            case 5:
                enxofre = fosforoKgHectare * 0.15;
                return enxofre;
            case 12:
                enxofre = (alqueire * 0.11)/2.42;
                return enxofre;
            default:
                enxofre = 0.0;
                return enxofre;
        }
    }
    
    double calcioKgHectare(int fonte, double fosforoKgHectare){
        
        double valorCalcio = new FonteFosforo().valorCalcio(fonte);
        double calcioKgHectare = fosforoKgHectare * valorCalcio;
        return calcioKgHectare;
    }
}
