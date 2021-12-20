package week17;//start of package
public class Array_ForEach {//start of class
    public static void main(String[] args) {//start of main
        String [] name = {"นายสมชาย เข็มกลัด","นางสาวสมหญิง เข็มกลัด","นางสาวสมใจ เข็มกลัด","นายสมติ เข็มกลัด"};
        //ประกาศชนิดตัวแปร String อาเรย์ name แบบกำหนดข้อมูล
        System.out.println(name.length);//แสดงผลขนาดอาเรย์ name 

        int i =1;//ประกาศชนิดตัวแปร int ตัวแปร i = 1 เพื่อทำเลขนำหน้าแต่ละชื่อ
        for (String showname : name) {//ประกาศชนิดตัวแปร String ตัวแปร showname เก็บข้อมูลของอาเรย์ name ทั้งหมด
            System.out.println(i+" "+showname);//แสดงผลข้อมูลในตัวแปร i และ showname
            i++;//อีปเดตรอบเพิ่มค่า i ทีละ1
        }

        int [] number ={1,2,3,4,5};//ประกาศชนิดตัวแปร String อาเรย์ number แบบกำหนดข้อมูล
        int b =0;//ประกาศชนิดตัวแปร int ตัวแปร b = 0 
        for(int  data : number){//ประกาศชนิดตัวแปร int ตัวแปร data เก็บข้อมูลของอาเรย์ number ทั้งหมด
            b=b+data;// b = b+ 1,2,3,4,5 ไปเรื่อยๆ   
            System.out.println(b);//แสดงผลข้อมูลตัวแปร b
        }

    }//end of main
}//end of class
