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
   
    
    double qtdAplicarKgHectare(
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
    
}
