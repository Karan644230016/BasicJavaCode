package week13;//start of package

public class StringMethod_Int2Str {//start of class
    public static void main(String[] args) {//start of main
        int number1 = 100;//ประกาศชนิดตัวแปร int ตัวแปร number1 = 100
        double number2 = 50.9;//ประกาศชนิดตัวแปร double ตัวแปร number2 = 50.9
        System.out.println("Before ==> "+(number1+number2));//แสดงผลข้อความ+ข้อมูลในตัวแปร
        
        //แปรงจำนวนเต็ม/จำนวนจริง เป็น string โดยคำสั่ง ชื่อเต็มชนิดตัวแปร.toString(ตัวแปรที่ต้องการเปลี่ยน)
        String s1 = Integer.toString(number1);//ประกาศชนิดตัวแปร string ตัวแปร s1 แปรงจำนวนเต็มเป็น string
        String s2 = Double.toString(number2);//ประกาศชนิดตัวแปร string ตัวแปร s2 แปรงจำนวนจริงเป็น string
        System.out.println(s1+s2+number2);//แสดงผลข้อมูลในตัวแปร 
        // เมื่อแปรงเป็น String แล้วจะเป็นข้อความ ไม่เหมือนก่อนที่เป็นตัวเลขสามารถนำมาบวกกันได้
        
        String v1 = String.valueOf(number1);
        String v2 = String.valueOf(number2);
        System.out.println(v1+v2);
    }//end of main

}//end of class
