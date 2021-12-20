package week11;// Start of package
import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)
public class IfElseStatementLogin02 {// Start of Class
    public static void main(String[] args) {// Start of method
        String Username = "root";// ประกาศชนิดข้อมูล String ตัวแปร username = root
        String Password = "1234";//ประกาศชนิดข้อมูล String ตัวแปร password = 1234

        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("Enter username : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        String username = kb.nextLine();
        System.out.print("Enter password : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        String password = kb.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
         System.out.println("You're logged in.");
        } else {
         System.out.println("Sorry, username or password is incorrect.");
        }
        kb.close();
    }
}