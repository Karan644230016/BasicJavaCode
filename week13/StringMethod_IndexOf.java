package week13;//start of package

public class StringMethod_IndexOf {//start of class
    public static void main(String[] args) {//start of main
        String fullname = "  Suksawat Saelim   ";// ประกาศชนิดข้อมูล String ตัวแปร fullname = Suksawat Saelim
        //หาตำแหน่งที่หา ในสิ่งที่ต้องการหา ถ้าหาไม่พบ จะเป็น -1
        //วิธีใช้  ตัวแปร.indexOf("คำที่ต้องการหา")
        System.out.println(fullname.indexOf("wat"));//แสดงผลตำแหน่งของ wat
        System.out.println(fullname.indexOf("java"));//แสดงผลตำแหน่งของ java

        // ตัดช่องว่างซ้ายขวาของสตริงออก วิธีใช้  ตัวแปร.trim()
        String cleanName = fullname.trim();
        //ประกาศชนิดข้อมูล String ตัวแปร cleanName โดยตัดช่องว่างของตัวแปร fullname ออก
        System.out.println(cleanName.indexOf("wat"));
        //System.out.println(fullname.trim().indexOf("wat")); เหมือนกับด้านบน แต่เขียนติดกันแทน

        // ตัวพิมพ์ใหญ่ ตัวพิมพ์เล็ก ด้วย .toUpperCase() และ .toLowerCase()
        //วิธีใช้ ตัวแปร.toUpperCase() หรือ .toLowerCase() 
        System.out.println(fullname);//แสดงผลข้อมูลในตัวแปร fullname
        System.out.println(fullname.toUpperCase());//แสดงผลข้อมูลที่เป็นตัวพิมพ์ใหญ่ทั้งหมด
        System.out.println(fullname.toLowerCase());//แสดงผลข้อมูลที่เป็นตัวพิมพ์เล็กทั้งหมด

        // ตัดสตริง ด้วย .substring( , )
        //วิธีใช้ ตัวแปร.substring(ตำแหน่งเริ่มต้นที่ต้องการตัด , ตำแหน่งสุดท้ายที่ต้องการตัดถึง )
        String uni = "Nakhon Pathom Rajabhat University";//ประกาศชนิดข้อมูล String ตัวแปร uni
        String s1 = uni.substring(0, 6);
        //ประกาศชนิดข้อมูล String ตัวแปร s1 ตัดข้อมูลในตัวแปร uni ตั้งแต่ตำแหน่งที่ 0 ถึง 6 เหลือแค่ Nakhon

        System.out.println(s1);//แสดงผลข้อมูลในตัวแปร s1
        System.out.println(s1 + "Thailand");//แสดงผลข้อมูลในตัวแปร s1 + thailand

    }//end of main

}//end of class
