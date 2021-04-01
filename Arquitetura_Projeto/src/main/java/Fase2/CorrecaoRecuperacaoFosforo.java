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
     
        double h11;
        if((teorFosforoAtingir - fosforoSolo) < 0.01)
            h11 = 0.0;
        else
            h11 = teorFosforoAtingir - fosforoSolo;
        
        double n72 = h11 * 2.0;
        double g14 = n72 * 2.29;
        double h16 = g14*100.0/(eficienciaFosforo/100)/100.0;
        
        double b22 = (h16 * 100.0)/ fonteFosforo;
        
        return b22;
    }
    
}
