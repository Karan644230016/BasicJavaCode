package week11;// Start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class WhileTrue_KB {// Start of Class
    public static void main(String[] args) {// Start of method
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard

        while (true) {//วนรูป while เงื่อนไขเป็นจริง
            
            System.out.print("Enter number");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
            int number = kb.nextInt();// ประกาศชนิดข้อมูล int ตัวแปร number รับข้อมูลจาก Keyboard

            if (number ==0) {
                break;// ถ้า number = 0 จะหยุดทันที เพราะใช้คำสั่ง break
                
                
            }//end of if
        }//end of while
        
    }//end of main
}//end of class
