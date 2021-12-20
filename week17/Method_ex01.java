package week17;//start of package
public class Method_ex01 {//start of main
    public static void main(String[] args) {//star of class ( method หลัก)
        // method แบบที่ 1 ไม่มีการส่งค่าจาก method main และ ไม่มีการคืนค่ากลับจาก method ลูก
        name();//เรียกคำสั่งใน method name
       openfile();//เรียกคำสั่งใน method openfile
       playfile();//เรียกคำสั่งใน method playfile
       stopfile();//เรียกคำสั่งใน method stopfile
       cloasefile();//เรียกคำสั่งใน method cloasefile

    }//end of main ( method หลัก)

     static void name(){//start  of method 
         // void ไม่ส่งค่าคืน
        int a =1;//ประกาศชนิดตัวแปร int ตัวแปร a = 1 
        a=a+2;// a=1+2  
        System.out.println("Karan"+a);//แสดงผลข้อความ + ผลบวกตัวแปร a
    }//end of method 
    public static void openfile(){//start of method
        System.out.println("open file");//แสดงผลข้อความ
    }//end of method
    public static void playfile(){//start of method
        System.out.println("play file");//แสดงผลข้อความ
    }//end of method
    public static void stopfile(){//start of method
        System.out.println("stop file");//แสดงผลข้อความ
    }//end of method
    public static void cloasefile(){//start of method
        System.out.println("close file");//แสดงผลข้อความ
    }//end of method
}//end of class
