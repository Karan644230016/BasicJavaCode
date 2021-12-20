package week12;
import java.util.Scanner;
public class Year {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("กรุณาใส่ พ.ศ. = ");
            int year = kb.nextInt();
            if (year == 0) {
                System.out.println("End Of Program");
                break;
            }
            int a = year - 543;
            System.out.println("พ.ศ." + year + " = ค.ศ." + a);
        }
        kb.close();
    }
}
