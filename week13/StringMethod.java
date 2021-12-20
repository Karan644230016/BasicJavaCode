package week13;//start of package
public class StringMethod {//start of class
    public static void main(String[] args) {//start of main
        String name = "Karan";// ประกาศชนิดข้อมูล String ตัวแปร name = karan
        String city = new String("Nakhon pathom");
        // ประกาศชนิดข้อมูล String ตัวแปร city โดยกำหนดค่าใหม่เป็น Nakhon pathom
       

        System.out.println(name);//แสดงผลข้อมูลในตัวแปร name
        System.out.println(city);//แสดงผลข้อมูลในตัวแปร city

            //การต่อสตริง  concatenation ใช้เครื่องหมาย +
        System.out.println(name+city);//แสดงผลข้อมูลในตัวแปร name กับตัวแปร city

        String result = name+city;//ประกาศชนิดข้อมูล String ตัวแปร result = ข้อมูลใตัวแปร name+city
        System.out.println(result);//แสดงผลข้อมูลในตัวแปร result

        String result2 = name+city+".com";
        //ประกาศชนิดข้อมูล String ตัวแปร result2 = ข้อมูลใตัวแปร name + city + .com
        System.out.println(result2);//แสดงผลข้อมูลในตัวแปร result2

        System.out.println(result2.concat(".ac.th"));//.concat ทำหน้าที่คล้ายๆ +
        //แสดงผลข้อมูลในตัวแปร result2 + .ac.th

        //หาความยาวของ String  .Length();       
        System.out.println(name.length());
        //แสดงขนาดหรือความยาว ข้อมูลในตัวแปร โดยใส่ชื่อตัวแปรตามด้วย.length

        int count = name.length();//หาขนาดหรือความยาว ข้อมูลในตัวแปร โดยใส่ชื่อตัวแปรตามด้วย.length
        System.out.println(count);//แสดงผลข้อมูลใน count ซึ่งคือขนาดของตัวแปร name

         // หาตำแหน่งตัวอักษรในข้อความ .charAt(); โดยใน () จะใส่ตำแหน่งที่ต้องการหา

         System.out.println(name.charAt(3));//แสดงผลตำแหน่งที่3ของตัวแปร name คือ a โดยการนับจะเริ่มจาก0

         char characters = name.charAt(3);//หาตำแหน่งที่3ของตัวแปร name คือ a โดยการนับจะเริ่มจาก0
         System.out.println(characters);//แสดงผลข้อมูลตำแหน่งที่ในตัวแปร character 
         



    }//end of main
}//end of class
