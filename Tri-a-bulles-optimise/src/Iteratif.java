// Import Arrays
import java.util.Arrays;
import java.util.Random;

public class Iteratif {

    public static void main(String[] args) {
        // write your code here
        // Clear console
        System.out.print("\033\033");
        
        Random rand = new Random();

        // Tableau de test
        int[] tableau = { rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100) };

        triBulle(tableau);
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
        
        System.out.println(Arrays.toString(tableau));
        
        return tableau;
    }
}
