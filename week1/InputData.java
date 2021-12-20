package week1;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class InputData {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner sc = new Scanner(System.in);//รับเข้าข้อมูลจาก Keyboard มาอยู่ในตัวแปร sc

        System.out.print("enter name = ");//แสดงผลข้อความ
        String name = sc.nextLine();//ประกาศชนิดข้อมูล String ตัวแปร name รับข้อมูลจากตัวแปร sc (Keyboard)

        System.out.println("===> "+name);//แสดงผลข้อความ +ด้วยข้อความจากKeyboard
    } // End of main
} // End of class