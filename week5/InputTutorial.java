package week5;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class InputTutorial {// Start of Class
    public static void main(String[] args) {// Start of method
        // ประกาศใช้งาน Class | new
        Scanner sc = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("Enter name : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        String name = sc.nextLine(); // รับค่า String จากแป้นพิมพ์ เก็บไว้ที่ตัวแปร name
        System.out.print("ป้อนปีเกิด พ.ศ. : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int year = sc.nextInt(); // รับค่า Integer จากแป้นพิมพ์ เก็บไว้ที่ตัวแปร year
        int age = 2564 - year; // คำนวณอายุ
        System.out.println("Your name = " + name);//แสดงผลข้อมูล
        System.out.println("ปี พ.ศ. ที่เกิด = " + year);//แสดงผลข้อมูล
        System.out.println("อายุ = " + age);//แสดงผลข้อมูล
    } // End of main
} // End of class
