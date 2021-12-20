package week13;//start of package

public class Stringmethod_StatEnd {//start of class
    public static void main(String[] args) {//start of main
        String fullname = "นายสมชาย เข็มขัด";//ประกาศชนิดตัวแปร String ตัวแปร fullmname

        //หาตำแหน่งของคำขึ้นต้น .startsWith()
        boolean a = fullname.startsWith("นาง");
        //ประกาศชนิดตัวแปร boolean ตัวแปร a หาคำขึ้นต้นว่าใช่ นาง หรือไม่

        if (a) {//ถ้าใช่ จะแสดงผลว่า เพศชาย
            System.out.println("เพศชาย");
        } else {//ถ้าไม่ใช่ จะแสดงผลว่า เพศหญิง
            System.out.println("เพศหญิง");
        }

        
        //หาตำแหน่งของคำจากด้านหลัง .endWith()
        String code = "123456789thjp";//ประกาศชนิดตัวแปร String ตัวแปร code
        boolean b = code.endsWith("th");
         //ประกาศชนิดตัวแปร boolean ตัวแปร b หาคำลงท้ายว่าใช่ th หรือไม่

        if (b) {//ถ้าใช่ จะแสดงผลว่า มาจากไทย
            System.out.println("มาจากไทย");
            
        } else {//ถ้าไม่ใช่ จะแสดงผลว่า มาจากไหนไม่รู้
            System.out.println("มาจากไหนไม่รู้");
        }

    }//end of main
}//end of class
