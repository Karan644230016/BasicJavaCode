package week13;//start of package

public class StringMethod_Raplace {//start of class
    public static void main(String[] args) {//start of main
        //การแทนที่คำ โดยคำสั่ง .replace() 
        String message = "Happy New Year 2020 | Happy Birthday 2020";
        //กำหนดชนิดตัวแปร String ตัวแปร massage 
        System.out.println("Before ==> " + message);//แสดงผลข้อความก่อนแทนที่
        String message1 = message.replace("2020","555");
        //เปลี่ยน 2020 ทุกคำ เป็น 555  ใส่ไว้ในตัวแปร message1
        String message2 = message.replaceFirst("2020","66"); 
        //เปลี่ยน 2020 เฉพาะคำแรก เป็น 66  ใส่ไว้ในตัวแปร message2
        System.out.println("After ==> " + message1+"\n"+message2);//แสดงผลลัพธ์ที่ได้เทียบความแตกต่างกัน
    }//end of main

}//end of class
