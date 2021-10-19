import java.util.Arrays;
public class Main {

    
    public static int[] selectedSort(int[] tableau) {
        int i;
        int min;
        int v;
        int pos;
        
        
        
        for (i = 0; i < tableau.length - 1; i++) {
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
        return tableau;
    }
    public static void main(String[] args) {
        // write your code here
        // Clear console
        System.out.print("\033[H\033[2J");

        // Tableau de test
        int[] tableau = { -1,6,29,9,7,8,5,-3,4,2,1,30,-30};

        System.out.println("Tableau de test : "+Arrays.toString(selectedSort(tableau)));

    }
}
