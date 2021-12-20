package week11;// Start of package

public class While_DecreaseNumber {// Start of Class
    public static void main(String[] args) {// Start of method
        
       int count = 20;//ประกาศชนิดตัวแปร int ตัวแปร count =20
        while (count >=0) {//คำสั่งวนรูป while โดยมีเงื่อนไข count >=20
            System.out.println(count);//แสดงผลค่าตัวเลขตั้งแต่ 20 - 0 
            count--;//โดยลบค่า count ทีละ 1 หยุดที่ 0 ตามเงื่อนไข while
        }// end of while
    }//end of main
}//end of class
