package week12;//start of package

import java.util.Scanner;//Start of import (นำเข้าข้อมูลจาก Keyboard)

public class Factorial {//start of class
    public static void main(String[] args) {//start of main
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก Keyboard
        System.out.print("Enter Number : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
        int number = kb.nextInt();// ประกาศชนิดข้อมูล int  ตัวแปร number รับข้อมูลจาก Keyboard

        int i = 1;//ปรพกาศชนิดตัวแปร int ตัวแปร  i =1
        int result=1;//ปรพกาศชนิดตัวแปร int ตัวแปร  result =1

        System.out.print(number+"! ==> ");//แสดงผลข้อความ
        while (i <=number) {//คำสั่งวนรูป เงื่อนไข 1<=number
            if (i==number) {//ถ้า 1 == number จะแสดงผล 1
                System.out.print(i);
            } else {//ถ้าไม่ตรงตามเงื่อนไข if จะมาทำที่ else
                System.out.print(i+"x");// แสดงผล 1x  2x 3x ...
            }
            
            result = result*i;//result  = 1+1 2+1 3+1 ไปเรือยๆ จนตามเงื่อนไข while
            i++;//เพิ่มค่า i ทีละ 1
        }// end of while
        System.out.println(" = "+result);//แสดงผลลัพธ์สุดท้าย
    }//end of main
}//end of class
