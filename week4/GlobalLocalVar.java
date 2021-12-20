package week4;// Start of package

public class GlobalLocalVar {// Start of Class
    public static void main(String[] args) {// Start of method
        // Global Variable
        int a = 100; //ประกาศชนิดตัวแปร int ตัวแปร a  ค่าของตัวแปร 100
        int b = 200;//ประกาศชนิดตัวแปร int ตัวแปร b  ค่าของตัวแปร 200
        System.out.println(a); //แสดงผลข้อมูลของตัวแปร a
 
        {
            // Local Variable วงจรชีวิตของ ตัวแปร c จะทำงานเฉพาะในบรรทัดที่ 8-13 เท่านั้น
            int c = 300; //ประกาศชนิดตัวแปร int ตัวแปร c  ค่าของตัวแปร 300
            System.out.println(c);//แสดงผลข้อมูลของตัวแปร c
            System.out.println("A = " + a); // เรียกใช้ได้ เพราะวงจรชีวิตของ a อยู่ในช่วงของปีกกาตั้งแต่เปิดถึงปิดอันแรก
        }
        System.out.println(b);//แสดงผลข้อมูลของตัวแปร b
        // System.out.println(c); // หาไม่เจอ เพราะวงจรชีวิตของ c จบตตั้งแต่บันทัดที่ 13
    } // End of main
} // End of class