package week11;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Number = ");
        int number = kb.nextInt();
        int n = 1;
        System.out.println(number + "!");
        while (number <= number) {
            System.out.print("(" + number + ")" + " ");
            n = n * number;
            number--;
            if (number == 0)
                break;

        }
        System.out.println("\nAnswer = " + n);
        kb.close();
    }
}
