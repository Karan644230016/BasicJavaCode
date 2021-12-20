package week12;//start of package

public class DoWhile01 {//start of class
    public static void main(String[] args) {//start of main
        int i = 6;//ประกาศชนิดตัวแปร int ตัวแปร i =6
        do { //คำสั่งวนรูป dowhile คือทำที่ do ก่อน แล้วจึงไปทำ while
            System.out.print(i + " ");//แสดงผลข้อมูล
            i=i+2;  // i = 6+2
        } while (i <= 7); // คำสั่งวนรูป while เงือนไข  i<=7
        System.out.println("555");  //แสดงผลข้อความ

        System.out.println();//แสดงผลเว้นบรรทัด
        
        int j = 1;//ประกาศชนิดตัวแปร int ตัวแปร j =1
       while (j <= 5) { // คำสั่งวนรูป while เงือนไข  j<=5
            System.out.print(j + " ");//แสดงผลข้อมูลตัวแปร + ข้อความ
            j++;//อัปเดตรอบ เพิ่มค่า ่ ทีละ 1
        }//end of while
    }//end of main
}//end of class
