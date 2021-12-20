package week12;//start of package

public class Ex_WhileLoop01 {//start of class
    public static void main(String[] args) {//start of main
        int j = 1;  //ประกาศชนิดตัวแปร int ตัวแปร j =1
        while (j <= 10) { // คำสั่งวนรูป while เงือนไข  j<=10
            j = j + 3;  // j=1+3 
                        // j=4+3  โดย j ไม่เกิน 10
            System.out.print(j + " ");//แสดงผลข้อมูล +ข้อความ

        }//end of while
        System.out.println();//เว้นบรรทัด
        for (int i = 0; i <= 10; i = i + 2) {
            //คำสั่งวนรูป fori   มี3ส่วน ค่าเริ่มต้น เงื่อนไข  อัปเดตรอบ
            //ชนิดตัวแปร int ตัวแปร ร เริ่มต้นที่ 0 ไม่เกิน 10 อัปเดตโดยเพิ่มทีละ 2
            System.out.print(i + " ");//แสดงผลตัวแปร i 0 2 4 6 8 10
        }

        System.out.println();//เว้นบรรทัด
        for (int i = 10; i >= 0; i--) {// ชนิดตัวแปร int ตัวแปร i เริ่มต้นที่ 10 ถึง 0 โดยลบทีละ 1 
            System.out.print(i + " ");//แสดงผลตัวแปร i 10 9 8 7 6 5 4 3 2 1 0
        }//end of for

    }//end of main

}//end of class
