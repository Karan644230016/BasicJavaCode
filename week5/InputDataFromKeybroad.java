package week5;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class InputDataFromKeybroad {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard มาอยู่ในตัวแปร kb
        System.out.print("Please input StudenID : ");// แสดงผลข้อมูลให้สอดคล้องกับรับข้อมูลจาก keyboard
        String id = kb.nextLine();// ประกาศชนิดข้อมูล String ตัวแปร id รับข้อมูลจากตัวแปร kb (Keyboard)

        System.out.print("Please input Name : ");// แสดงผลข้อมูลให้สอดคล้องกับรับข้อมูลจาก keyboard
        String name = kb.nextLine();// ประกาศชนิดข้อมูล String ตัวแปร name รับข้อมูลจากตัวแปร kb (Keyboard)

        System.out.print("Please input birth day : ");// แสดงผลข้อมูลให้สอดคล้องกับรับข้อมูลจาก keyboard
        int year = kb.nextShort();// ประกาศชนิดข้อมูล int ตัวแปร year รับข้อมูลจากตัวแปร kb (Keyboard)

        System.out.print("Please input GPA : ");// แสดงผลข้อมูลให้สอดคล้องกับรับข้อมูลจาก keyboard
        double gpa = kb.nextFloat();// ประกาศชนิดข้อมูล double ตัวแปร gpa รับข้อมูลจากตัวแปร kb (Keyboard)

        int age = 2564 - year;//ประกาศชนิดตัวแปร int ตัวแปร age ค่าของตัวแปร = 2564-year (ข้อมูลที่รับเข้าจาก keyboard)

        System.out.println("Your StudentID\t: " + id);// แสดงผลข้อมูล
        System.out.println("Your Name\t: " + name);// แสดงผลข้อมูล
        System.out.println("Your Age\t: " + year);// แสดงผลข้อมูล
        System.out.println("Your GPA\t: " + gpa);// แสดงผลข้อมูล
        kb.close();// ปิดรับเข้าข้อมูลจาก Keyboard
    } // End of main
} // End of class