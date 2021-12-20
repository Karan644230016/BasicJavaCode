package week7;
import java.util.Scanner;
public class Ifnumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = kb.nextInt();

        if (n %2 == 0) {
            System.out.print(n + " = is even number (เลขคู่)");
            
        } else {
            System.out.println(n + " = is odd number (เลขคี่)");
            
        }
    }
    
}
