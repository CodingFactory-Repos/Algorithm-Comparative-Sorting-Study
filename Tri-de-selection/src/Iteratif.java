import java.util.Arrays;
import java.util.Random;
public class Iteratif {
    public static float echanges = 0;
    public static float comparaisons = 0;
    public static float affectations = 3*echanges;


    
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
                    affectations+=1;
                }
                comparaisons+=1;
            }
            min = tableau[pos];
            tableau[pos] = tableau[i];
            tableau[i] = min;
            echanges += 1;
            affectations += 3;
        }
        return tableau;
    }
    public static void main(String[] args) {
        // write your code here
        // Clear console
        System.out.print("\033[H\033[2J");

        // Tableau de test
         int[] tableau = {1,2,3,4,5,6,7,8,9,10};
        // int[] tableau = {10,9,8,7,6,5,4,3,2,1};
        // int[] tableau = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Tableau de test : " + Arrays.toString(selectedSort(tableau)));
        System.out.println("Comparaisons : " + comparaisons);
        System.out.println("Echanges : " + echanges);
        System.out.println("Affectations : " + affectations );

        stat(10,20,5,10);

    }



    public static void stat(int min,int max, int step, int nbr) {
        int i;
        comparaisons = 0;
        echanges = 0;
        affectations = 0;
        for ( i = 1 ; i <= nbr ; i++) {
            int Tab[] =new Random().ints(min).toArray();
            selectedSort(Tab);
        }
        if (min < max && i>nbr) {
            System.out.println("Le nombre d'affectations pour " + min + " est de " + affectations/nbr);
            stat((min+step),max,step,nbr);
        } else {
            System.out.println("Le nombre d'affectations pour " + min + " est de " + affectations/nbr);
        }
    }
}
