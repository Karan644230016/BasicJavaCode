package week3;// Start of package

public class RuleOfName {// Start of Class
    public static void main(String[] args) {// Start of method

        // ประกอบด้วยตัวเลข ตัวอักษร เครื่องหมาย

        int num1$ = 100; //ประกาศชนิดตัวแปร int ตัวแปร num1$ ค่าข้อมูล=100
        System.out.println(num1$); //แสดงผลข้อมูลในตัวแปร num1$

        // อักษรตัวแรกห้ามขึ้นต้นด้วยตัวเลข และสัญญลักษณ์พิเศษ ยกเว้น _ และ $
        // int 1num$=200; //แบบนี้ไม่ได้
        // int %num=300; //แบบนี้ไม่ได้
        // System.out.println(1num1$); //แบบนี้ไม่ได้
        // System.out.println(%num); //แบบนี้ไม่ได้

        // ห้ามซ้ำกับคำสงวน
        // int this=100; // แบบนี้ไม่ได้
        // System.out.println(this); // แบบนี้ไม่ได้

        // Case Sensitiv
        int num1 = 100;//ประกาศชนิดตัวแปร int ตัวแปร num1 ค่าข้อมูล=100
        int Num1 = 200;//ประกาศชนิดตัวแปร int ตัวแปร Num1 ค่าข้อมูล=200
        System.out.println(num1);//แสดงผลข้อมูลในตัวแปร num1
        System.out.println(Num1);//แสดงผลข้อมูลในตัวแปร Num1

    } // End of main
} // End of class