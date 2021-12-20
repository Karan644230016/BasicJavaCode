package week7;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)
public class IfStateMent03 {// Start of Class
    public static void main(String [] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("กรุณาป้อนอายุของท่าน : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int age = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร age รับข้อมูลจากKeyboard
        if (age >= 15) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if นี้
            System.out.println("วัยรุ่น");//แสดงผลข้อความ
        } 
        if (age >= 20) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if นี้
            System.out.println("วัยหนุ่มสาว");//แสดงผลข้อความ
        } 
        if (age >= 30) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if นี้
            System.out.println("วัยทำงาน");//แสดงผลข้อความ
        } 
        if (age >= 40) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if นี้
            System.out.println("วัยกลางคน");//แสดงผลข้อความ
        } 
        if (age >= 60) {//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if นี้
            System.out.println("วัยชรา");//แสดงผลข้อความ
        } 

        System.out.println("End of Program");//แสดงผลข้อความ
    } // End of main
} // End of class
