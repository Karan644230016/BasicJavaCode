package week17;//start od package

public class Method_ex04 {//start of class
    public static void main(String[] args) {//start of method หลัก
        // method แบบที่ 4 มีการรับค่าที่ส่งมาจาก main program และลูกส่งค่าออกคืนแม่
        //plus (5.5,9);
        System.out.println(plus (5.5,9));
        System.out.println(plus (10.5,5));
    }
    static double plus (double a,int b){
        double c =a+b;
        return c;

        // return a+b;
    }
}
