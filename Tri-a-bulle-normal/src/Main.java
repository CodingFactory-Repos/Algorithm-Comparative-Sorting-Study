import java.util.Arrays;
import java.util.Random;

public class Main {
        public static float echanges = 0;
        public static float comparaisons = 0;
        public static float affectations = 0;

        public static void main(String[] args) {
                // write your code here
                // Clear console
                System.out.print("\033[H\033[2J");

                // Tableau de test
                // int[] tab = { 4, 3, 2, 1};

                // System.out.println("Tableau de test : " + Arrays.toString(tri_bulleN(tab)));

                stat(10, 20, 5, 1);

        }

        public static int[] tri_bulleN(int[] tab) {
                int taille = tab.length;
                int tmp = 0;
                for (int i = 0; i < taille; i++) {

                        for (int j = 1; j < (taille - i); j++) {
                                if (tab[j - 1] > tab[j]) {
                                        tmp = tab[j - 1];
                                        tab[j - 1] = tab[j];
                                        tab[j] = tmp;

                                        echanges++;
                                        comparaisons++;
                                        affectations += 3;
                                }
                                comparaisons++;
                                affectations++;
                        }

                        affectations++;
                        comparaisons++;
                }

                // System.out.println("Il y a eu " + comparaisons + " comparaisons, " + echanges + " échange et " + affectations + " affectations");
                return tab;
        }

        public static void stat(int min, int max, int step, int nbr) {
                int i;
                comparaisons = 0;
                echanges = 0;
                affectations = 0;
                for (i = 1; i <= nbr; i++) {
                        int Tab[] = new Random().ints(min).toArray();
                        // int Tab[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                        // int Tab[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                        tri_bulleN(Tab);
                }
                if (min < max && i > nbr) {
                        System.out.println("Le nombre d'affectations pour " + min + " est de " + affectations / nbr);
                        stat((min + step), max, step, nbr);
                } else {
                        System.out.println("Le nombre d'affectations pour " + min + " est de " + affectations / nbr);
                        System.out.println("Le nombre de comparaisons est de " + comparaisons / nbr);
                        System.out.println("Le nombre d'echanges est de " + echanges / nbr);
                }
        }
}
