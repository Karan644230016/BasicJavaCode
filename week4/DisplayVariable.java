package week4;// Start of package

public class DisplayVariable {// Start of Class
    public static void main(String[] args) {// Start of method
        int num1 = 10; // ค่าเริ่มต้น = 10
        int num2 = 20; // ค่าเริ่มต้น = 20
        System.out.println(num1); //แสดลผลnum1
        System.out.println(num2);//แสดลผลnum2

        // ลองเขียนให้เป็นแบบเชื่อมต่อข้อความกับตัวแปร
        System.out.println("ค่าตัวแปรที่ 1 = " + num1);//แสดลผลข้อความ +num1
        System.out.println("ค่าตัวแปรที่ 2 = " + num2);//แสดลผลข้อความ +num2

        // การกำหนดค่าใหม่ให้กับตัวแปรเดิม
        num1 = 50; 
        // num2 = true; // ไม่ได้เพราะชนิดข้อมูลที่ประกาศไว้ไม่ตรงกับค่าที่ให้
        num2 = 100;
        System.out.println("ค่าตัวแปรที่ 1 = " + num1);//แสดลผลข้อความ +num1
        System.out.println("ค่าตัวแปรที่ 2 = " + num2);//แสดลผลข้อความ +num2
    } // End of main
} // End of class