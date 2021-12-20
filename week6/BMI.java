package week6;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class BMI {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("ป้อนน้ำหนัก(kg) : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        float x = kb.nextInt();// ประกาศชนิดข้อมูล flaot ตัวแปร x รับข้อมูลจากKeyboard
        System.out.print("ป้อนส่วนสูง(m)  : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        float y = kb.nextInt();// ประกาศชนิดข้อมูล float ตัวแปร y รับข้อมูลจากKeyboard
        y = y / 100; // นำค่าที่ได้จากตัวแปร y/100
        float z = x / (y * y);// ประกาศชนิดข้อมูล float ตัวแปร z นำ x/(y*y)

        System.out.println("น้ำหนัก = " + x);// แสดงผลข้อความ +ผลลัพธ์
        System.out.println("ส่วนสูง = " + y);// แสดงผลข้อความ +ผลลัพธ์
        System.out.println("ดัชนีมวลกาย (BMI) = " + z);// แสดงผลข้อความ +ผลลัพธ์

        kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class