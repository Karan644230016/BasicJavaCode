package week15;//start of package

public class Array_InsertOddNumber {//start of class
    public static void main(String[] args) {//start of main
        int [] x = new int [10] ;//ประกาศชนิดตัวแปร int อาเรย์ x กำหนดขนาด 10 ช่อง
        System.out.println(x.length);//แสดงผลขนาด ของอาเรย์x
        for (int i = 0; i < x.length; i++) {
            //คำสั่งวนรูป fori กำหนดชนิดตัวแปร int ตัวแปร i เริ่มต้นที่ 0 ถึง 9 เพิ่มที่ละ 1
            System.out.print(x[i]+" "); // แสดงผลอาเรย์ก่อนเพิ่มข้อมูล

        }
        //เริ่มเพิ่มข้อมูลเข้าไปในอาเรย์ทั้ง 10 ช่อง
        int number =1;//ประกาศชนิดตัวแปร int ตัวแปร number = 1
        for (int i = 0; i < x.length; i++) {
            //คำสั่งวนรูป fori กำหนดชนิดตัวแปร int ตัวแปร i เริ่มต้นที่ 0 ถึง 9 เพิ่มตำแหน่งที่ละ 1
                x[i] = number;//อาเรย์ x ตำแหน่ง i (เริ่มต้นตำแหน่ง 0-9) =1,1+2,3+2 ไปเรื่อยๆจนถึงตำแหน่งที่ 9
                number = number+2;
                System.out.print(x[i]+" "); // แสดงผลอาเรย์หลังเพิ่มข้อมูล
        }
       
    }//end of main
}//end of class
