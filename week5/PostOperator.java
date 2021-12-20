package week5;// Start of package

public class PostOperator {// Start of Class
    public static void main(String[] args){ // Start of method
    
        int i = 20;// ประกาศชนิดข้อมูล int ตัวแปร i มีค่า 20
        int result;// ประกาศชนิดข้อมูล int ผลลัพธ์

        System.out.println("i before calculate is "+i);//แสดงผลข้อความ + ข้อมูลจากตัวแปร i

        result = 20*i++;  //ผลลัพธ์  20*20  แล้ว i+1 

        System.out.println("Result is "+result);//ผลลัพธ์  20*20
        System.out.println("i after calculate is "+i);//i+1 

    } // End of main
} // End of class
