package week3;// Start of package

class Variable {// Start of Class
    public static void main(String[] args) {// Start of method
        // นิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น  ชนิดข้อมูล ชื่อตัวแปร;
        int number1;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        // จบส่วนนี้ให้ทดสอบกด run ดู จะพบว่า run ได้ปกติ

        // นิยามตัวแบบระบุค่าเริ่มต้น  ชนิดข้อมูล ชื่อตัวแปร = ค่าเริ่มต้น;
        int number4 = 10;
        float number5 = 20.5f; // ลองไม่ใส่ f ก่อน
        char alphabet1 = 'A';
        boolean status1 = true;

        // ลองตั้งชื่อตัวแปรให้ซ้ำกับด้านบนดู
        // จบส่วนนี้ให้ทดสอบกด run ดู จะพบว่า run ได้ปกติ

        // นิยามตัวแปรแบบหลายบรรทัดในครั้งเดียว **ต้องมีชนิดข้อมูลที่เหมือนกัน
        //  ชนิดข้อมูล ชื่อตัวแปร=ค่าคงที่, ชื่อตัวแปร=ค่าคงที่, ชื่อตัวแปร;
        // เขียนแยกก่อน
        // int a;
        // int b;
        // int c;
        // ยุบให้เหลือ บรรทัดเดียว
        int a, b, c;

        // สามารถใส่ค่าเริ่มต้นลงไปได้เลยเช่นกัน
        // int a = 0, b = 1, c = 2;
    } // End of main
} // End of class