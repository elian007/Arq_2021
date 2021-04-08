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
public class CorrecaoRecuperacaoPotassio {
    
    public double ParticipacaoPotassioCTC(double potassio, double calcio, double magnesio, double HAL){
        
        return potassio/(calcio + magnesio + potassio + HAL) *100;
    }
    
}
