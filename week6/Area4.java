package week6;// Start of package
import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)
public class Area4 {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner (System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("Enter X : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int x = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร x รับข้อมูลจากKeyboard
        System.out.print("Enter Y : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int y = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร y รับข้อมูลจากKeyboard
        
        int z = x*y;// ประกาศชนิดข้อมูล int ตัวแปร z นำข้อมูลจากตัวแปร x*y
        System.out.println("Answer is : " +x+ " X "+y+ " = " +z);//แสดงผลข้อความ +ข้อมูลจากตัวแปร
    } // End of main
} // End of class
