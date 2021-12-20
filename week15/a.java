package week15;
import java.util.Scanner;
public class a {
   public static void main (String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number");
        int x =kb.nextInt();
        
        int [] a =new int [2];
        for (int i = 0; i < a.length; i++) {
            
            System.out.println("Enter 1 ");
            a[i] = kb.nextInt();

            int z = a[i];
            z=a[i+1];
            System.out.println(a[i]);
            System.out.println(z);
        }
        
   }
          
      
    
   
    

}
