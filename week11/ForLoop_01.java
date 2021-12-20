package week11;// Start of package

public class ForLoop_01 {// Start of Class
    public static void main(String[] args) {// Start of method
        //int count = 1; // ประกาศชนิดข้อมูล int ตัวแปร count =1
        // while (count <= 100) { // while คำสั่งวนซ้ำ  เงื่อนไข count<=100
        // System.out.println("รอบที่ "+count+" Java");//แสดงผลข้อความ + ข้อมูลจากตัวแปร
        // count++; // update รอบ บวกเพิ่มทีละ 1  จนถึง 100
        // }

        // for (int count = 1; count <= 100; count++) { // เริ่มต้นที่ 1 ถึง 100 เพิ่มที่ละ 1
        // System.out.println("รอบที่ "+count+" Java");//แสดงผลข้อความ + ข้อมูลไปจนถึง 100
        // }

        // int sum = 0;// ประกาศชนิดข้อมูล int ตัวแปร sum =0 
        // for (int number = 1; number <= 10; number++) {//start of for
        //     //เริ่มต้น 1 ถึง 10 เพิ่มทีละ 1
        //     sum = sum + number;// 0+1 (ที่เริ่มจาก 1 ถึง 10 ) 
        //                        // 1+2  บวกแบบนี้ไปเรื่อยๆ จนถึง +10 จะเป็นครั้งสุดท้าย
        //     System.out.println("รอบที่ " + number + " ผลบวกเท่ากับ " + sum);//แสดงผลข้อความ + ข้อมูลจากตัวแปร
        // }//end of for
        // System.out.println("รวมเท่ากับ "+sum);//แสดงผลข้อความ + ข้อมูลจากตัวแปร

        
        int number = 1;//ประกาศชนิดข้อมูล int ตัวแปร number =01
        int sum = 0;//ประกาศชนิดข้อมูล int ตัวแปร sum =0 
        while (number<=10) {//start of while
            //number ไม่เกิน 10
        sum = sum+number;//sum + number 
        System.out.println("รอบที่ "+number+" ผลบวกเท่ากับ "+ sum);//แสดงผลข้อความ + ข้อมูลจากตัวแปร
        number++;// อัปเดตรอบ เพิ่มค่า number ที่ละ1

        }//end of while
        System.out.println("รวมเท่ากับ "+sum);//แสดงผลข้อความ + ข้อมูลจากตัวแปร
    } // End of main
} // End of class