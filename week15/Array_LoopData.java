package week15;//start of package

public class Array_LoopData {//start of class
    public static void main(String[] args) {//start of main
        String[] car = { "BMW", "FORD", "TOYOTA", "NISSAN" };
        //ประกาศชนิดข้อมูล String อาเรย์car แบบกำหนดค่า 
        // วนรูปแสดงค่าข้อมูลในอาเรย์
        for (int i = 0; i < car.length; i++) {
        //คำสั่งวนรูป fori กำหนดชนิดตัวแปร int ตัวแปร i เริ่มต้นที่ 0 ถึง 4(ขนาดของอาเรย์ car) เพิ่มที่ละ 1
            System.out.println("สมาชิกตำแหน่งที่ " + i + " = " + car[i]);
        //แสดงผลทีละตำแหน่ง แต่จะเริ่มที่ตำแหน่งที่ 0

        }
        for (int i = 0; i < car.length; i++) {
            //คำสั่งวนรูป fori กำหนดชนิดตัวแปร int ตัวแปร i เริ่มต้นที่ 0 ถึง 4(ขนาดของอาเรย์ car) เพิ่มที่ละ 1
            System.out.println("ช่องที่ "+(i+1)+" คือ "+car[i]);
            //แสดงผลทีละตำแหน่ง แต่จะเริ่มที่ตำแหน่งที่ 1
        }

    }//end of main
}//end of class
