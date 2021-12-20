package week11;//start of package

public class WhileTrue {//start of class
    public static void main(String[] args) {//start of main
        int count=1;//// ประกาศชนิดข้อมูล int ตัวแปร count = 1
        while (true) {//คำสั่งวนรูป เป็นจริง
            
            System.out.println("รอบที่ "+count+" Hello World");//แสดงขอความ + ข้อมูลจำนวนรอบ
            count++;//อัปเดตรอบ เพิ่มค่า count ทีละ1
            if (count==20) {
                break;// ถ้า ค่าcount== 20 จะหยุดทันที
            }//end of if
        }//end of while
    }//end of main
}//end of class