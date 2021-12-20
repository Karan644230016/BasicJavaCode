package week7;// Start of package
import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)
public class IfelseLogin {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("Enter username : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int username = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร username รับข้อมูลจากKeyboard
        System.out.print("Enter password : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int password = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร password รับข้อมูลจากKeyboard

        if (username == 123 && password == 1234) {
            //ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if ไป else
         System.out.println("You're logged in.");//แสดงผลข้อความ
        } else {
         System.out.println("Sorry, username or password is incorrect.");//แสดงผลข้อความ
        }
        kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class