
import Model.Solo;

/**
 *
 * @author elian
 */
public class Main {
    public static void main(String[] args) {
        Solo solo = new Solo();
        
        System.out.println("Após correção: " + solo.calculoFosforo(8.59, "Argiloso", 0));
        System.out.println("Após correção: " + solo.calculoFosforo(8.59, "Argiloso", 12.00));

    }
}
