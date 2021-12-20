package week7;// Start of package
public class IfStatement02 {// Start of Class
    public static void main(String[] args) {// Start of method
        int Age = 14;// ประกาศชนิดข้อมูล int ตัวแปร Age = 14
        //เขียน ifelse
        if (Age >=15) {//ถ้า Age >= 15 ตรงตามเงื่อไขจะแสดงผลลัพธ์ด้านล่าง
            System.out.println("Man/Woman");//แสดงผลข้อความ
            
        } else {//ถ้าไม่ตรงตามเงื่อนไขด้านบน จะมาแสดงผลลัพธ์ด้านล่างแทน
            System.out.println("Boy/Girl");//แสดงผลข้อความ
            
        }
        //if (Age <15) { เขียน if อย่างเดียว
        //    System.out.println("Mr/Miss");
        //}
        //if (Age >=15) {
        //    System.out.println("man/woman");
        //}
        System.out.println("End of Program");//แสดงผลข้อความ
    } // End of main
} // End of class
