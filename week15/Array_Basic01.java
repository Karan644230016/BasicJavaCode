package week15;//start of package
public class Array_Basic01 {//start of class
    public static void main(String[] args) {//start of main
        // การประกาศตัวแปรแบบ Array
        // แบบที่ 1 : ประกาสแบบกำหนดสมาชิก
        int[] number = { 1, 2, 3, 4, 5 };//ประกาศชนิดตัวแปร int อาเรย์ number แบบกำหนดสมาชิก 
        System.out.println(number.length);// นับจำนวน = 5 ตำแหน่งสูงสุด = 4
        System.out.println(number[4]); // แสดงผลอาเรย์ตำแหน่งที่ 4 

        // การเปลี่ยนค่าข้อมูลในอาเรย์
        number[4] = 88;// เปลี่ยนอาเรย์ตำแหน่งที่ 4 จาก 5 เป็น 88
        System.out.println(number[4]);// แสดงผลอาเรย์ตำแหน่งที่ 4 หลังจากเปลี่ยนค่าแล้ว

        // แบบที่ 2 : ประกาศแบบกำหนดขนาด
        // ประกาศอาเรย์
        // char [] alphabet; //ประกาศอาเรย์
        // alphabet = new char[26];//ส้างอาเรย์ มีขนาด 26 ช่อง
        //เหมือนกับวิธีด้านล่าง

        char alphabet[] = new char[26];//เขียนแบบต่อกัน
        alphabet[0] = 'a';//อาเรย์alphabet ตำแหน่งที่ 0 = a
        alphabet[1] = 'b';//อาเรย์alphabet ตำแหน่งที่ 1 = b
        alphabet[2] = 'c';//อาเรย์alphabet ตำแหน่งที่ 2 = c

        System.out.println(alphabet[2]);// แสดงผลอาเรย์ตำแหน่งที่ 2 หลังจากกำหนดค่าแล้ว
        System.out.println(alphabet.length);//นับขนาดอาเรย์

    }//end of main
}//end of class
