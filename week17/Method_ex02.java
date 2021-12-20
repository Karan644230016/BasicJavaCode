package week17;//start of package

public class Method_ex02 {//start of class
    public static void main(String[] args) {//start of main
        // method แบบที่  มีการรับค่าที่ส่งมาจาก main program แต่ไม่มีการส่งค่าออก
        display ("ดีใจจัง เรียนใหล้จบแล้ว");//ส่งข้อมูลไปให้ method display
        display ("ไปตลาดให้หน่อยลูก");//ส่งข้อมูลไปให้ method display
        fullname ("Karan","Khanthong");//ส่งข้อมูลไปให้ method fullname
        plus (54,24);//ส่งข้อมูลไปให้ method plu
        
    }//end of method
    static void display(String x){//start of method
        //การที่จะรับค่า จะต้องประกาศชนิดตัวแปรและตัวแปรไว้รับข้อมูลที่ส่งมา
        System.out.println(x);//แสดงผลข้อมูลจากตัวแปร x ที่รับค่ามา

    }//end of method
    static void fullname(String firstname,String lastname){//method
        System.out.println(firstname+" "+lastname);
        //แสดงผลข้อมูลจากตัวแปร firstname และ lastname ที่รับค่ามา ถ้ามีหลายค่าให้ใส , คั่นไว้ 

    }//end of method
    static void plus(int num1,int num2){//method
        int result = num1+num2;//ประกาศชนิดข้อมูล int ตัวแปร result = ข้อมูลที่รับมาจาก num1+num2
        System.out.println("ผลลัพธืเท่ากับ "+result);
        //แสดงผลข้อมูลจากตัวแปร result

    }//end of method
}//end of class
