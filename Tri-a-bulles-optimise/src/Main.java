// Import Arrays
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Clear console
        System.out.print("\033\033");

        // Tableau de test
        int[] tableau = { 1, 3, 7, 2, 6, 4, 5, 8, 10, 9 };

        System.out.println("Tableau de test : "+Arrays.toString(triBulle(tableau)));

    }

    public static int[] triBulle(int [] tableau) {
        int n = tableau.length;
        boolean echange = true;
        while (echange) {
            echange = false;
            for (int i = 0; i < n - 1; i++) {
                if (tableau[i] > tableau[i + 1]) {
                    int temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    echange = true;
                }
            }
        }

        // Return le resultat
        return tableau;
    }
}
