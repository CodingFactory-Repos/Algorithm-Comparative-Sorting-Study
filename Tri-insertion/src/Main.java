import java.util.Arrays; 
import java.util.Random;
public class Main {
	public static float affectation = 0;
	public static float echanges= 0;
	public static float comparaison = 0;
     public static void main(String[] args) {
          System.out.print("\033\033");
  
          int[] tableau = {  10,9,8,7,6,5,4,3,2,1 };
  
          System.out.println("Tableau de test : " + Arrays.toString(triInsertion(tableau)));
          System.out.println("Nombre d'échanges : "+ echanges);
          System.out.println("Nombre de comparaisons :" + comparaison);
          System.out.println("Nombre d'affectations :" + affectation);
         stat(10,20,5,10);
  
      }
     
    public static int[] triInsertion(int[] tableau) 
    {  
         int taille = tableau.length; 
        
       
         for (int i = 1; i < taille; i++)
         { 
              int x = tableau[i];  
              int j = i-1; 
    
              affectation += 2;
              comparaison++;
              
           
              while(j >= 0 && tableau[j] > x)  
              {
                   tableau[j+1] = tableau[j]; 
                   j--;  
                   echanges++;
                   affectation+=1;
                   comparaison+=2;
                   } 

              tableau [j+1] = x;
              
       }  
                return tableau;
    }
    
    public static void stat(int min,int max, int step, int nbr) {
        int i;
        affectation = 0;
	    echanges= 0;
	    comparaison = 0;
  
        for ( i = 1 ; i <= nbr ; i++) {
            int tableau[] =new Random().ints(min).toArray();
            triInsertion(tableau); 
        }
        if (min < max && i>nbr) {
            System.out.println("Le nombre d'affectations pour " + min + " est de " + affectation/nbr);
            stat((min+step),max,step,nbr);
        } else {
            System.out.println("Le nombre d'affectations pour " + min + " est de " + affectation/nbr);
        }

  
}
}
