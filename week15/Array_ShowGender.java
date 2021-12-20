package week15;//start of package
public class Array_ShowGender {//start of class
    public static void main(String[] args) {//start of main
        String [] name = {"นายสมชาย เข็มกลัด","นางสาวสมหญิง เข็มกลัด","นางสาวสมใจ เข็มกลัด","นายสมติ เข็มกลัด"};
        //ประกาศชนิดข้อมูล String อาเรย์car แบบกำหนดค่า 
    
        int x = 0; //ประกาศชนิดข้อมูล int ตัวแปร x = 0 
        for (int i = 0; i < name.length; i++) {
            //คำสั่งวนรูป fori กำหนดชนิดตัวแปร int ตัวแปร i เริ่มต้นที่ 0 ถึง 4(ขนาดของอาเรย์  name) เพิ่มที่ละ 1
            x=x+1;// เพิ่มจาก 0 ไป 1 รอบที่ 1 , 1 ไป 2 รอบที่ 2  ไปเรื่อยๆจนครบรอบตามเงื่อนไขของ fori
            boolean check = name[i].startsWith("นาย"); 
            //ประกาศชนิดตัวแปร boolean  ตัวแปร check = อาเรย์name ตำแหน่งที่ 0-3 เช็คคำขื้นต้นว่า นาย ใช่หรือไม่
            if (check) {//ถ้าใช่ จะทำตามคำสั่งด้านล่าง
                System.out.print(x+"."+name[i]+" ");
                System.out.println("==> เพศชาย");
            } else {//ถ้าไม่เป็นตามเงื่อนไข if จะทำตามคำสั่งด้านล่าง
                System.out.print(x+"."+name[i]+" ");
                System.out.println("==> เพศหญิง");
            }
        }//end of fori
    }//end of main
}//end of class
