package week5;// Start of package

public class CompareData {// Start of Class
    public static void main(String[] args) {// Start of method
        // การเปรียนเทียบผลลัพธ์จะได้ True or False
        int a = 10;//ประกาศชนิดตัวแปร int ตัวแปร a  ค่าของตัวแปร 10
        int b = 5;//ประกาศชนิดตัวแปร int ตัวแปร b  ค่าของตัวแปร 5

        System.out.println(a + " มีค่าเท่ากับ " + b + " หรือไม่ ? " + (a == b));//แสดงผลข้อมูล ถูกหรือผิด
        System.out.println(a + " มีค่าไม่เท่ากับ " + b + " หรือไม่ ? " + (a != b));//แสดงผลข้อมูล ถูกหรือผิด
        System.out.println(a + " มีค่าน้อยกว่า " + b + " หรือไม่ ? " + (a < b));//แสดงผลข้อมูล ถูกหรือผิด
        System.out.println(a + " มีค่ามากกว่า " + b + " หรือไม่ ? " + (a > b));//แสดงผลข้อมูล ถูกหรือผิด
        System.out.println(a + " มีค่าน้อยกว่าหรือเท่ากับ " + b + " หรือไม่ ? " + (a <= b));//แสดงผลข้อมูล ถูกหรือผิด
        System.out.println(a + " มีค่ามากกว่าหรือเท่ากับ " + b + " หรือไม่ ? " + (a >= b));//แสดงผลข้อมูล ถูกหรือผิด

        boolean c = a==b;//ประกาศชนิดตัวแปร boolean(ถูกหรือผิด) ตัวแปร c  ค่าของตัวแปร a เท่ากับ b หรือไม่
        System.out.println(c);//แสดงผลข้อมูลของตัวแปร c

    } // End of main
} // End of class