// Import Arrays
import java.util.Arrays;
import java.util.Random;

public class Iteratif {
	
	public static float comparaisons;
	public static float echanges;
	public static float affectations;

    public static void main(String[] args) {
        // write your code here
        // Clear console
        System.out.print("\033\033");
        
        Random rand = new Random();

        // Tableau de test
        int[] tableau = { rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100) };
        // int[] tableau = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(triBulle(tableau)));
        
        stat(10, 20, 5, 10);
      
        // System.out.println("Résultat de " + comparaisons + " comparaisons, " + echanges + " échanges et " + (echanges * 3) + " affectations");
    }

    public static int[] triBulle(int [] tableau) {
        int n = tableau.length;
        
        boolean echange = true;
        while (echange) {
            echange = false;
            for (int i = 0; i < n - 1; i++) {
            	comparaisons++;
                if (tableau[i] > tableau[i + 1]) {
                	echanges++;
                    int temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    echange = true;
                }
            }
        }
        
        return tableau;
    }
    
    public static void stat(int min,int max, int step, int nbr) {
        int i;
        for ( i = 1 ; i <= nbr ; i++) {
            int Tab[] =new Random().ints(min).toArray();
            triBulle(Tab);
        }
        if (min < max && i>nbr) {
            stat((min+step),max,step,nbr);
        } else {
            System.out.println("Le nombre de comparaisons est de " + comparaisons/nbr);
            System.out.println("Le nombre d'échanges est de " + echanges/nbr);
            
            if (min < max && i>nbr) {
                System.out.println("Le nombre d'affectations pour " + min + " est de " + (echanges * 3)/nbr);
                stat((min+step),max,step,nbr);
            } else {
                System.out.println("Le nombre d'affectations pour " + min + " est de " + (echanges * 3)/nbr);
            }
        }
	}
}
