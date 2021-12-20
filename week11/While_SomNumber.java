package week11;//start of package

public class While_SomNumber {//start of class
    public static void main(String[] args) {//start of main
        int number = 1;//ประกาศชนิดตัวแปร int ตัวแปร number  =1
        int sum = 0;//ประกาศชนิดตัวแปร int ตัวแปร sum  = 0

        while (number<=10) { //คำสั่งวนรูป while เงื่อนไข number <= 10
            sum = sum+number; //  sum=0+1
                              //  sum=1+2  ไปเรื่อยๆจนถึง +10 ตามเงื่อนไข while 
            System.out.println("รอบที่ " + number +" ผลบวกเท่ากับ "+sum);//แสดงผลข้อความ + ข้อมูล
            number++;//อัปเดตรอบ เพิ่มค่า number ทีละ 1
            

        }//end of while
        System.out.println("รวมเท่ากับ "+sum);//แสดงผลรวม sum สุดท้าย
    }//end of main
}//end of class
