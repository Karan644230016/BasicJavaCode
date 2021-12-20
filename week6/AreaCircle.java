package week6;// Start of package
import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)
public class AreaCircle {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        final float PI = 3.141f;// ประกาศชนิดข้อมูล float ตัวแปร PI ค่าของตัวแปรสุดท้าย = 3.141

        System.out.print("Enter radius : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int radius = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร radius รับข้อมูลจากKeyboard

        float result = PI*radius*radius;// ประกาศชนิดข้อมูล float ผลลัพธ์  3.141*radius*radius


        System.out.println("Result : "+ result);// แสดงผลข้อความ +ผลลัพธ์
        kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class