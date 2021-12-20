package week5;// Start of package
import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class InputFromKeyboard2 {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard 
        System.out.print("Enter your ID : ");// แสดงผลข้อมูลที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        long id = kb.nextLong();// ประกาศชนิดข้อมูล long ตัวแปร id รับข้อมูลจากKeyboard
        System.out.print("Enter your name and surname : ");// แสดงผลข้อมูลที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        String name = kb.nextLine();// ประกาศชนิดข้อมูล String ตัวแปร name รับข้อมูลจากKeyboard
        System.out.print("Enter your address : ");// แสดงผลข้อมูลที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        String addr = kb.nextLine();// ประกาศชนิดข้อมูล String ตัวแปร addr รับข้อมูลจากKeyboard
        System.out.print("Enter your age : ");// แสดงผลข้อมูลที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int age = kb.nextInt();   // ประกาศชนิดข้อมูล int ตัวแปร age รับข้อมูลจากKeyboard
        System.out.print("Enter your GPA : ");// แสดงผลข้อมูลที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        double gpa = kb.nextDouble();// ประกาศชนิดข้อมูล Double ตัวแปร gpa รับข้อมูลจากKeyboard

        System.out.println(id+" "+name+" "+age+" "+gpa+" "+addr);//แสดงผลข้อมูลที่รับมาจาก keyboard
       // ปิดดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class
