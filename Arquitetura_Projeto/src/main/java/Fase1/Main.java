package Fase1;

public class Main {
    public static void main(String[] args) {
        Solo solo = new Solo();
        System.out.println("Após correção: " + solo.calculoFosforo(8.59, "Argiloso", 0));
        System.out.println("Após correção: " + solo.calculoFosforo(8.59, "Argiloso", 12.00));

        System.out.println("Após correção: " + solo.calculoPotassio(0.15, 5.76, 1.63, 5.35, 3));
    }
}
