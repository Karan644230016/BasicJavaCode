package week17;//start of package

public class Method_ex03 {//start of class
    public static void main(String[] args) {//stat of method หลัก
        // method แบบที่ 3 ไม่มีการรับค่าที่ส่งมาจาก main programแต่ลูกส่งค่าออกคืนแม่
        int phone =getphonenumber();//ประกาศชนิดตัวแปร int ตัวแปร phone รับข้อมูลจาก method ย่อย phone
        System.out.println(phone);//แสดงผลข้อมูลที่รับมาจาก method getphonenumber
        int luckey =999;//ประกาศชนิดตัวแปร int ตัวแปร luckey = 999
        int newphone = phone+luckey;
        //ประกาศชนิดตัวแปร int ตัวแปร newphone = ข้อมูลที่รับมาจาก method getphonenumber+999
        System.out.println(newphone);//แสดงผลข้อมูลที่บวกกันแล้วจากตัวแปร newphone

    }//end of method หลัก
    static int getphonenumber (  ){//start of method ย่อย
        return 46548911;//ส่งค่าคืน method หลัก 

    }//end of method ย่อย
}//end of class
