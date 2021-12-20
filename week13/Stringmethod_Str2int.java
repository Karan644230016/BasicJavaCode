package week13;//start of package

public class Stringmethod_Str2int {//start of class
    public static void main(String[] args) {//start of main
        String s1 = "500";//ประกาศชนิดตัวแปร String ตัวแปร s1 = 500
        int num1 = 100;//ประกาศชนิดตัวแปร int ตัวแปร num1 = 100

        System.out.println(s1+num1);//แสดงผลข้อมูลในตัวแปร s1+num1

        // Integer.parseInt() แปลง  String เป็น ตัวเลขจำนวนเต็ม
        //วิธีใช้   ชื่อเต็มชนิดตัวแปรที่ประกาศใหม่.parseInt(ตัวแปรที่ต้องการเปลี่ยน)
        //ถ้าอยากให้เปลี่ยนเป็นจำนวนจริง เปลี่ยน parseInt เป็น parseDouble แทน
        int num2 = Integer.parseInt(s1);
        //ประกาศชนิดตัวแปร int ตัวแปร num2  แปรงข้อมูลในตัวแปร s1 เป็นจำนวนเต็ม
        System.out.println(num2+num1);//แสดงผลลัพธ์หลักจากที่เปลี่ยนแล้ว จะเห็นว่าสามาระบวกกันได้
    }//end of main
}//end of class
