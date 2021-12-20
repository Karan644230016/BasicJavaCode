package week5;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class InputFromKeyboard {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard 
        System.out.print("Enter your name : ");// แสดงผลข้อมูลที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        String name = kb.next();// ประกาศชนิดข้อมูล String ตัวแปร name รับข้อมูลจากKeyboard
        System.out.println("Hello " + name);// แสดงผลข้อความ +ข้อมูลจากตัวแปร name
        kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class
