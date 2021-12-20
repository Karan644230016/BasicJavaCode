package week5;// Start of package
import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)
public class MathOperator {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard

        System.out.print("กรุณาป้อนตัวเลขที่1");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        float a = kb.nextFloat();// ประกาศชนิดข้อมูล float ตัวแปร a รับข้อมูลจากKeyboard
        System.out.print("กรุณาป้อนตัวเลขที่2");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        float b = kb.nextFloat();// ประกาศชนิดข้อมูล float ตัวแปร b รับข้อมูลจากKeyboard

        System.out.println("ค่าของตัวแปร a = " + a);// แสดงผลข้อความ +ข้อมูลจากตัวแปร
        System.out.println("ค่าของตัวแปร b = " + b);// แสดงผลข้อความ +ข้อมูลจากตัวแปร
        System.out.println("ผลบวก = " + (a+b));// แสดงผลข้อความ +ข้อมูลจากตัวแปร
        System.out.println("ผลลบ = " + (a-b));// แสดงผลข้อความ +ข้อมูลจากตัวแปร
        System.out.println("ผลคูณ = " + (a*b));// แสดงผลข้อความ +ข้อมูลจากตัวแปร
        System.out.println("ผลหาร = " + (a/b));// แสดงผลข้อความ +ข้อมูลจากตัวแปร
        System.out.println("ผลหารเอาเศษ = " + (a%b));// แสดงผลข้อความ +ข้อมูลจากตัวแปร
        kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class
