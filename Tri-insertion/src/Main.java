import java.util.Arrays;
public class Main {
     public static void main(String[] args) {
          System.out.print("\033[H\033[2J");
  
          int[] tableau = { 1, 3, 7, 2, 6, 4, 5, 8, 10, 9 };
  
          System.out.println("Tableau de test : " + Arrays.toString(tri(tableau)));
  
      }
     
    public static int[] tri(int[] tableau) 
    {  
         int taille = tableau.length;   
       
         for (int i = 1; i < taille; i++)
         { 
              int x = tableau[i];  
              int j = i-1;  
           
              while(j >= 0 && tableau[j] > x)  
              {
                   tableau[j+1] = tableau[j];  
                   j--;  
              }  
              tableau [j+1] = x; 
       }  
       return tableau;
    }
 
  
}