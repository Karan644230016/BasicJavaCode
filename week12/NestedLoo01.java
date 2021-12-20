package week12;//start of package

public class NestedLoo01 {//start of class
    public static void main(String[] args) {//start of main
        int number = 2;//ประกาศชนิดตัวแปร int ตัวแปร number  = 2
        for (number = 2; number <= 3; number++) {
            //คำสั่งวนรูป for เริ่มต้นที่ 2 เงื่อนไขไม่เกิน 3 โดยอัปเดตรอบเพิ่มทีละ 1
            for (int j = 1; j <= 12; j++) {
                //คำสั่งวนรูป for ประกาศชนิดตัวแปร int ตัวแปร j  เริ่มต้นที่ 1 เงื่อนไขไม่เกิน 12 โดยอัปเดตรอบเพิ่มทีละ 1
                System.out.println(number + " x " + j + " = " + number * j);
                //แสดงผล โดย for ที่อยุ่ด้านนอกจะเป็น แม่สูตรคูณ 2,3  ส่วน for ด้านในจะเป็นตัวคูณ 1 ถึง 12

            }//end of for ตัวใน
        }//end of for ตัวนอก
    }//end of main
}//end of class
