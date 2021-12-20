package week7;// Start of package
public class IfElseStatement01 {// Start of Class
    public static void main(String[] args) {// Start of method
        char gender = 'b';// ประกาศชนิดข้อมูล char ตัวแปร gender = b

        if (gender !='b') {
            //  ถ้า b ไม่ใช่ b  จะแสดงผลลัพธ์ ด้านล่างในปีกกา แต่ถ้าไม่ตรงกับคำสั่ง จะไป else และแสดงผลลัพธ์นั้นแทน
            
            System.out.println("Boy");//แสดงผลข้อความ
            
        } else {
            System.out.println("Girl");//แสดงผลข้อความ
        }
        
    } // End of main
} // End of class
