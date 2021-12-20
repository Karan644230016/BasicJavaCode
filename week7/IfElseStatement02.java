package week7;// Start of package
public class IfElseStatement02 {// Start of Class
    public static void main(String[] args) {// Start of method
        int age = 18;// ประกาศชนิดข้อมูล int ตัวแปร age = 18
        // เขียนด้วยคำสั่ง if .... else....
        if (age>=15) {
            //  ถ้า age มากกว่าหรือเท่ากับ 15 จะแสดงผลลัพธ์ ด้านล่างในปีกกา แต่ถ้าไม่ตรงกับคำสั่ง จะไป else และแสดงผลลัพธ์นั้นแทน
            System.out.println("man/women");//แสดงผลข้อความ
        } else {
            System.out.println("boy/girl");//แสดงผลข้อความ
        }

        // เขียนด้วยคำสั่ง If อย่างเดียว
        // if (age<15) { age น้อยกว่า 15 จะแสดงผลลัพธ์ด่านล่าง
        //     System.out.println("boy/girl");
        // }
        // if (age>=15) {age มากกว่า 15 จะแสดงผลลัพธ์ด่านล่าง
        //     System.out.println("man/woman");
        // }
        System.out.println("End of Program");//แสดงผลข้อความ จบการทำงาน
    } // End of main
} // End of class
