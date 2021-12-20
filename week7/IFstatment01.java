package week7;// Start of package

public class IFstatment01 {// Start of Class
    public static void main(String[] args) {// Start of method

        // // ตัวอย่างที่ 1 ถ้าต้องการดูส่วนไหนให้เอาคอมเมนท์ออก
        // if (20 > 18) {
        // System.out.println("20 is greater than 18");
        // }
        // System.out.println("End of Program");
        // // ----------------------------------------

        // // ตัวอย่างที่ 2
        // boolean result = 20 > 18;
        // if (result) {
        // System.out.println("20 is greater than 18");
        // }
        // System.out.println("End of Program");
        // // ----------------------------------------

        // // ตัวอย่างที่ 3
        // int x = 20;
        // int y = 18;
        // if (x > y) {
        //     System.out.println("x is greater than y");
        // }
        // System.out.println("End of Program");
        // // ----------------------------------------

        // ตัวอย่างที่ 4
        int x = 20;// ประกาศชนิดข้อมูล int ตัวแปร x = 20
        int y = 15;// ประกาศชนิดข้อมูล int ตัวแปร y = 15
        boolean z = x > y; // ประกาศชนิดข้อมูล boolean ตัวแปร z = 20>15

        if (z) { // (20>15) , (x>y)   ถ้าเป็นจริงจะแสดงผลลัพธ์ด้านล่าง  ถ้าไม่ใช่จะออกไปนอกปีกกา
            System.out.println(" 20 is greater than 15");
        }
        System.out.println("end of program");// ถ้าไม่ตรงตามเงื่อนไขจะลงมาตรงนี้
    } // End of main
} // End of class
