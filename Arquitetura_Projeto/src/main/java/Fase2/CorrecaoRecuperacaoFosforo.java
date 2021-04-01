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
   
    
    public double qtdAplicarKgHectare(
            double teorFosforoAtingir, 
            double fonteFosforo, 
            double eficienciaFosforo,
            double fosforoSolo
            ){
     
        double e10;
        if((teorFosforoAtingir - fosforoSolo) < 0.01)
            e10 = 0.0;
        else
            e10 = teorFosforoAtingir - fosforoSolo;
        
        double n72 = e10 * 2;
        double g14 = n72 * 2.29;
        double h16 = g14*100/eficienciaFosforo/100;
        
        double b22 = h16 * 100/ fonteFosforo;
        
        return b22;
    }
    
}
