package week13;//start of package

public class StringMethod_Compare {//start of class
    public static void main(String[] args) {//start of main
        // การเปรียบเทียบ String
        String lastname1 = "saelim";// ประกาศชนิดข้อมูล String ตัวแปร lastname1 = saelim
        String lastname2 = "Saelim";// ประกาศชนิดข้อมูล String ตัวแปร lastname2 = Saelim

        boolean result = lastname1.equals(lastname2);
        //การใช้คำสั่งเปรียนเทียบ วิธีใช้ ตัวแปรที่ต้องการนำมาเทียบอันแรก.equals(ตัวแปรที่ต้องการนำมาเทียบอีกอัน)
        // ประกาศชนิดข้อมูล boolean ตัวแปร result = lastname1 เหมือนกับ lastname2 หรือไม่
        //โดยจะเห็นว่า lastname1 ต่างกับ lastname 2 ตรงที่ s กับ S
        System.out.println(result);
        //แสดงผลข้อมูลในตัวแปร result โดยจะเป็น false เพราะชนิดตัวแปรเป็น boolean  จะมีแค่ true , false

        if (result) { // หรือจะใส่ lastname1.equals(lastname2);
            System.out.println("เหมือนกัน");//แสดงผลข้อความ
        } else {//ถ้าไม่เป็นตามเงื่อนไข if จะมาทำ else
            System.out.println("ไม่เหมือนกัน");//แสดงผลข้อความ
        }
        System.out.println("=================");////แสดงผลข้อความ 

        // equalsIgnoreCase ไม่สนใจเรื่อง case sensitive (ตัวเล็ก ตัวใหญ่)
        if (lastname1.equalsIgnoreCase(lastname2)) {// s กับ S จะนับเป็นตัวเดียวกัน
            // วิธีใช้ตัวแปรที่ต้องการนำมาเทียบอันแรก.equals(ตัวแปรที่ต้องการนำมาเทียบอีกอัน)
            System.out.println("เหมือนกัน");//แสดงผลข้อความ
        } else {
            System.out.println("ไม่เหมือนกัน");//แสดงผลข้อความ
        }
    }//end of main

}//end of class
