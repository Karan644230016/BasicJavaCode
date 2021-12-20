package week11;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class IfElse_Login {// Start of Class
    public static void main(String[] args) {// Start of method
        String username_db = "root";// ประกาศชนิดข้อมูล String ตัวแปร username_db = root
        String password_db = "555";// ประกาศชนิดข้อมูล String ตัวแปร password_db = 555

        Scanner kb = new Scanner (System.in);// รับเข้าข้อมูลจาก Keyboard

        System.out.print("Enter username = ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        String username = kb.nextLine();// ประกาศชนิดข้อมูล String ตัวแปร userame รับข้อมูลจาก Keyboard
        System.out.print("Enter username = ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        String password = kb.nextLine();// ประกาศชนิดข้อมูล String ตัวแปร password รับข้อมูลจาก Keyboard

        if (username.equals(username_db) && password.equals(password_db)){
            //equals เปรียนเทียบว่าตรงกันมั้ย

            //ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if ไป else 
            System.out.println("You are login");//แสดงผลข้อความ
        }else{//ถ้าตรงตามเงื่อนไขจะแสดงผลด้านล่าง แต่ถ้าไม่ตรงจะออกจาก if ไป else 
            System.out.println("You are not admin");//แสดงผลข้อความ
        }
    } // End of main
} // End of class