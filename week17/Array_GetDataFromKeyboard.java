package week17;//start of package
import java.util.Scanner;//start of import รับเข้าข้อมูลจาก keyboard
public class Array_GetDataFromKeyboard {// start of class
    public static void main(String[] args) {// start of main
        Scanner kb = new Scanner(System.in);// รับเข้าข้อมูลจาก keyboard
        int[] number = new int[2];// ประกาศชนิดตัวแปร int อาเรย์ number = สร้างอาเรย์number ว่างไว้ขนาด2ตัว
        for (int i = 0; i < number.length; i++) {
            // คำสั่งวนรูป fori ประกาศชนิดตัวแปร int ตัวแปร i เงื่อนไข i ต้องน้อยกว่าขนาดของ number
            // อัปเดตค่า i เพิ่มที่ละ 1
            System.out.print("Enter number : ");// แสดงผลข้อความที่สอดคล้องกับที่จะรับเข้าข้อมูลจาก keyboard
            number[i] = kb.nextInt();// ใส่ข้อมูลอาเรย์ number ทีละตำแหน่ง เริ่มจากตำแหน่ง 0
        }
        int sum = 0;//ประกาศชนิดตัวแปร int ตัวแปร sum = 0 
        System.out.print("{");//แสดงผลปีกกาw
        for (int i : number) {// คำสั่ง fore ประกาศชนิดตัวแปร int ตัวแปร i รับค่าทั้งหมดของอาเรย์ number มาอยู่ในตัวแปร i
            System.out.print(i);//แสดงผลข้อมูลในตัวแปร i
                if (i<=number[0]) {//ถ้า ข้อมูลในตัวแปร i <= ข้อมูลในอาเรย์ number ตำแหน่งที่ 0 จะแสดงผล ,
                    System.out.print(",");
                }
                sum = sum + i;//หาผลรวมทั้งหมดในตัวแปร i มาอยู๋ในตัวแปร sum
            }              
        System.out.println("}");//แสดงผลข้อความ }
        System.out.println(sum);//แสดงผลรวม ที่อยู่ในตัวแปร i
        kb.close();//ปิดใช้งาน keyboard
    }//end of main
}//end of class
