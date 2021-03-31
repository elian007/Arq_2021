package Fase1;


import Fase1.Solo;

/**
 *
 * @author elian
 */
public class Main {
    public static void main(String[] args) {
        Solo solo = new Solo();
        
        //testes Fósforo
        System.out.println("Após correção: " + solo.calculoFosforo(8.59, "Argiloso", 0));
        System.out.println("Após correção: " + solo.calculoFosforo(8.59, "Argiloso", 12.00));

        
        //testes Potassio
        // Entradas para o método:
        // potassioNoSolo, calcioNoSolo, magnesioNoSolo, HmaisAL,porcentoDesejadoPotassio
        //retorno desejado 0,39 de acordo com o primeito PDF de exemplo
        System.out.println("Após correção: " + solo.calculoPotassio(0.15, 5.76, 1.63, 5.35, 3));
    }
}
