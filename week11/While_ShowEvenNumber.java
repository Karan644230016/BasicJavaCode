package week11;//start of package

public class While_ShowEvenNumber {//start of class
    public static void main(String[] args) {//start of main
        //วิธีที่ 1
        // int count = 1;  //ประกาศชนิดตัวแปร int ตัวแปร count = 1
        // while (count < 11) {  //คำสั่งวนรูป while  เงื่อนไข count < 11
        //     System.out.print(count*2 +" ");  // แสดงผลข้อมูล count *2
        //     count++;  //  อัปเดตรอบ เพิ่มค่า count ทีละ1
        // } //end of while

        //วิธีที่ 2
        int count = 2;//ประกาศชนิดตัวแปร int ตัวแปร count = 2
        while (count <= 20) { //คำสั่งวนรูป while  เงื่อนไข count < 20
            System.out.print(count +" ");//แสดงผลข้อมูล count
            count+=2;  //count = count+2    อัปเดตรอบ เพิ่มค่า count ทีละ2
        }// end of while
    }//end of main
}//end of class