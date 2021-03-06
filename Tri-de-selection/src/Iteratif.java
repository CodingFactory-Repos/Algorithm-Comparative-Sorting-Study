import java.util.Arrays;
import java.util.Random;
public class Iteratif {
    public static float echanges = 0;
    public static float comparaisons = 0;
    public static float affectations = 3*echanges;
    public static float operations;


    
    public static int[] selectedSort(int[] tableau) {
        int i;
        int min;
        int v;
        int pos;
        
        
        
        for (i = 0; i < tableau.length - 1; i++) {
            pos = i;
            
            affectations+=1;
            comparaisons+=1;
            for (v = i + 1; v < tableau.length; v++) {
                if (tableau[v] < tableau[pos]) {
                    pos = v;
                    
                    comparaisons+=1;
                    affectations+=2;
                }
                comparaisons+=1;
            }
            min = tableau[pos];
            tableau[pos] = tableau[i];
            tableau[i] = min;
            echanges += 1;
            affectations += 4;
        }
        return tableau;
    }
    public static void main(String[] args) {
        // write your code here
        // Clear console
        System.out.flush();

        Random rand = new Random();
        
        // Tableau de test
        
        // int[] tableau = {10,9,8,7,6,5,4,3,2,1};
        int[] tableau = {1,2,3,4,5,6,7,8,9,10};
        // int[] tableau = { rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100) };
        
        // System.out.println("Tableau d'avant fonction : " + Arrays.toString(tableau));
        // System.out.println("Tableau après fonction : " + Arrays.toString(selectedSort(tableau)));
        // System.out.println("Comparaisons : " + comparaisons);
        // System.out.println("Echanges : " + echanges);
        // System.out.println("Affectations : " + affectations );
        // System.out.println("Opérations" + (echanges + affectations + comparaisons));

        stat(10,20,5,10);

    }



    public static void stat(int min,int max, int step, int nbr) {
        int i;

        for ( i = 1 ; i <= nbr ; i++) {
            int Tab[] =new Random().ints(min).toArray();
            selectedSort(Tab);
        }
        if (min < max && i>nbr) {
            System.out.println("Le nombre d'affectations pour " + min + " est de " + affectations/nbr);
            stat((min+step),max,step,nbr);
        } else {
            System.out.println("Le nombre d'affectations pour " + min + " est de " + affectations/nbr);
            System.out.println("Le nombre de comparaisons est de " + comparaisons/nbr);
            System.out.println("Le nombre d'echanges est de " + echanges/nbr);
        }
    }
}
