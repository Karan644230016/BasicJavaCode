package week11;//start of package

public class WhileLoop_01 {//start of class
    public static void main(String[] args){ //start of main{
        
        int count = 1;//ประกาศชนิดตัวแปร int ตัวแปร count =1
        while (count <=10 ){//คำสั่งวนรูป โดยมีเงื่อนไข <=10
        
        System.out.print(count*2+" ");//แสดงผลข้อมูลโดยไม่ขึ้นบรรทัดใหม่ count* 2 ไปเรื่อยๆ
        count++;//อัปเดตรอบ เพิ่มค่า count ทีละ1 แต่ไม่เกิน 10 ตามเงื่อนไข
        }
    }//end of main
}//end of class
