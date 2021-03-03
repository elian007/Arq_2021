/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elian
 */
public class rascunhoPotassioSequenciaTabela {
    
    /* Sequenciado (de acordo com a tabela) os calculos para potássio
    
    if(C6 = 1){
        string solo = "Argiloso";
        double ideal = 0.33;
    }
    if(C6 = 2){
        solo = "Textura Média";
                ideal = 0.25;
    }
    
    ======== Correção do solo ========
    Q16 -> =SEERRRO(T65, "")
    T65 -> AD29
    AD29 -> =SE(D11 > 0.5); D11; AD28)

    AD28 -> =SE('Memoria de Calculo'!F51 < 0.01); D11; SE('Memoria de Calculo'!F51 + D11)
    
    -> 'Memoria de Calculo'
            F51 -> =('Equilibrio e Correcao na CTC'!D11 * 'Equilibrio e Correcao na CTC'!N40/'Equilibrio e Correcao na CTC'!F34)- 'Equilibrio e Correcao na CTC'!D11
    
    D11 -> entrada de valor do potássio no solo
    N40 -> F35
    F35 -> Participacao do Potassio na CTC, desejada:
    F34 -> S16
    S16 -> =SEERRO(O10,"")
    O10 -> =D11/R6 * 100
    R6 -> R5 + L11
    R5 -> F11 + H11 + D11
    F11 -> entrada do valor de cálcio no solo
    H11 -> entrada do valor de magnésio no solo
    L11 -> entrada 'H + AL'
*/
}
