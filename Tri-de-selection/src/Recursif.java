import java.util.Arrays;
public class Recursif {
    public static int Opérations = 0;
    public static int Comparaisons = 0;
    public static int Affectations = 0;

    
    public static int[] selectedSort(int[] tableau, int i) {
        int min;
        int v;
        int pos;
  
        if (i < tableau.length - 1) {
            pos = i;
            for (v = i + 1; v < tableau.length; v++) {
                if (tableau[v] < tableau[pos]) {
                    pos = v;
                }
            }
            min = tableau[pos];
            tableau[pos] = tableau[i];
            tableau[i] = min;
        }
        if (i < tableau.length - 1) {
            selectedSort(tableau, i+1);
        }
        return tableau;
    }
    public static void main(String[] args) {
        // write your code here
        // Clear console
        System.out.print("\033[H\033[2J");

        // Tableau de test
        int[] tableau = { -1,6,29,9,7,8,5,-3,4,2,1,30,-30};

        System.out.println("Tableau de test : " + Arrays.toString(selectedSort(tableau, 0)));

    }
}
