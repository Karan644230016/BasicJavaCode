package week5;// Start of package

public class PreOperator {// Start of Class
    public static void main(String[] args) { // Start of method
   
        int a = 5;// ประกาศชนิดข้อมูล int ตัวแปร a มีค่า 5
        int b = 4;// ประกาศชนิดข้อมูล int ตัวแปร b มีค่า 4

        System.out.println("a before calculate is "+a);//แสดงผลข้อความ + ข้อมูลจากตัวแปร
        System.out.println("b before calculate is "+b);//แสดงผลข้อความ + ข้อมูลจากตัวแปร

        int z = a + ++b;    // ประกาศชนิดข้อมูล int ตัวแปร z    a+(1+b)

        System.out.println("Result is "+z);//แสดงผลข้อความ + ข้อมูลจากตัวแปร  5+5
        System.out.println("a after calculate is "+a);//แสดงผลข้อความ + ข้อมูลจากตัวแปร  5
        System.out.println("b after calculate is "+b);//แสดงผลข้อความ + ข้อมูลจากตัวแปร  1+4

    } // End of main
} // End of class